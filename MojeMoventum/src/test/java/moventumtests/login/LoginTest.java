package moventumtests.login;

import models.LoginModel;
import org.junit.Assert;
import pages.LoginPage;
import moventum.TestConfigurationBase;
import org.testng.annotations.Test;

public class LoginTest extends TestConfigurationBase {

    @Test
    public void correctLogin() {
        //given
        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(super.userName);
        loginModel.setPassword(super.password);

        //when
        LoginPage loginPage = new LoginPage();
        driver.findElement(loginPage.getUsernameInput()).sendKeys(loginModel.getUsername());
        driver.findElement(loginPage.getPasswordInput()).sendKeys(loginModel.getPassword());
        driver.findElement(loginPage.getSubmitBtn()).click();
        waitUntil(loginPage.getIndexLink());

        //then
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, loginModel.getUrl());
        System.out.println(URL);
    }

    @Test
    public void incorrectLogin() {
        //given
        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(super.userName);
        loginModel.setPassword("movweb2015");

        //when
        LoginPage loginPage = new LoginPage();
        driver.findElement(loginPage.getUsernameInput()).sendKeys(loginModel.getUsername());
        driver.findElement(loginPage.getPasswordInput()).sendKeys(loginModel.getPassword());
        driver.findElement(loginPage.getSubmitBtn()).click();
        waitUntil(loginPage.getIndexLink());

        //then
        String actual =  waitUntil(loginPage.getWrongPassword()).getText();
        Assert.assertEquals("Wrong password", "Login or password is invalid", actual);
        System.out.println("Wrong password");
    }
}
