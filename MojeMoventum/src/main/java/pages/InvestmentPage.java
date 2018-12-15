package pages;

import org.openqa.selenium.By;

public class InvestmentPage {
    private By conservativeBtn = By.xpath("//*[@id=\"NewAccountPage3_InvestmentObjectives\"]/div/label[1]/span");
    private By actBtn = By.xpath("//*[@id=\"NewPersonalAccountViewModel\"]/div[3]/div/div/div[3]/div/div/div[19]/div/label/span");

    public By getConservativeBtn() {
        return this.conservativeBtn;
    }
    public By getActBtn() {
        return this.actBtn;
    }
}
