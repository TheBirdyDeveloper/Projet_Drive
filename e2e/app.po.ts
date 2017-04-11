import { browser, element, by } from 'protractor';

export class ProjetDrivePage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('appMain-root h1')).getText();
  }
}
