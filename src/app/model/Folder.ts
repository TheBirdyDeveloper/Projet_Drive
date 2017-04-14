/**
 * Created by Clément on 11/04/2017.
 */
import {AFolder} from "./AFolder";
import {File} from "./File";
//import {dataAPI} from "../services/dataAPI";

export class Folder extends AFolder{
  expanded = false;


  constructor(name, pathLastFolder) {
    super(name, pathLastFolder);
    this.children = [];
    this.type = "folder";
  }

  toggle(){
    this.expanded = !this.expanded;
  }

  getChildren(){return this.children;}

  getLastChildren(){return this.children[this.children.length-1];}

  addFile(child: string){
    this.children.push(new File(child, this.path));
    this.children = this.children.slice();
  }

  addFolder(child:string){
    this.children.push(new Folder(child, this.path));
    this.children = this.children.slice();
  }



}
