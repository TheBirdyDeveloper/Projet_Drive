import { Component } from '@angular/core';
import {Folder} from "./model/Folder";
import {dataAPI} from "./services/dataAPI";



@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']

})

export class AppComponent {
  //public mainFolder = new Folder("root",[]);

  constructor(private myApi : dataAPI){
    //this.myApi.getData(this.mainFolder);
  }

}
