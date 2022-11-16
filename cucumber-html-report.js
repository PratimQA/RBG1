const report = require("multiple-cucumber-html-reporter");
report.generate({
  jsonDir: "jsonlogs", // ** Path of .json file **//
  reportPath: "./reports/cucumber-htmlreport.html",
  metadata: {
    browser: {
      name: "electron",
      version: "106",
    },
    device: "Local test machine",
    platform: {
      name: "Linux",
      version: "20.04",
    },
  },
});
