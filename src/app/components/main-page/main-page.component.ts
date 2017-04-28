import { Component } from '@angular/core';
import {dataAPI} from "../../services/dataAPI";
import {Folder} from "../../model/Folder";

@Component({
  selector: 'app-main-page',
  templateUrl: 'main-page.component.html',
  styleUrls: ['main-page.component.css']
})
export class MainPageComponent  {

  public mainFolder = new Folder("Root",[], "Root");

  constructor(private myApi : dataAPI){
    this.myApi.getData(this.mainFolder);
  }

  refresh(folder){
    folder.refresh();
    this.getData(folder);
  }

  getData(folder){
    if (folder.load){
      return;
    }

    this.myApi.getData(folder);
    folder.load=true;
  }
}
