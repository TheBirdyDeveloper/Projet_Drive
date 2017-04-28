/**
 * Created by Clément on 28/04/2017.
 */

export class JSON{

  name:string;

  constructor(name) {

  }

  getJSON(){
    return "{"+this.name+"}"
  }
}
