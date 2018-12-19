import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'create-battle',
  templateUrl: './create-battle.component.html',
  styleUrls: ['./create-battle.component.css']
})
export class CreateBattleComponent implements OnInit {

  constructor() { }

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
    // handle add battle success/failure
  }

}
