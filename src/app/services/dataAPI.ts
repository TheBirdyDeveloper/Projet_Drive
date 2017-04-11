/**
 * Created by Marco de Coco on 11/04/2017.
 */
import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Headers, RequestOptions} from '@angular/http';
import {Observable}     from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';


@Injectable()
export class dataAPI {
  private _dataUrl: string = "NOTRE SERVEUR";

  constructor(private _http: Http) {}

  private getBasicData(): Observable<Response>{
    return this._http.get(this._dataUrl).map(this.extractData).catch(this.handleError);
  }

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

  private extractData(res : Response) {
    let body = res.json();
    return {data : body.data, type : body.type || null} || {};
  }

  private newFolder(chemin : string, name : string): Observable<any> {
    let data = { path:chemin, name:name};
    // à voir
    return this._http.post(`${this._dataUrl}/new-folder`, JSON.stringify(data)).map(this.extractData).catch(this.handleError);
  }







}
