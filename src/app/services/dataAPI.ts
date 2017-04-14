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
  public mainFolder : Folder

  constructor(private _http: Http) {
  }

  public getBasicData(): Observable<any[]>{
      return this._http.get(this._dataUrl)
        .map((res:Response) => res.json());
  }

  public getData(mainFolder){
    this.mainFolder = mainFolder;

  this.getBasicData().subscribe(
  files => {this.addData(files)}, //Bind to view
err => {
  // Log errors if any
  console.log(err);
});

}

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

  private extractData(res : Response) {
    let body = res.json();
    return {data : body.data, type : body.type || null} || {};
  }

  addData(root){
    for(let typeFile of root.data){
      if(typeFile.type == "file"){
        // console.log(typeFile.name)
        //var result=JSON.parse(typeFile);
        //console.log(result);
        this.mainFolder.addFile(typeFile.name);
      }
      else if (typeFile.type == "folder"){
        // console.log(typeFile.name)
        this.mainFolder.addFolder(typeFile.name);
        this.addChildren(typeFile.children, this.mainFolder.getLastChildren());

      }
      else {
        console.error("type non reconnu")
      }
    }
  }

  //Pas focément utile
  addChildren(children, currentFolder){
    for(let typeFile of children){
      if(typeFile.type == "file"){
        currentFolder.addFile(typeFile.name);
        currentFolder.children = currentFolder.children.slice();
      }
      else if (typeFile.type == "folder"){
        // console.log(typeFile.name)
        currentFolder.addFolder(typeFile.name);
        this.addChildren(typeFile.children, currentFolder.getLastChildren());
      }
      else {
        console.error("type non reconnu")
      }
    }
    //console.log(currentFolder.children.length);
  }

  // private newFolder(chemin : string, name : string): Observable<any> {
  //   let data = { path:chemin, name:name};
  //   // à voir
  //   return this._http.post(`${this._dataUrl}/new-folder`, JSON.stringify(data)).map(this.extractData).catch(this.handleError);
  // }







}
