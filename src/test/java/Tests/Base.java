package Tests;


import PageObjects.HomePage;
import WebUtilities.BrowserFactory;
import org.openqa.selenium.WebDriver;


public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.way2automation.com/angularjs-protractor/webtables/");

    HomePage homePage = new HomePage(driver);



}
