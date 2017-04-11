import { ProjetDrivePage } from './app.po';

describe('projet-drive App', () => {
  let page: ProjetDrivePage;

  beforeEach(() => {
    page = new ProjetDrivePage();
  });

  it('should display message saying appMain works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('appMain works!');
  });
});
