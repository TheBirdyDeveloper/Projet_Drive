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

  constructor(name, pathLastFolder, id = null) {
    this.name = name;
    this.path = pathLastFolder;
    this.path=this.path.slice();
    this.path.push(name);
    this.rightClick = false;
    this.id = id;
  }

  isOnGoogle(){
    return ( this.drivers.indexOf("google")!=null );
  }

  isOnDropBox(){
    return ( this.drivers.indexOf("dropBox")!=null );
  }

  changeName(name : string){
    this.name=name;
    this.path.pop();
    this.path.push(name)
  }

  copy(type:string){
    AFolder.currentCopy = this;
    AFolder.currentCopy.type = type;
    //AFolder.currentCopy.children = this.children.slice();
  }

  cut(type:string, father: AFolder){
    AFolder.currentCopy = this;
    AFolder.currentCopy.type = type;
    this.delete(father);
  }

  delete(father){
    let index = father.children.indexOf(this, 0);
    if (index> -1){
      father.children.splice(index, 1);
    }
  }

  isFolder(){return this.type=="folder";}

  onRightClick() {
    this.rightClick= !this.rightClick;
    //console.log(this.name + " : " +this.getStringPath());
    console.log(this.name + " : " + this.id);
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

  share(email : string) {
  console.log(email);
  }

  // getFather(){
  //   return this.path[this.path.length - 2];
  // }

}
