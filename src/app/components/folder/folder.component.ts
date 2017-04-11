import {Component, OnInit, Input} from '@angular/core';
import {IFolder} from "../../model/IFolder";
import {File} from "../../model/File";
import {Folder} from "../../model/Folder";

@Component({
  selector: 'app-folder',
  templateUrl: 'folder.component.html',
  styleUrls: ['folder.component.css']
})



export class FolderComponent implements OnInit {

  @Input() folder:Folder;

  constructor() {

  }

  ngOnInit(){
    this.folder.children = new Array<IFolder>();
  }

  addFile(child: string){
    this.folder.children.push(new File(child));
    this.folder.children = this.folder.children.slice();
    this.showArbo();
  }

  addFolder(child:string){
    this.folder.children.push(new Folder(child));
    this.folder.children = this.folder.children.slice();
    this.showArbo();
  }

  showArbo(){
    for (let current of this.folder.children){
      console.log(current.getName());
    }
  }
}
