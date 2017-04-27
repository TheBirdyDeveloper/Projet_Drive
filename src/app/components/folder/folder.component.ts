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

  post(location:AFolder){
    this.myApi.postData(location);
  }

  getData(folder){
    if (folder.load){
      return;
    }

  this.myApi.getData(folder);
  folder.load=true;
  }

  refresh(folder){
    folder.refresh();
    this.getData(folder);
  }

  requestSharingLink(file) {
    console.log("Share" + file.name);
  }

  delete(child:AFolder, father){
    console.log("current" + child.name);
    console.log("father" + father.name);

    if(child.isOnGoogle()) {
      this.myApi.deleteDataDrive(child);
    }
    if(child.isOnDropBox()) {
      this.myApi.deleteDataDrive(child);
    }

    child.delete(father);
  }

}
