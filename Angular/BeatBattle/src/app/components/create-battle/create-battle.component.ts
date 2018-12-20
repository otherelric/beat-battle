import { Component, OnInit } from '@angular/core';
import { Battle } from '../../types/battle';
import { BattleService } from '../../services/battle.service';
import { Router } from '@angular/router';

@Component({
  // tslint:disable-next-line:component-selector
  selector: 'create-battle',
  templateUrl: './create-battle.component.html',
  styleUrls: ['./create-battle.component.css']
})
export class CreateBattleComponent implements OnInit {

  battle: Battle;
  playlistOne: number;
  playlistTwo: number;

  constructor(private battleService: BattleService, private router: Router) { }

  ngOnInit() {
  }

  /*
   * generate elements associated with creating a new battle
   * run safety protocol for battle already created
   */
  loadCreator() {
    // add elements to page for battle creation
  }

  /*
   * form submission for battle creation
   * confirm user submission
   */
  createBattle() {
    this.battle.playlistOneId = this.playlistOne;
    this.battle.playlistidTwoId = this.playlistTwo;
    this.battleService.createBattle(this.battle).subscribe(
      data => {this.battle = data; console.log(data);
    });
  }

}
