import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../types/user';

@Injectable()
export class UserServiceService {

  readonly url = `http://localhost:8080/BeatBattle/user`;

  constructor(private http: HttpClient) { }

  getUser(user: User) {
    return this.http.post<User>(this.url, user);
  }

}
