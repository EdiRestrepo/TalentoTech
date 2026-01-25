import { Component } from '@angular/core';

import { UserService } from '../../../services/user.service/user.service';
import { CommonModule, JsonPipe } from '@angular/common';

@Component({
  selector: 'app-user.component',
  imports: [JsonPipe, CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
  // template: `<h2>User Component Works desde template!</h2>`,
  // styles: [`h2 { color: blue; }`]
})
export class UserComponent {

  users: any[] = [];

  constructor(private userService: UserService) {
    this.userService.getUsers().subscribe(data => {
      this.users = data;
      console.log(this.users);
    });
  }

}
