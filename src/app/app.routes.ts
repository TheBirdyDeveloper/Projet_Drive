/**
 * Created by Marco de Coco on 16/04/2017.
 */

import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {FolderComponent} from "./components/folder/folder.component";
import {LoginComponent} from "./components/login/login.component";
import {AppComponent} from "./app.component";
import {MainPageComponent} from "./components/main-page/main-page.component";
import {AuthGuard} from "./services/auth.guard";
import {RegisterComponent} from "./components/register/register.component";

export const routes: Routes = [
  { path: '', component : LoginComponent },
  { path: 'home', component : MainPageComponent, canActivate: [AuthGuard]},
  { path: 'register', component : RegisterComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes);
