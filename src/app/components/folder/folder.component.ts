import {Component, OnInit, Input} from '@angular/core';
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


  getData(){
  this.myApi.getData(this.folder);
}

}
