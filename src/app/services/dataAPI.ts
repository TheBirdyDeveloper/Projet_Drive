/**
 * Created by Marco de Coco on 11/04/2017.
 */
import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable}     from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Folder} from "../model/Folder";


@Injectable()
export class dataAPI {
  private _dataUrl: string = "./assets/test.json";
  public mainFolder : Folder;

  constructor(private _http: Http) {
  }


  public getBasicData(): Observable<any[]>{
      return this._http.get(this._dataUrl)
        .map((res:Response) => res.json());
  }


  public getData(mainFolder){
    this.mainFolder = mainFolder;

  this.getBasicData().subscribe(
  files => {this.addData(files, mainFolder)}, //Bind to view
err => {
  // Log errors if any
  console.log(err);
});



}
/*
  private handleError (error: Response | any) {
    let errMsg: string;
    if (error instanceof Response) {
      const body = error.json() || '';
      const err = body.error || JSON.stringify(body);
      errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
    } else {
      errMsg = error.message ? error.message : error.toString();
    }
    console.error(errMsg);
    return Observable.throw(errMsg);
  }
  */

  addData(children, currentFolder){
    for(let typeFile of children){
      if(typeFile.type == "file"){
        currentFolder.addFile(typeFile.name);
      }
      else if (typeFile.type == "folder"){
        currentFolder.addFolder(typeFile.name);
        this.addData(typeFile.children, currentFolder.getLastChildren()); //A supprimer apres
      }
      else {
        console.error("type non reconnu")
      }
    }
  }

}
