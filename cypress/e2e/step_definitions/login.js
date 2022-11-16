import {
  Given,
  When,
  Then,
} from "@badeball/cypress-cucumber-preprocessor";
const loginPage = require("../../pages/LoginPage");



Given("A user opens Red Belt Gyms website", () => {
  cy.visit("/");
});



Then("page title should be verified", () => {
  cy.title().should("contains", "Red Belt Gym");
});



When("user enters username {string}", (username) => {
  loginPage.typeUsername(username);
});



Then("user enters password {string}", (password) =>{
  loginPage.typePassword(password);
});



Then("user gets the title of the dashboard page", () => {
  cy.title().should("contains", "Red Belt Gym");
});



When("user provides incorrect credentials", (table) => {
  table.hashes().forEach((row) => {
    cy.log(row.username);
    cy.log(row.password);
    loginPage.typeUsername(row.username);
    loginPage.typePassword(row.password);
  })
  });




Then("user clicks on Login button", () => {
  loginPage.clickLogin();
}); 




Then("forgot password link should be displayed", () => {
   //loginPage.forgetlink(forgetpasslink);
   loginPage.frgtpasslinkvisibcheck;
  });



Then("error message {string} should be displayed", () => {
  cy.wait(20000);
  loginPage.elements.errorMessage().should("have.text", "Invalid email or password");
  //loginPage.errorMessagetext();
});
