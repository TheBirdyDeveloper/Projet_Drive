import {AFolder} from "./AFolder";
/**
 * Created by Clément on 11/04/2017.
 */

export class File extends AFolder{


  constructor(name, pathLastFolder) {
    super(name, pathLastFolder);
    this.children = null;
    this.type = "file";
  }

}
