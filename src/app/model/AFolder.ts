/**
 * Created by Clément on 11/04/2017.
 */
export abstract class AFolder {
  name : string;
  type : string;
  children : AFolder[];
  rightClick : boolean;
  path : string[];
  id : string;
  _size: number = 0;
  drivers: string[] = [];
  rights: string[];
  content:string;


  public static currentCopy : AFolder = null;
  public static currentSelect : AFolder = null;

  constructor(name, pathLastFolder, size = 0, id = null) {
    this.name = name;
    this.path = pathLastFolder;
    this.path=this.path.slice();
    this.path.push(name);
    this.rightClick = false;
    this.id = id;
    this._size = size;
  }

  changeCurrentSelect(){
    AFolder.currentSelect = this;
  }

  isOnGoogle(){
    return (this.drivers.indexOf("googleDrive")!=-1 );
  }

  isOnDropBox(){
    return ( this.drivers.indexOf("dropBox")!=-1 );
  }

  changeName(name : string){
    this.name=name;
    this.path.pop();
    this.path.push(name)
  }

  copy(type:string){
    AFolder.currentCopy = this;
    AFolder.currentCopy.type = type;
    //AFolder.currentCopy.path = AFolder.currentCopy.path.slice();
  }

  // cut(type:string, father: AFolder){
  //   AFolder.currentCopy = this;
  //   AFolder.currentCopy.type = type;
  //   this.delete(father);
  // }

  delete(father){
    let index = father.children.indexOf(this, 0);
    if (index> -1){
      father.children.splice(index, 1);
    }
  }

  isFolder(){return this.type=="folder";}

  onRightClick() {
    this.rightClick= !this.rightClick;
    console.log(this.name+"  "+this.id);
    return false;
  }

  get size(): number {
    return this._size;
  }

  //Pour plus tard
  getStringPath(){
    let path ="";
    for (let current of this.path){
      if (current=="root"){}
      else if (path!="") {
        path += "/"+current;
      }
      else{
        path += current;
      }
    }
    return path;
  }

  getPathFather(){
    let path ="";
    for (let current of this.path){
      if (current=="root" || current==this.name){}
      else{
        path += current+"/";
      }
    }
    return path;
  }

  getStringPathDisplay(){
    let path ="";
    for (let current of this.path){
      if (current=="root"){}
      else {
        path += " > "+current;
      }
    }
    return path;
  }

  share(email : string) {
  console.log(email);
  }
}

