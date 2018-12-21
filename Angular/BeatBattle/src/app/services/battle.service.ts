import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Battle } from '../types/battle';

@Injectable({
  providedIn: 'root'
})
export class BattleService {

  battle: Battle;

  battleArray: Battle[];

  readonly url = `http://localhost:8080/BeatBattle/battle`;

  constructor(private http: HttpClient) { }

  getBattle(bArray: Battle[]) {
    // may have to figure out what to do with JSON
    return this.http.post<Battle[]>(this.url, bArray);
  }

  createBattle(battle: Battle) {
    return this.http.post<Battle>(this.url, battle);
  }

}
