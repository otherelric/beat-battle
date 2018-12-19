import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

declare var require: any;

@Injectable()
export class SpotifyService {

  private searchUrl: string;

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
    spotifyApi.setAccessToken('BQDHWuPqhUpw4IHAMfkgb8DBxDcJnsSe6o9TVC7c4-zu13xIlyKwXXCFjmSyzHNtNWO_WOt9QHIi1B_SIR6L0cxXLRqQm-cnD8ugVIn25wvvDBJQh7lRFa0MovEcwpHKH21f9bGrJKAzM4GX1M6gBSR-qOuXaA');
    spotifyApi.searchTracks(str)
    .then(function(data) {
      console.log('Search by:' + str, data.body);
    }, function(err) {
      console.error(err);
    });
    return this.http.get(this.searchUrl);
  }
}
