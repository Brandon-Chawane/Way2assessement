package PageObjects;

import WebUtilities.WebActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//i[contains(@class,'icon icon-plus')]")
    private WebElement addUserBtn;

    @FindBy(xpath = "//input[contains(@name,'FirstName')]")
    private WebElement txtFirstName;

    @FindBy(xpath = "//input[contains(@name,'LastName')]")
    private WebElement txtLastName;

    @FindBy(xpath = "//input[contains(@name,'UserName')]")
    private WebElement txtUserName;

    @FindBy(xpath = "//input[contains(@type,'password')]")
    private WebElement txtPassword;

    @FindBy(xpath = "//input[contains(@value,'15')]")
    private WebElement rBtnCompanyAAA;

    @FindBy(xpath = "//input[contains(@value,'16')]")
    private WebElement rBtnCompanyBBB;

    @FindBy(xpath = "//select[contains(@name,'RoleId')]")
    private WebElement role;

    @FindBy(xpath = "//input[contains(@type,'email')]")
    private WebElement txtEmailAddress;

    @FindBy(xpath = "//input[contains(@name,'Mobilephone')]")
    private WebElement txtCell;

    @FindBy(xpath = "//button[@ng-click='save(user)'][contains(.,'Save')]")
    private WebElement btnSave;

    public String expectedTitle = "Protractor practice website - WebTables";


    @FindBy(xpath = "//td[@ng-repeat='column in columns'][contains(.,'FName1')]")
    private WebElement validateFirstEntry;

    @FindBy(xpath = "//td[@ng-repeat='column in columns'][contains(.,'FName2')]")
    private WebElement validateSecondEntry;

    WebActions wa = new WebActions(driver);

    //Action Methods

    public void clickAddButton() {
        wa.click(addUserBtn);
    }

    public void setFirstName(String firstname) {
        wa.enterValue(txtFirstName, firstname);
    }

    public void setLastName(String lastname) {
        wa.enterValue(txtLastName, lastname);
    }

    public void setUserName(String username) {
        wa.enterValue(txtUserName, username);
    }

    public void clickFirstCustomerCompany() {
        wa.click(rBtnCompanyAAA);
    }
    public void clickSecondCustomerCompany() {
        wa.click(rBtnCompanyBBB);
    }

    public void setPassword(String password) {
        wa.enterValue(txtPassword, password);
    }

    public void setRole(String roleSelect) {
        wa.dropDownMenuSelect(role, roleSelect);
    }

    public void setEmailAddress(String emailAddress) {
        wa.enterValue(txtEmailAddress, emailAddress);
    }

    public void setCell(String cellPhoneNumber) {
        wa.enterValue(txtCell, cellPhoneNumber);
    }

    public void clickSaveButton() {
        wa.click(btnSave);
    }

    public String getTitle(){
        return expectedTitle;
    }

    public boolean verifyingFirstUser() {
        try {
            return (validateFirstEntry.isDisplayed());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyingSecondUser() {
        try {
            return (validateSecondEntry.isDisplayed());
        } catch (Exception e) {
            return false;
        }
    }
}





