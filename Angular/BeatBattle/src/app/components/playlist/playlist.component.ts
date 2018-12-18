import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'playlist',
  templateUrl: './playlist.component.html',
  styleUrls: ['./playlist.component.css']
})
export class PlaylistComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    var SpotifyWebApi = require('spotify-web-api-node');
 
    // credentials are optional
    var spotifyApi = new SpotifyWebApi({
      clientId: '49d4780a10df4cc58f533beb4d87104b',
      clientSecret: '8c39f5590a674ae7929f62a4aa8c8d61'
    });
    
    //Get Elvis' albums
    spotifyApi.getArtistAlbums('43ZHCT0cAZBISjO8DG9PnE').then(
      function(data) {
        console.log('Artist albums', data.body);
      },
      function(err) {
        console.error(err);
      }
    );
  }

}
