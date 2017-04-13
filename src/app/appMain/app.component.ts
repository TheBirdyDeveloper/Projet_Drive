import { Component } from '@angular/core';
import {Folder} from "../model/Folder";
import {File} from "../model/File";
import {dataAPI} from "../services/dataAPI";


@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']

})

export class AppComponent {
  folder = new Folder("root");
  //myApi : dataAPI;


  constructor(private myApi : dataAPI){
    this.myApi.getBasicData().subscribe(
      files => this.addData(files), //Bind to view
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
        let newFile = new File(typeFile.name);
      }
      else if (typeFile.type == "folder"){
        // console.log(typeFile.name)
        this.showChildren(typeFile.children);
      }
      else {
        console.error("type non reconnu")
      }
    }
  }

  showChildren(children){
    for(let typeFile of children){
      if(typeFile.type == "file"){
        // console.log(typeFile.name)
      }
      else if (typeFile.type == "folder"){
        // console.log(typeFile.name)
        this.showChildren(typeFile.children);
      }
      else {
        console.error("type non reconnu")
      }
    }
  }

}
