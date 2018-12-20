import { Component, OnInit } from '@angular/core';
import { SpotifyService } from 'src/app/services/spotify.service';

@Component({
  // tslint:disable-next-line:component-selector
  selector: 'explore',
  templateUrl: './explore.component.html',
  styleUrls: ['./explore.component.css']
})
export class ExploreComponent implements OnInit {

  searchStr: string;

  res: any; // anything please god help me this is dumb

  artist: string;
  album: string;
  song: string;

  constructor(private spotifyService: SpotifyService) { }

    ngOnInit() {
      // console.log(res);
      // this.data = res;
      // this.artist = this.data.tracks.items[0].artists[0].name;
      // console.log("HELP?!>?>!@?<" + this.artist);
    }

    searchMusic() {
      this.spotifyService.searchMusic(this.searchStr)
        .subscribe(res => { this.res = res; });
        console.log("Hello?!" + this.res);
    }

}
