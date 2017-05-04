import { Component } from '@angular/core';
import {dataAPI} from "../../services/dataAPI";
import {Folder} from "../../model/Folder";
import {AFolder} from "../../model/AFolder";
import {Information} from "../../model/Information";

@Component({
  selector: 'app-main-page',
  templateUrl: 'main-page.component.html',
  styleUrls: ['main-page.component.css']
})

export class MainPageComponent  {

  public mainFolder = new Folder("root",[], 0, "","", "root");
  public currentSelect = null;
  public information:Information = new Information();

  constructor(private myApi : dataAPI){
    this.myApi.getDataOnDrive(this.mainFolder);
    this.myApi.getDataOnDropBox(this.mainFolder);
    this.refreshInfos();
  }

  refreshInfos(){
    this.myApi.getInfos(this.information);
  }

  refresh(folder){
    folder.refresh();
    this.getData(folder);
    this.refreshInfos();
  }

  updateSelected(){
    this.currentSelect = AFolder.currentSelect;
  }

  paste(father:Folder){
    if(AFolder.currentCopy !== null) {
      if (father.isOnGoogle()&&AFolder.currentCopy.isOnGoogle()) {
        this.myApi.moveDrive(AFolder.currentCopy, father);
      }
      if (father.isOnDropBox()&&AFolder.currentCopy.isOnDropBox()) {
        this.myApi.moveDropBox(AFolder.currentCopy, father);
      }
      father.load = false;
      this.delete(AFolder.currentCopy, father);
      this.refresh(father);
    }
    else {
      console.error("No current copy");
    }
  }

  delete(child:AFolder, father){

    if(child.isOnGoogle()) {
      this.myApi.deleteDataDrive(child);
    }
    if(child.isOnDropBox()) {
      this.myApi.deleteDataDropBox(child);
    }
  }

  addFile(current:Folder, name:string){
    current.addFile(name);
    this.post(current.getLastChildren(), current);
    this.refreshInfos()
  }

  addFolder(current:Folder, name:string){
    current.addFolder(name);
    this.post(current.getLastChildren(), current);
    this.refreshInfos()
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
      this.myApi.getDataOnDrive(folder);
      this.myApi.getDataOnDropBox(folder);

    folder.load=true;
  }

  upload(event, current) {
    var files = event.srcElement.files;
      this.myApi.uploadDrive(files, current);

      this.myApi.uploadDropBox(files, current);

    this.refresh(current);
  }


}

