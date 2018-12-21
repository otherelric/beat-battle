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

  battleArray: Battle[];
  battle = new Battle();
  battleTwo = new Battle();

  constructor(private battleService: BattleService) { }

  ngOnInit() {
    this.battle.id = 1;
    this.battleTwo.id = 2;
    this.battleArray = [
      this.battle,
      this.battleTwo
    ];
    this.battleService.getBattle(this.battleArray).subscribe(
      data => {this.battleArray = data; console.log(data);
    });
  }

}
