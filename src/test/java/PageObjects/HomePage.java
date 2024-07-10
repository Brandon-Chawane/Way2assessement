package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[contains(@class,'icon icon-plus')]")
    public static WebElement addUserBtn;

    @FindBy(xpath = "//input[contains(@name,'FirstName')]")
    public static WebElement txtFirstName;

    @FindBy(xpath = "//input[contains(@name,'LastName')]")
    public static WebElement txtLastName;

    @FindBy(xpath = "//input[contains(@name,'UserName')]")
    public static WebElement txtUserName;

    @FindBy(xpath = "//input[contains(@type,'password')]")
    public static WebElement txtPassword;

    @FindBy(xpath = "//input[contains(@value,'15')]")
    public static WebElement rBtnCompanyAAA;

    @FindBy(xpath = "//input[contains(@value,'16')]")
    public static WebElement rBtnCompanyBBB;

    @FindBy(xpath = "//select[contains(@name,'RoleId')]")
    public static WebElement role;

    @FindBy(xpath = "//input[contains(@type,'email')]")
    public static WebElement txtEmailAddress;

    @FindBy(xpath = "//input[contains(@name,'Mobilephone')]")
    public static WebElement txtCell;

    @FindBy(xpath = "//button[@ng-click='save(user)'][contains(.,'Save')]")
    public static WebElement btnSave;

    public static String expectedTitle = "Protractor practice website - WebTables";

    @FindBy(xpath = "//td[@ng-repeat='column in columns'][contains(.,'FName1')]")
    public static  WebElement validateFirstEntry;

    @FindBy(xpath = "//td[@ng-repeat='column in columns'][contains(.,'FName2')]")
    public static WebElement validateSecondEntry;
}
