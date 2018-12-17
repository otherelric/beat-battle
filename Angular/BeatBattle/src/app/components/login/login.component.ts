import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../../services/user-service.service';
import { User } from '../../types/user';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  user: User;

  username: string;

  password: string;

  constructor(private userService: UserServiceService) { }

  ngOnInit() {
    this.user = new User();
  }

  findUser() {
    this.user.username = this.username;
    this.user.password = this.password;
    this.userService.getUser(this.user).subscribe(
      data => {this.user = data; console.log(data); });
  }

}
