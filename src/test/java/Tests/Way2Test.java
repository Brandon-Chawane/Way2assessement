package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static PageObjects.HomePage.*;
import static WebUtilities.WebActions.*;

public class Way2Test extends Base {

    @Test
    public void validateUserListTable() throws Exception {
        try {
            String title = driver.getTitle();
            Assert.assertEquals(title, expectedTitle);
            System.out.println(title);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Test(dependsOnMethods = "validateUserListTable")
    public void addFirstUser() throws Exception {
        try {
            click(addUserBtn);
            enterValue(txtFirstName, "FName1");
            enterValue(txtLastName, "LName1");
            enterValue(txtUserName, "User1");
            enterValue(txtPassword, "Pass1");
            click(rBtnCompanyAAA);
            dropDownMenuSelect(role, "Admin");
            enterValue(txtEmailAddress, "admin@mail.com");
            enterValue(txtCell, "082555");
            click(btnSave);
            Assert.assertTrue(validateFirstEntry.isDisplayed());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Test(dependsOnMethods = "addFirstUser")
    public void addSecondUser() throws Exception {
        try {
            click(addUserBtn);
            enterValue(txtFirstName, "FName2");
            enterValue(txtLastName, "LName2");
            enterValue(txtUserName, "User2");
            enterValue(txtPassword, "Pass2");
            click(rBtnCompanyBBB);
            dropDownMenuSelect(role, "Customer");
            enterValue(txtEmailAddress, "customer@mail.com");
            enterValue(txtCell, "083444");
            click(btnSave);
            Assert.assertTrue(validateSecondEntry.isDisplayed());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @AfterTest
    public void tearDown() throws Exception {
        try {
            driver.quit();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

}
