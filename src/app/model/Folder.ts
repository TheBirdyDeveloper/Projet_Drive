/**
 * Created by Clément on 11/04/2017.
 */
import {AFolder} from "./AFolder";
import {File} from "./File";

export class Folder extends AFolder {

  expanded = false;
  private _load:boolean;

  constructor(name, pathLastFolder, size = 0, id = null) {
    super(name, pathLastFolder, size, id);
    this.children = [];
    this.type = "folder";
    this._load = false;
  }

  paste(path: string[]) {
    if (AFolder.currentCopy == null){
      console.error("Erreur : Coller sans avoir Copier");
      return;
    }

    if (AFolder.currentCopy.type == "folder") {
      this.addFolder(AFolder.currentCopy.name, AFolder.currentCopy.id, path);
      this.copyChildren(<Folder>this.getLastChildren(), AFolder.currentCopy);
      this.getLastChildren().drivers = AFolder.currentCopy.drivers
      this.getLastChildren().drivers = this.getLastChildren().drivers.slice();
    }

    else if (AFolder.currentCopy.type == "file") {
      this.addFile(AFolder.currentCopy.name, AFolder.currentCopy.id, path);
      this.getLastChildren().drivers = AFolder.currentCopy.drivers
      this.getLastChildren().drivers = this.getLastChildren().drivers.slice();
    }
    else {
      console.error("erreur de type pour coller");
    }
  }

  get load(): boolean {
    return this._load;
  }

  set load(value: boolean) {
    this._load = value;
  }

  toggle() {
  this.expanded = !this.expanded;
  }

  getLastChildren() {
    return this.children[this.children.length - 1];
  }

  addFolder(child: string, id:string = null, path: string[] = this.path) {
    path = path.slice();
    this.children.push(new Folder(child, path, 0,id));
    this.children = this.children.slice();
    this.getLastChildren().drivers = this.drivers;
    this.getLastChildren().drivers = this.getLastChildren().drivers.slice();
  }

  addFile(child: string, id:string = null, path: string[] = this.path) {
    path = path.slice();
    this.children.push(new File(child, path, 0,id));
    this.children = this.children.slice();
    this.getLastChildren().drivers = this.drivers;
    this.getLastChildren().drivers = this.getLastChildren().drivers.slice();
  }

  addFolderGetRequest(child: string, size:number = 0, id:string = null, path: string[] = this.path) {
    path = path.slice();
    this.children.push(new Folder(child, path, size,id));
    this.children = this.children.slice();
  }

  addFileGetRequest(child: string, size:number, shareLink:string="", downloadLink:string="", id:string = null, path: string[] = this.path) {
    path = path.slice();
    this.children.push(new File(child, path, size, shareLink, downloadLink, id));
    this.children = this.children.slice();
  }

  copyChildren(newFolder: Folder, father: AFolder) {
    for (let current of father.children) {
    if (current.type == "folder") {

      if (AFolder.currentCopy.name != current.name) {
        newFolder.addFolder(current.name, current.id, father.path);
        newFolder.copyChildren(<Folder>newFolder.getLastChildren(), current);
      }
      else{
        //console.log("attention emboitement d'un folder dans le même folder pour coller")
      }
    }

    else if (current.type == "file") {
      newFolder.addFile(current.name, current.id, father.path);
    }
    else {
      console.error("erreur de type pour coller");
    }
  }
}

  refresh(){
    this.children =[];
    this.rightClick = false;
    this.load=false;
  }

}
