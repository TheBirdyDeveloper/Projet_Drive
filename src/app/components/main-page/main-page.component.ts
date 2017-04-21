import { Component, OnInit } from '@angular/core';
import {dataAPI} from "../../services/dataAPI";
import {Folder} from "../../model/Folder";

@Component({
  selector: 'app-main-page',
  templateUrl: 'main-page.component.html',
  styleUrls: ['main-page.component.css']
})
export class MainPageComponent  {

  public mainFolder = new Folder("root",[]);

  constructor(private myApi : dataAPI){
    this.myApi.getData(this.mainFolder);
  }
}
