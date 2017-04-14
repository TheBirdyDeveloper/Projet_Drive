import {IFolder} from "./IFolder";
/**
 * Created by Clément on 11/04/2017.
 */

export class File implements IFolder{
  type ="file";
  children = null;
  rightClick = false;

  constructor(public name: string) {
    this.name = name;
  }

  getName(){return this.name;}
  isFolder(){return false;}
  onRightClick()
{this.rightClick= !this.rightClick;}

}
