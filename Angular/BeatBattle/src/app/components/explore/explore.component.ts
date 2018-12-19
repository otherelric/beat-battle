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

  constructor(private spotifyService: SpotifyService) { }

    ngOnInit() {

    }

    searchMusic() {
      this.spotifyService.searchMusic(this.searchStr)
        .subscribe(res => {
          // console.log(res.artists.items);
        });
    }
}
