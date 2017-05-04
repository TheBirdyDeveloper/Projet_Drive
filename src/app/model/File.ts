import {AFolder} from "./AFolder";
/**
 * Created by Clément on 11/04/2017.
 */

export class File extends AFolder{


  constructor(name, pathLastFolder, size=0, id = null) {
    super(name, pathLastFolder, size, id);
    this.children = null;
    this.type = "file";
  }
}
