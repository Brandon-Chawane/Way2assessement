package Tests;

import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Report.ExtentReportManager.takeSnapShot;

public class TC001_Validating_Users extends BaseClass {

    @Test
    public void validateUserListTable() throws Exception {
        logger.info("***Starting Validating users tests***");
        HomePage hp = new HomePage(driver);
        try {
            logger.info("*Validating user table*");
            String expectedTitle = hp.getTitle();
            String title = driver.getTitle();
            Assert.assertEquals(title, expectedTitle);
            //System.out.println(expectedTitle);
        } catch (Exception e) {
            takeSnapShot(driver, "validatingUserTableFailed");
            Assert.fail();
            throw new Exception(e.getMessage());
        }
    }


    @Test(dependsOnMethods = "validateUserListTable")
    public void addFirstUser() throws Exception {
        HomePage hp = new HomePage(driver);
        logger.info("*Adding first user*");
        try {
            hp.clickAddButton();
            hp.setFirstName(p.getProperty("firstUser-Name"));
            hp.setLastName(p.getProperty("firstUser-LastName"));
            hp.setUserName(p.getProperty("firstUser-UserName"));
            hp.setPassword(p.getProperty("firstUser-Password"));
            hp.clickFirstCustomerCompany();
            hp.setRole(p.getProperty("firstUser-Role"));
            hp.setEmailAddress(p.getProperty("firstUser-Email"));
            hp.setCell(p.getProperty("firstUser-Cell"));
            hp.clickSaveButton();
            boolean firstUser = hp.verifyingFirstUser();
            Assert.assertTrue(firstUser);
        } catch (Exception e) {
            takeSnapShot(driver, "addFirstUserFailed");
            logger.error("Add First User Test Failed");
            Assert.fail();
        }

    }


    @Test(dependsOnMethods = "addFirstUser")
    public void addSecondUser() throws Exception {
        HomePage hp = new HomePage(driver);
        logger.info("*Adding second user*");
        try {
            hp.clickAddButton();
            hp.setFirstName(p.getProperty("secondUser-Name"));
            hp.setLastName(p.getProperty("secondUser-LastName"));
            hp.setUserName(p.getProperty("secondUser-UserName"));
            hp.setPassword(p.getProperty("secondUser-Password"));
            hp.clickSecondCustomerCompany();
            hp.setRole(p.getProperty("secondUser-Role"));
            hp.setEmailAddress(p.getProperty("firstUser-Email"));
            hp.setCell(p.getProperty("secondUser-Cell"));
            hp.clickSaveButton();
            boolean secondUser = hp.verifyingSecondUser();
            Assert.assertTrue(secondUser);

        } catch (Exception e) {
            takeSnapShot(driver, "addSecondUserFailed");
            logger.error("Add Second User Test Failed");
            Assert.fail();
        }
        logger.info("***Validating users tests Finished***");


    }


}
