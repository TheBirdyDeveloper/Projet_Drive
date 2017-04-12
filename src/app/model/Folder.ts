/**
 * Created by Clément on 11/04/2017.
 */
import {IFolder} from "./IFolder";
import {File} from "./File";

export class Folder implements IFolder{
  name : string;
  type = "folder";
  children : IFolder[];

  constructor(name : string) {
    this.name = name;
    this.children = [];
  }

  getName(){return this.name;}

  getChildren(){return this.children;}

  isFolder(){return true;}
}
