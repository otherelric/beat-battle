import { Component, OnInit } from '@angular/core';
import { BattleService } from '../../services/battle.service';
import { Battle } from 'src/app/types/battle';

@Component({
  // tslint:disable-next-line:component-selector
  selector: 'battle',
  templateUrl: './battle.component.html',
  styleUrls: ['./battle.component.css']
})
export class BattleComponent implements OnInit {

  battle: Battle;

  constructor(private battleService: BattleService) { }

  ngOnInit() {
    this.battleService.getBattle(this.battle).subscribe(
      data => {this.battle = data; console.log(data);
    });
  }

}
