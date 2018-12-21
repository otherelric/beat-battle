import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Song } from '../types/song';

declare var require: any;

@Injectable()
export class SpotifyService {

  private searchUrl: string;

  song: Song;

  constructor(private http: HttpClient) { }

  searchMusic(str: string) {
    const SpotifyWebApi = require('spotify-web-api-node');

    // credentials are optional
    const spotifyApi = new SpotifyWebApi({
      clientId: 'bbc1f31746354b619c6e0d2839b5099b',
      clientSecret: 'bf60196fd78d4c9eac5a60a7ab7ae8d7',
      redirectUri: 'localhost:8888/callback'
    });

    // tslint:disable-next-line:max-line-length
    spotifyApi.setAccessToken('BQAhND-N_rXTuMaDJo-KG0QLZvNcWI8rRp224fhyBzeRUNzDo6yzTqhdFdH5xkEULdVKr_pwJ9ocW54AKM0N_USjhFv0QX4js8dfpumuAfxxl2U51ouimNhRF6qS4Nq4ZSDG8Kme8IhiaygbMYjyCuIdAnQDPw');
    spotifyApi.searchTracks(str)
    .then(function(data) {
      // this.song = new Song();
      // this.song.id = data.body.tracks.items[0].id;
      // console.log('tell me info: ' + this.song.id);
      console.log('Search by: ' + str, data.body);
      console.log('GET FIRST ARTIST: ' + data.body.tracks.items[0].artists[0].name);
      // this.song.name = data.body.tracks.items[0].name;
    }, function(err) {
      console.error(err);
    });
    // return this.http.get(this.searchUrl);
    // this.song.name = "hardcode";
    return this.song;
  }
}
