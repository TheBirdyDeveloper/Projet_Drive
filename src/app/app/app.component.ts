import { Component } from '@angular/core';
import {Folder} from "../Model/Folder";

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']

})

export class AppComponent {
  title = 'app works!';
  folder = new Folder("root");

}
