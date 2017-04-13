import { Component } from '@angular/core';
import {Folder} from "./model/Folder";
import {File} from "./model/File";
import {dataAPI} from "./services/dataAPI";


@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']

})

export class AppComponent {
  public mainFolder = new Folder("root");

  //myApi : dataAPI;


  constructor(private myApi : dataAPI){
    this.myApi.getBasicData().subscribe(
      files => {this.addData(files)}, //Bind to view
      err => {
        // Log errors if any
        console.log(err);
      });

  }

  addData(root){
    for(let typeFile of root.data){
      if(typeFile.type == "file"){
        // console.log(typeFile.name)
        //var result=JSON.parse(typeFile);
        //console.log(result);
        this.mainFolder.children.push(new File(typeFile.name));
      }
      else if (typeFile.type == "folder"){
        // console.log(typeFile.name)
        this.mainFolder.children.push(new Folder(typeFile.name));
        this.addChildren(typeFile.children, this.mainFolder.getLastChildren());

      }
      else {
        console.error("type non reconnu")
      }
    }
  }

  addChildren(children, currentFolder){
    for(let typeFile of children){
      if(typeFile.type == "file"){
        currentFolder.children.push(new File(typeFile.name));
        currentFolder.children = currentFolder.children.slice();
      }
      else if (typeFile.type == "folder"){
        // console.log(typeFile.name)
        var newFolder = new Folder(typeFile.name);
        currentFolder.children.push(new Folder(typeFile.name));
        this.addChildren(typeFile.children, currentFolder.getLastChildren());
      }
      else {
        console.error("type non reconnu")
      }
    }
    //console.log(currentFolder.children.length);
  }

}
