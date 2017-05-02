/**
 * Created by Clément on 02/05/2017.
 */
export class Information {

  private _availableOnDrive:number;
  private _useOnDrive:number;
  private _availableOnDropBox:number;
  private _useOnDropBox:number;

  constructor() {

  }

  get availableOnDrive(): number {
    return this._availableOnDrive;
  }

  set availableOnDrive(value: number) {
    this._availableOnDrive = value;
  }

  get useOnDrive(): number {
    return this._useOnDrive;
  }

  set useOnDrive(value: number) {
    this._useOnDrive = value;
  }

  get availableOnDropBox(): number {
    return this._availableOnDropBox;
  }

  set availableOnDropBox(value: number) {
    this._availableOnDropBox = value;
  }

  get useOnDropBox(): number {
    return this._useOnDropBox;
  }

  set useOnDropBox(value: number) {
    this._useOnDropBox = value;
  }

}
