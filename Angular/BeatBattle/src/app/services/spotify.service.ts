import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Song } from '../types/song';

declare var require: any;

@Injectable()
export class SpotifyService {

  private searchUrl: string;

  private song: Song;

  constructor(private http: HttpClient) { }

  searchMusic(str: string) {

    this.song = new Song();

    const SpotifyWebApi = require('spotify-web-api-node');

    // credentials are optional
    const spotifyApi = new SpotifyWebApi({
      clientId: 'bbc1f31746354b619c6e0d2839b5099b',
      clientSecret: 'bf60196fd78d4c9eac5a60a7ab7ae8d7',
      redirectUri: 'localhost:8888/callback'
    });

    // tslint:disable-next-line:max-line-length
    spotifyApi.setAccessToken('BQDuy5VfWywXqUMc29XoPn8CH6AUqWpFUv7mvQg8bk5_eXGLk7OVBpxaIPVSv_sTrq0Np1-9d3QTzcakStVP8nDCcvlsrLyZvEfOecXlODwyQZEJ1SGGDWvdAGs0_-8JQIjuONweLaucIbs');
    spotifyApi.searchTracks(str)
    .then(function(data) {
      console.log('Search by: ' + str, data.body);
      console.log('GET FIRST ARTIST: ' + data.body.tracks.items[0].artists[0].name);
      this.song.id = data.body.tracks.items[0].id;
      this.song.name = data.body.tracks.items[0].name;
    }, function(err) {
      console.error(err);
    });
    // return this.http.get(this.searchUrl);
    // this.song.name = "hardcode";
    return this.song;
  }
}
