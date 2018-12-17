import { Injectable } from '@angular/core';
import { User } from '../types/user'

@Injectable({
  providedIn: 'root'
})
export class UserSessionService {

user: User;

  constructor() { }

  getUser(){
    this.user = JSON.parse(sessionStorage.getItem('currentUser'));
    return this.user;
  }
}
