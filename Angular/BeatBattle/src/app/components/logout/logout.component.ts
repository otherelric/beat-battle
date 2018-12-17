import { Component, OnInit } from '@angular/core';
import { User } from '../../types/user';
import { UserSessionService } from 'src/app/services/user-session.service';
import { Router } from '@angular/router'

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  user: User;

  id: number;
  username: string;
  password: string;
  tag: string;
  type: string;

  constructor(private userSession: UserSessionService, private router: Router) { }

  ngOnInit() {
    this.user = this.userSession.getUser();
    this.username = this.user.username;
  }

  logout(){
    sessionStorage.removeItem('currentUser');
    
    // user logged out, run redirect
    this.router.navigate(['./explore']);
  }

}
