/**
 * Created by Clément on 11/04/2017.
 */
import {AFolder} from "./AFolder";
import {File} from "./File";
//import {dataAPI} from "../services/dataAPI";

export class Folder extends AFolder {
  expanded = false;


  constructor(name, pathLastFolder) {
    super(name, pathLastFolder);
    this.children = [];
    this.type = "folder";
  }

  paste(path: string[]) {
    if (AFolder.currentCopy == null){
      console.error("Erreur : Coller sans avoir Copier");
      return;
    }


    if (AFolder.currentCopy.type == "folder") {
      //console.log("ajout dossier");
      this.addFolder(AFolder.currentCopy.name, path);
      this.copyChildren(<Folder>this.getLastChildren(), AFolder.currentCopy);
    }

    else if (AFolder.currentCopy.type == "file") {
      this.addFile(AFolder.currentCopy.name, path);
    }
    else {
      console.error("erreur de type pour coller");
    }
  }

  toggle() {
    this.expanded = !this.expanded;
  }

  getLastChildren() {
    return this.children[this.children.length - 1];
  }

  addFolder(child: string, path: string[] = this.path) {
    this.children.push(new Folder(child, path));
    this.children = this.children.slice();
  }

  addFile(child: string, path: string[] = this.path) {
    this.children.push(new File(child, path));
    this.children = this.children.slice();
  }

  copyChildren(newFolder: Folder, father: AFolder) {
    for (let current of father.children) {
    if (current.type == "folder") {

      if (AFolder.currentCopy.name != current.name) {
        newFolder.addFolder(current.name, father.path);
        newFolder.copyChildren(<Folder>newFolder.getLastChildren(), current);
      }
      else{
        //console.log("attention emboitement d'un folder dans le même folder pour coller")
      }

    }

    else if (current.type == "file") {
      newFolder.addFile(current.name, father.path);
    }
    else {
      console.error("erreur de type pour coller");
    }
  }
}

}
