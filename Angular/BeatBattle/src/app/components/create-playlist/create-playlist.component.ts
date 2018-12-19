import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'create-playlist',
  templateUrl: './create-playlist.component.html',
  styleUrls: ['./create-playlist.component.css']
})
export class CreatePlaylistComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  /*
   * generate elements associated with creating a new playlist
   * run safety protocol for playlist already created
   */
  loadCreator() {
    // add elements to page for playlist creation
  }
  
  /*
   * form submission for playlist creation
   * confirm user submission
   */
  createPlaylist() {
    // handle add playlist success/failure
  }

}
