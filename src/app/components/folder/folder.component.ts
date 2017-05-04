import {Component, Input} from '@angular/core';
import {Folder} from "../../model/Folder";
import {dataAPI} from "../../services/dataAPI";
import {AFolder} from "../../model/AFolder";

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
    this.delete(current, father);
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
    father.paste(father.path);
    if(AFolder.currentCopy != null) {
      this.post(AFolder.currentCopy, father);
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

  requestSharingLink(file) {
    console.log("Share  :" + file.name);
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

}
