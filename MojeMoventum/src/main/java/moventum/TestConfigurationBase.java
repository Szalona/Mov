package moventum;

import models.LoginModel;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public abstract class TestConfigurationBase {
    public String userName = "";
    public String password = "";
    public String url = "";

    public WebDriver driver;
    public WebDriverWait wait;

    public TestConfigurationBase() {
        this.driverInit();
        this.waitInit();
    }

    public WebElement waitUntil(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void expandDropDownAndClickOption(By dropDown, int position) {
        WebElement dropDownElement = driver.findElement(dropDown);
        dropDownElement.click();
        dropDownElement.findElement(By.xpath("option[" + position + "]")).click();
    }

    public void login() {
        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(this.userName);
        loginModel.setPassword(this.password);

        LoginPage loginPage = new LoginPage();
        driver.findElement(loginPage.getUsernameInput()).sendKeys(loginModel.getUsername());
        driver.findElement(loginPage.getPasswordInput()).sendKeys(loginModel.getPassword());
        driver.findElement(loginPage.getSubmitBtn()).click();

        waitUntil(loginPage.getIndexLink());
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, this.url);
        System.out.println(URL);
    }

    public void closePage() {
        driver.quit();
    }

    private void driverInit() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("");
            driver.manage().window().maximize();
        }
    }

    private void waitInit() {
        this.wait = new WebDriverWait(driver, 300);
    }
}
