import {Component, Input} from '@angular/core';
import {Folder} from "../../model/Folder";
import {dataAPI} from "../../services/dataAPI";

@Component({
  selector: 'app-folder',
  templateUrl: 'folder.component.html',
  styleUrls: ['folder.component.css']
})



export class FolderComponent {

  @Input() folder:Folder;


  constructor(private myApi : dataAPI) {
  }

  post(){
    //this.myApi.postData();
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

}
