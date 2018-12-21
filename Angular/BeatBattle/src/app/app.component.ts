import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from './types/user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Beat Battle';
  user = JSON.parse(sessionStorage.getItem('currentUser'));
  username = '';

  ngOnInit() {
    if (this.user.username != null) {
      this.username = this.user.username;
    } else {
      this.username = '';
    }
  }
}
