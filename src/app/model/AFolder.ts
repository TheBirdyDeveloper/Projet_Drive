/**
 * Created by Clément on 11/04/2017.
 */
export abstract class AFolder {
  name : string;
  type : string;
  children : AFolder[];
  rightClick : boolean;
  path : string[];

  constructor(name, pathLastFolder) {
    this.name = name;
    this.path = pathLastFolder;
    this.path.push(name)
    this.rightClick = false;
  }

  isFolder(){return this.type=="folder";}

  getName(){return this.name;}

  onRightClick() {
    this.rightClick= !this.rightClick;
    return false;
  }

  getStringPath(){
    var path ="";
    for (let current of this.path){
      if (path!="") {
        path += "."+current;
      }
      else{
        path += current;
      }
    }
    return path;
  }

}
