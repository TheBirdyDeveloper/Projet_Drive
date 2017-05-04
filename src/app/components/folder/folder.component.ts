import {Component, Input} from '@angular/core';
import {Folder} from "../../model/Folder";
import {dataAPI} from "../../services/dataAPI";
import {AFolder} from "../../model/AFolder";
import {File} from "../../model/File";

@Component({
  selector: 'app-folder',
  templateUrl: 'folder.component.html',
  styleUrls: ['folder.component.css']
})



export class FolderComponent {

  @Input() folder:Folder;



  constructor(private myApi : dataAPI) {
  }

  cut (current:AFolder, father:Folder){
    current.copy(current.type);
    current.delete(father);
    //this.delete(current, father);
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
    if (father.isOnDropBox()){
      this.myApi.postDataDropBox(current, father);
    }

    if (father.isOnGoogle()) {
      this.myApi.postDataDrive(current, father);
    }
  }

  paste(father:Folder){

    if(AFolder.currentCopy != null) {
      if (father.isOnGoogle()&&AFolder.currentCopy.isOnGoogle()) {
        this.myApi.moveDrive(AFolder.currentCopy, father);
      }
      if (father.isOnDropBox()&&AFolder.currentCopy.isOnDropBox()) {
        this.myApi.moveDropBox(AFolder.currentCopy, father);
      }
      father.load = false;
      this.refresh(father);
    }
    else {
      console.error("No current copy");
    }
  }

  getData(folder){
    if (folder.load){
      return;
    }
    folder.refresh();

  this.myApi.getData(folder);
  folder.load=true;
  }

  refresh(folder){
    folder.refresh();
    this.getData(folder);
  }

  delete(child:AFolder, father){

    if(child.isOnGoogle()) {
      this.myApi.deleteDataDrive(child);
    }
    if(child.isOnDropBox()) {
      this.myApi.deleteDataDropBox(child);
    }

    child.delete(father);
  }

  changeName(current:AFolder, name:string){


    if(current.isOnGoogle()) {
      this.myApi.changeNameDrive(current, name);
    }

    if(current.isOnDropBox()) {
      this.myApi.changeNameDropBox(current, name);
    }

    current.changeName(name);

  }

  getShareLink(element, file:File){
    element.textContent = file.shareLink;
  }

  upload(event, current) {
    var files = event.srcElement.files;
    if (current.isOnGoogle()) {
      this.myApi.uploadDrive(files, current);
    }

    if (current.isOnDropBox()) {
      this.myApi.uploadDropBox(files, current);
    }

    this.refresh(current);
  }

}
