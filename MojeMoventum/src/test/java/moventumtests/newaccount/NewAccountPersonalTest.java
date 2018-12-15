package moventumtests.newaccount;

import components.NewAccountComponent;
import org.junit.Assert;
import org.testng.annotations.*;
import pages.*;

public class NewAccountPersonalTest extends NewAccountComponent {

    @BeforeMethod
    public void loginPlatform() {
        super.login();
    }

    @Test
    public void shouldNotCreateNewAccountPersonal() {

        NewAccountPage newAccountPage = new NewAccountPage();

//        BasicInfoModel basicInfoModel = new BasicInfoModel();
//        // SET MODEL
//        BasicInfoPage basicInfoPage = new BasicInfoPage();
//        basicInfoPage.setModel(driver, basicInfoModel);

//        BasicInfoModel basicInfoModel = new BasicInfoModel();
//        // SET MODEL
//        super.completeBaseInfo(basicInfoModel);


        super.completeNewAccount();
        super.completeBaseInfo();
        super.completePersonalDetail();
        super.completeFiscalResidence();
        driver.findElement(newAccountPage.getNextBtn()).click();
        super.completeDisbursement();
        driver.findElement(newAccountPage.getNextBtn()).click();
        super.completeFinancialSituation();
        super.completeInvestment();
        super.completeSign();
        driver.findElement(newAccountPage.getSendBtn()).click();

        String actual =  waitUntil(newAccountPage.getMessageBtn()).getText();
        Assert.assertNotEquals("Not working", "Account " + super.userName + " has been successfully transmitted for FA# %s. Save was successful", actual);
        System.out.println("Not working");
    }

    @Test
    public void shouldCreateNewAccountPersonal() {

        NewAccountPage newAccountPage = new NewAccountPage();

        super.completeNewAccount();
        super.completeBaseInfo();
        super.completePersonalDetail();
        super.completeFiscalResidence();
        driver.findElement(newAccountPage.getNextBtn()).click();
        super.completeDisbursement();
        driver.findElement(newAccountPage.getNextBtn()).click();
        super.completeFinancialSituation();
        super.completeInvestment();
        super.completeSign();
        driver.findElement(newAccountPage.getSendBtn()).click();

        String actual =  waitUntil(newAccountPage.getMessageBtn()).getText();
        Assert.assertEquals("Working", "Account " + super.userName + " has been successfully transmitted for FA# %s. Save was successful", actual);
        System.out.println("Working");
    }

    @AfterMethod
    public void quitPlatform() {
        super.closePage();
    }
}