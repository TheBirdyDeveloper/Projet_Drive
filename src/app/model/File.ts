import {AFolder} from "./AFolder";
/**
 * Created by Clément on 11/04/2017.
 */

export class File extends AFolder{
  shareLink:string="";
  downloadLink:string="";

  constructor(name, pathLastFolder, size=0, shareLink="", downloadLink="", rights = false, isShared = false, id = null) {
    super(name, pathLastFolder, size, rights, isShared, id);
    this.children = null;
    this.type = "file";
    this.shareLink=shareLink;
    this.downloadLink=downloadLink;
  }
}
