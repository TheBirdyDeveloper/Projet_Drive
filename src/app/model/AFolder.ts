/**
 * Created by Clément on 11/04/2017.
 */
export abstract class AFolder {
  name : string;
  type : string;
  children : AFolder[];
  private rightClick : boolean;
  path : string[];

  public static currentCopy : AFolder =null;

  constructor(name, pathLastFolder) {
    this.name = name;
    this.path = pathLastFolder;
    this.path.push(name)
    this.rightClick = false;

  }

  changeName(name){
    this.name=name;
  }

  copy(type:string){
    AFolder.currentCopy = this;
    AFolder.currentCopy.type = type;
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
