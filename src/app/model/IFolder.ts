/**
 * Created by Clément on 11/04/2017.
 */
export interface IFolder {
  name : string;
  type : string;
  children : IFolder[];

  getName():string;
  isFolder():boolean;

}
