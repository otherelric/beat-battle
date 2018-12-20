import { Component, OnInit } from '@angular/core';
import { Playlist } from '../../types/playlist';
import { PlaylistService } from '../../services/playlist.service';
import { Router } from '@angular/router';

@Component({
  // tslint:disable-next-line:component-selector
  selector: 'playlist',
  templateUrl: './playlist.component.html',
  styleUrls: ['./playlist.component.css']
})
export class PlaylistComponent implements OnInit {

  playlist: Playlist;
  userid: number;
  name: string;
  tag: string;

  constructor(private playlistService: PlaylistService, private router: Router) { }

  ngOnInit() {

  }

  createPlaylist() {
    this.playlist.userid = this.userid;
    this.playlist.name = this.name;
    this.playlist.tag = this.tag;
    this.playlistService.createPlaylist(this.playlist).subscribe(
      data => {this.playlist = data; console.log(data);
    });
  }

}
