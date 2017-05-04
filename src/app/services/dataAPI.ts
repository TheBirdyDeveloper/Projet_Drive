/**
 * Created by Marco de Coco on 11/04/2017.
 */
import {Injectable} from '@angular/core';
import {Http, Response } from '@angular/http';
import {Observable}     from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Folder} from "../model/Folder";
import {AFolder} from "../model/AFolder";



@Injectable()
export class dataAPI {

  private serveurGetDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Get?rep=";
  private serveurPostDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Upload?";
  private serveurDeleteDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Delete?rep=";
  private serveurRenameDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Rename?id=";
  private serveurInfoDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Info";
  private serveurmoveDrive: string = "http://localhost:8080/drive-service/rest/googleDrive/Move";


  private serveurGetDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Get?rep=";
  private serveurPostDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Upload?";
  private serveurDeleteDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Delete?rep=";
  private serveurRenameDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Rename?";
  private serveurInfoDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Info";
  private serveurMoveDropBox: string = "http://localhost:8080/drive-service/rest/DropBox/Move";



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

  public postDataDrive(current:AFolder, father:Folder){
  console.log("POSTDrive");
    if(father.getStringPath()!="") {
      this._http.post(this.serveurPostDrive + "name=" + current.name + "&parent=" + father.id, null).subscribe(files => {
        this.addId(files, current)
      });
    }
    else{
      this._http.post(this.serveurPostDrive + "name=" + current.name, null).subscribe(files => {
        this.addId(files, current)
      });
    }
}

  public postDataDropBox(current:AFolder, father:Folder){ //A modifier !!!
    console.log("POSTDrop");
    if(father.getStringPath()!="") {
      this._http.post(this.serveurPostDropBox + "path=" + father.getStringPath() +"/"+ current.name, null).subscribe();
    }
    else{
      this._http.post(this.serveurPostDropBox + "path=" + father.getStringPath() + current.name, null).subscribe();
    }
  }

  private addId(files, folder:AFolder){
    if (files.id != null){
      folder.id = files.id;
    }
  }

  public deleteDataDrive(folder:AFolder){
    this._http.delete(this.serveurDeleteDrive+folder.id).subscribe();
  }

  public deleteDataDropBox(folder:AFolder){
    this._http.delete(this.serveurDeleteDropBox+folder.getStringPath()).subscribe();
  }

  changeNameDrive(current:AFolder, name:string){
    this._http.post(this.serveurRenameDrive+current.id+"&name="+name, null).subscribe();
  }

  changeNameDropBox(current:AFolder, name:string){
    this._http.post(this.serveurRenameDropBox+"old="+current.getStringPath()+"&new="+current.getPathFather()+name, null).subscribe();
  }

  public getInfos(Information){
    this.getInfosDrive().subscribe(
      files => {
        this.addInfos(files, Information, "googleDrive")
      }, //Bind to view
      err => {
        // Log errors if any
        console.log(err);

      });


    this.getInfosDropBox().subscribe(
      files => {
        this.addInfos(files, Information,"dropBox")
      }, //Bind to view
      err => {
        // Log errors if any
        console.log(err);

      });
  }

  private getInfosDrive(): Observable<any[]>{
    return this._http.get(this.serveurInfoDrive)
      .map((res:Response) => res.json());
  }

  private getInfosDropBox(): Observable<any[]>{
    return this._http.get(this.serveurInfoDropBox)
      .map((res:Response) => res.json());
  }

  private addInfos(files, Information, drive:string){
      if (drive=="googleDrive"){
        Information.useOnDrive = files.use;
        Information.availableOnDrive = files.available;
      }
      else if(drive=="dropBox"){
        Information.useOnDropBox = files.use;
        Information.availableOnDropBox = files.available;
      }
      else{
        console.error("erreur d'infos du serveur");
      }
  }

  public moveDrive(copy:AFolder, father:AFolder){

  }

  public moveDropBox(copy:AFolder, father:AFolder){

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
        console.log(typeFile);
          currentFolder.addFileGetRequest(typeFile.name, typeFile.size, typeFile.share, typeFile.download, typeFile.id);
          currentFolder.getLastChildren().drivers.push(driver);
        }

      else if (typeFile.type == "folder"){

        let existAlready = false;

        for (let current of currentFolder.children){
          if (current.name == typeFile.name){
            var sharedFolder = current;
              existAlready = true;
          }
        }

        if (existAlready){
          sharedFolder.drivers.push(driver);
          if (driver == "googleDrive"){
            sharedFolder.id=typeFile.id;
          }
        }
        else {
          currentFolder.addFolderGetRequest(typeFile.name, typeFile.size, typeFile.id);
          currentFolder.getLastChildren().drivers.push(driver);
        }
      }
      else {
        console.error("type non reconnu")
      }
    }
  }

  public uploadDrive(files, father:Folder){
    if(father.getStringPath()!="") {
      this._http.post(this.serveurPostDrive + "name=" + files[0].name + "&parent=" + father.id, files[0]).subscribe();
    }
  else {
      this._http.post(this.serveurPostDrive + "name=" + files[0].name, files[0]).subscribe();
    }

  }

  public uploadDropBox(files, father:Folder){
    if(father.getStringPath()!="") {
      this._http.post(this.serveurPostDropBox + "path=" + father.getStringPath() +"/"+ files[0].name, files[0]).subscribe();
    }
    else{
      this._http.post(this.serveurPostDropBox + "path=" + father.getStringPath() + files[0].name, files[0]).subscribe();
    }
  }

}
