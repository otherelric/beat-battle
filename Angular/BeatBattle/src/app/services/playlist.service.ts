import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Playlist } from '../types/playlist';

@Injectable({
  providedIn: 'root'
})
export class PlaylistService {

  playlist: Playlist;

  readonly url = `http://localhost:8080/BeatBattle/playlist`;

  constructor(private http: HttpClient) { }

  getPlaylist(playlist: Playlist) {
    // may have to figure out what to do with JSON
    return this.http.get<Playlist>(this.url);
  }

  createPlaylist(playlist: Playlist) {
    return this.http.post<Playlist>(this.url, playlist);
  }

}
