import { Component, OnInit } from '@angular/core';
import { SpotifyService } from 'src/app/services/spotify.service';
import { Song } from '../../types/song';

@Component({
  // tslint:disable-next-line:component-selector
  selector: 'explore',
  templateUrl: './explore.component.html',
  styleUrls: ['./explore.component.css']
})
export class ExploreComponent implements OnInit {

  searchStr: string;
  song: Song;

  artist: string;
  album: string;
  name: string; // song name

  constructor(private spotifyService: SpotifyService) { }

    ngOnInit() {
      // console.log(res);
      // this.data = res;
      // this.artist = this.data.tracks.items[0].artists[0].name;
      // console.log("HELP?!>?>!@?<" + this.artist);
    }

    searchMusic() {
      this.song = new Song();
      this.song = this.spotifyService.searchMusic(this.searchStr);
      // console.log('Song: ' + this.song.name);
      // console.log('now this runs');
    }

}
