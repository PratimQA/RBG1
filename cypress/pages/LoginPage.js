class rbgloginpage {
  elements = {
    usernameInput: () => cy.get("input[placeholder='Email']"),
    passwordInput: () => cy.get("input[placeholder='Password']"),
    loginBtn: () => cy.get(".btn.orangeBtn"),
    errorMessage: () => cy.get('.popupMessage > p:nth-child(1)'),
    forgetpasslink: () => cy.get('#root > div.mainComponent > div > div.loginRightPart > form > div:nth-child(4) > a')
  };

  typeUsername(username) {
    this.elements.usernameInput().type(username);
  }

  typePassword(password) {
    this.elements.passwordInput().type(password);
  }

  clickLogin() {
    this.elements.loginBtn().click();
  }

  submitLogin(username,password){
    this.elements.usernameInput().type(username);
    this.elements.passwordInput().type(password);
    this.elements.loginBtn().click();
  }

  frgtpasslinkvisibcheck(forgtlink){
    this.elements.forgetpasslink().should('be.visible');
  }

  //  errorMessagetext(errorMessage){
  //   cy.get('errorMessage').should('have.text', '<p>Invalid email or password</p>');
  //  }

}

module.exports = new rbgloginpage();
