import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { AppComponent } from './app.component';
import { FolderComponent } from './components/folder/folder.component';
import {dataAPI} from "./services/dataAPI";
import { RouterModule, Routes } from '@angular/router';
//import { TreeViewComponent } from './components/tree-view/tree-view.component';


@NgModule({
  declarations: [
    AppComponent,
    FolderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule,
  ],
  providers: [dataAPI],
  bootstrap: [AppComponent]
})
export class AppModule { }
