import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

declare var require: any;

@Injectable()
export class SpotifyService {

  private searchUrl: string;

  constructor(private http: HttpClient) { }

  searchMusic(str: string) {

    const SpotifyWebApi = require('spotify-web-api-node');

    var obj;
    // credentials are optional
    const spotifyApi = new SpotifyWebApi({
      clientId: 'bbc1f31746354b619c6e0d2839b5099b',
      clientSecret: 'bf60196fd78d4c9eac5a60a7ab7ae8d7',
      redirectUri: 'localhost:8888/callback'
    });

    // tslint:disable-next-line:max-line-length
    spotifyApi.setAccessToken('BQDVP4yU6BZd2FNWXXG3YMod4eS-CU5AcQdxMSTqS81rX6L2wH071oXo0dRV9Mav7mufy1eOvu8G48ebeZjnmL-llaYxhNeGjMJhTCXlUNh3wKmRKcRJxP-4uAfOp1o2-86IQFcEMp2EKm8PfoGMvf5SNOPO9gs');
    spotifyApi.searchTracks(str)

    .then(function(data) {
      console.log('Search by: ' + str, data.body);
      console.log('GET FIRST ARTIST: ' + data.body.tracks.items[0].artists[0].name);
    }, function(err) {
      console.error(err);
    });
    return this.http.get(this.searchUrl);
  }
}
