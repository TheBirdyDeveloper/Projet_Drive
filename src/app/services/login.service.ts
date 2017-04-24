/**
 * Created by Marco de Coco on 24/04/2017.
 */
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable()
export class LoginService {
  private loggedIn: boolean;

  constructor(private router: Router) {
    this.loggedIn = false;
  }

  login() {
    // mechanism to login
    this.loggedIn = true;
  }

  logout() {
    // mechanism to logout
    this.loggedIn = false;
  }

  isLoggedIn() {
    return this.loggedIn;
  }
}
