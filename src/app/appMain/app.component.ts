import { Component } from '@angular/core';
import {Folder} from "../model/Folder";

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']

})

export class AppComponent {
  title = 'appMain works!';
  folder = new Folder("root");

}
