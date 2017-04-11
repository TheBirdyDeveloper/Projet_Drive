import {IFolder} from "./IFolder";
/**
 * Created by Clément on 11/04/2017.
 */

export class File implements IFolder{
  name : string;

  constructor(name: string) {
    this.name = name;
  }

  getName(){return this.name;}
  isFolder(){return false;}

}


