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

  private serveurGetDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Get?rep=";
  private serveurPostDrive: string = "";
  private serveurDeleteDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Delete?rep=";

  private serveurGetDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Get?rep=";
  private serveurPostDropBox: string = "";
  private serveurDeleteDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Delete?rep=";

  public mainFolder : Folder;

  constructor(private _http: Http) {}

  public getDataDrive(id:string): Observable<any[]>{
    return this._http.get(this.serveurGetDrive+id)
      .map((res:Response) => res.json());
  }

  public getDataDropBox(path:string): Observable<any[]>{
    return this._http.get(this.serveurGetDropBox+path)
      .map((res:Response) => res.json());
  }


  public getData(mainFolder){
    this.mainFolder = mainFolder;
      this.getDataDrive(mainFolder.id).subscribe(
        files => {
          this.addData(files, mainFolder, "googleDrive")
        }, //Bind to view
        err => {
          // Log errors if any
          console.log(err);

        });


    this.getDataDropBox(mainFolder.getStringPath()).subscribe(
      files => {
        this.addData(files, mainFolder, "dropBox")
      }, //Bind to view
      err => {
        // Log errors if any
        console.log(err);

      });

}

  public postData(location:AFolder){
    console.log("POST");
    var post = JSON.stringify(location.name);
    this._http.post(this.serveurPostDrive, post ).subscribe();
}


  public deleteDataDrive(folder:AFolder){
    this._http.delete(this.serveurDeleteDrive+folder.id).subscribe();
  }

  public deleteDataDropBox(folder:AFolder){
    this._http.delete(this.serveurDeleteDropBox+folder.getStringPath()).subscribe();
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


  addData(children, currentFolder, driver:string){
    for(let typeFile of children.liste){
      if(typeFile.type == "file"){
        currentFolder.addFile(typeFile.name, typeFile.id);
        currentFolder.getLastChildren().drivers.push(driver);
      }
      else if (typeFile.type == "folder"){
        currentFolder.addFolder(typeFile.name, typeFile.id);
        currentFolder.getLastChildren().drivers.push(driver);
      }
      else {
        console.error("type non reconnu")
      }
    }
  }

}
