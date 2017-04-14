/**
 * Created by Clément on 11/04/2017.
 */
export interface IFolder {
  name : string;
  type : string;
  children : IFolder[];
  rightClick : boolean;

  getName():string;
  isFolder():boolean;

  onRightClick():void;

}
