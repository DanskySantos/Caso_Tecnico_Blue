import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../_models/user";
import {Router} from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  registerMode = false;

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  registerToggle() {
    this.registerMode = !this.registerMode;
  }

  cancelRegisterModel(event: boolean) {
    this.registerMode = event;
  }

  isUserLogged () {
    const user = <User><unknown>localStorage.getItem('user')

    if (user.name == null) {
      return false;
    } else {
      return true;
    }
  }

  public alreadyVoted() {
    if (localStorage.getItem('user.vote') === null) {
      return true;
    }
  }
}
