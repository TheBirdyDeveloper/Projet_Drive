import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { AppComponent } from './app.component';
import { FolderComponent } from './components/folder/folder.component';
import {dataAPI} from "./services/dataAPI";
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { routing } from './app.routes';
import { MainPageComponent } from './components/main-page/main-page.component';
import {LoginService} from "./services/login.service";



@NgModule({
  declarations: [
    AppComponent,
    FolderComponent,
    LoginComponent,
    MainPageComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule,
    routing
    ],
  providers: [dataAPI, LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
