/**
 * Created by Clément on 11/04/2017.
 */
import {IFolder} from "./IFolder";
import {File} from "./File";

export class Folder implements IFolder{
  name : string;
  type = "folder";
  children : IFolder[];
  expanded = false;
  rightClick= false;

  constructor(name : string) {
    this.name = name;
    this.children = [];
  }

  toggle(){
    this.expanded = !this.expanded;
  }

  getName(){return this.name;}

  getChildren(){return this.children;}

  getLastChildren(){return this.children[this.children.length-1];}

  isFolder(){return true;}

  addFile(child: string){
    this.children.push(new File(child));
    this.children = this.children.slice();
  }

  addFolder(child:string){
    this.children.push(new Folder(child));
    this.children = this.children.slice();
  }

  onRightClick() {this.rightClick= !this.rightClick;}
}
