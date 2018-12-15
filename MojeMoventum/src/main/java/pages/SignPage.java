package pages;

import org.openqa.selenium.By;

public class SignPage {
    private By scaBtn = By.xpath("//*[@id=\"NewPersonalAccountViewModel\"]/div[3]/div/div/div[3]/div/div/div[21]/div/label/span");
    private By placeAndDateInput = By.id("NewAccountPage3_PlaceAndDate");


    public By getScaBtn() {
        return this.scaBtn;
    }
    public By getPlaceAndDateInput() {
        return this.placeAndDateInput;
    }

}
