import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { FolderComponent } from '../components/folder/folder.component';
import {dataAPI} from "../services/dataAPI";



@NgModule({
  declarations: [
    AppComponent,
    FolderComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [dataAPI],
  bootstrap: [AppComponent]
})
export class AppModule { }
