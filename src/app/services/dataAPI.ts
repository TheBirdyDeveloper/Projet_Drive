/**
 * Created by Marco de Coco on 11/04/2017.
 */
import {Injectable} from '@angular/core';
import {Http, Response, RequestOptions, Headers } from '@angular/http';
import {Observable}     from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Folder} from "../model/Folder";
import {AFolder} from "../model/AFolder";


@Injectable()
export class dataAPI {
  private _dataUrl: string = "./assets/google.json";
  private _dataUrl2: string = "./assets/test.json";

  private serveurDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Get?rep=";
  private serveurDropBox: string = "";



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

  public postData(location:AFolder){
    console.log("POST");
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    var post = JSON.stringify(location.content);

    this._http.post(this.serveurDrive, post, options ).subscribe(
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

  addDataDropBox(children, currentFolder){
    for(let typeFile of children){
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
