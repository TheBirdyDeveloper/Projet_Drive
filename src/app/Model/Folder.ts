/**
 * Created by Clément on 11/04/2017.
 */
import {IFolder} from "./IFolder";

export class Folder implements IFolder{
  name : string;
  children : IFolder[];

  constructor(name : string) {
    this.name = name;
    this.children = new Array<IFolder>();
  }

  getName(){return this.name;}

  getChildren(){return this.children;}

  isFolder(){return true;}

}
