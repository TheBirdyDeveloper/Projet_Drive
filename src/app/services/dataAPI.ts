/**
 * Created by Marco de Coco on 11/04/2017.
 */
import {Injectable} from '@angular/core';
import {Http, Response, RequestOptions, Headers } from '@angular/http';
import {Observable}     from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Folder} from "../model/Folder";


@Injectable()
export class dataAPI {
  private _dataUrl: string = "./assets/google.json";
  private _dataUrl2: string = "./assets/test2.json";

  private serveurDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Get?rep=";


  public mainFolder : Folder;

  constructor(private _http: Http) {}

  public getBasicData(id:string): Observable<any[]>{
      return this._http.get(this.serveurDrive+id)
        .map((res:Response) => res.json());
  }

  public getData(mainFolder){
    console.log("get : " + mainFolder.name);
    this.mainFolder = mainFolder;
      this.getBasicData(mainFolder.id).subscribe(
        files => {
          this.addDataDrive(files, mainFolder)
        }, //Bind to view
        err => {
          // Log errors if any
          console.log(err);

        });

}

  public postData(){
    console.log("POST");
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    var post = JSON.stringify({attribute: 'name'})

    this._http.post(this._dataUrl2, post, options ).subscribe(
      data => console.log("POSTE")
    );
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
<<<<<<< HEAD
=======
  */

  addData(children, currentFolder){
    for(let typeFile of children){
      if(typeFile.type == "file"){
        currentFolder.addFile(typeFile.name, typeFile.id);
      }
      else if (typeFile.type == "folder"){
        currentFolder.addFolder(typeFile.name, typeFile.id);
        this.addData(typeFile.children, currentFolder.getLastChildren()); //A supprimer apres
      }
      else {
        console.error("type non reconnu")
      }
    }
  }

  addDataDrive(children, currentFolder){
    for(let typeFile of children.liste){
      if(typeFile.type == "file"){
        currentFolder.addFile(typeFile.name, typeFile.id);
      }
      else if (typeFile.type == "folder"){
        currentFolder.addFolder(typeFile.name, typeFile.id);
      }
      else {
        console.error("type non reconnu")
      }
    }
  }

}
