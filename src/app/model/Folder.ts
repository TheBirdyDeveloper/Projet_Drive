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

  stick(path:string[]){
    if (AFolder.currentCopy.type == "folder"){
      this.addCopyFolder(AFolder.currentCopy.name, path);
      this.getLastChildren().children = AFolder.currentCopy.children;
      //this.getLastChildren().children.slice();
    }
    else if (AFolder.currentCopy.type == "file"){
      this.addCopyFile(AFolder.currentCopy.name, path);
    }
    else{console.error("erreur de type pour coller");
    }
  }

  toggle(){
    this.expanded = !this.expanded;
  }

  getLastChildren(){return this.children[this.children.length-1];}

  addFile(child: string){
    this.children.push(new File(child, this.path));
    this.children = this.children.slice();
  }

  addFolder(child:string){
    this.children.push(new Folder(child, this.path));
    this.children = this.children.slice();
  }

  addCopyFolder(child:string, path:string[]){
    this.children.push(new Folder(child, path));
    this.children = this.children.slice();
  }

  addCopyFile(child:string, path:string[]){
    this.children.push(new File(child, path));
    this.children = this.children.slice();
  }


}
