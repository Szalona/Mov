package pages;

import org.openqa.selenium.By;

public class LoginPage {

    private By indexLink = By.id("IndexLink");
    private By usernameInput = By.id("Login_UserName");
    private By passwordInput = By.id("Login_Password");
    private By submitBtn = By.id("Login_Submit");
    private By wrongPassword = By.xpath("//*[@id=\"LoginViewModel\"]/div[2]/div/div/span/span");

    public By getIndexLink() {
        return this.indexLink;
    }

    public By getUsernameInput() {
        return this.usernameInput;
    }

    public By getPasswordInput() {
        return this.passwordInput;
    }

    public By getSubmitBtn() {
        return this.submitBtn;
    }

    public By getWrongPassword() {
        return this.wrongPassword;
    }
}
