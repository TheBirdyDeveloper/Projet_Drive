/**
 * Created by Marco de Coco on 16/04/2017.
 */

import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {FolderComponent} from "./components/folder/folder.component";
import {LoginComponent} from "./components/login/login.component";
import {AppComponent} from "./app.component";
import {MainPageComponent} from "./components/main-page/main-page.component";


export const routes: Routes = [
  { path: '', component : LoginComponent },
  { path: 'login', component : LoginComponent },
  { path: 'home', component : MainPageComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes);
