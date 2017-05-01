import { Component } from '@angular/core';
import {dataAPI} from "../../services/dataAPI";
import {Folder} from "../../model/Folder";
import {AFolder} from "../../model/AFolder";

@Component({
  selector: 'app-main-page',
  templateUrl: 'main-page.component.html',
  styleUrls: ['main-page.component.css']
})
export class MainPageComponent  {

  public mainFolder = new Folder("root",[], "root");
  public currentSelect = null;

  constructor(private myApi : dataAPI){
    this.myApi.getData(this.mainFolder);
  }

  refresh(folder){
    folder.refresh();
    this.getData(folder);
  }

  updateSelected(){
    this.currentSelect = AFolder.currentSelect;
  }

  paste(father:Folder){
    father.paste(father.path);
    this.post(AFolder.currentCopy, father);
  }

  addFile(current:Folder, name:string){
    current.addFile(name);
    this.post(current.getLastChildren(), current);

  }

  addFolder(current:Folder, name:string){
    current.addFolder(name);
    this.post(current.getLastChildren(), current);
  }

  post(current:AFolder, father:Folder){
      this.myApi.postDataDropBox(current, father);
      this.myApi.postDataDrive(current, father);
  }

  getData(folder){
    if (folder.load){
      return;
    }
    folder.refresh();

    this.myApi.getData(folder);
    folder.load=true;
  }
}
