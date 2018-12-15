package pages;

import org.openqa.selenium.By;

public class BasicInfoPage {
    private By faNumberInput = By.id("NewAccountPage1_NewAccountBasicInfo_IfaNumber");
    private By accountTypeDrp = By.id("NewAccountPage1_NewAccountBasicInfo_MoventumAccountType");
    private By serviceFeeDrp = By.id("NewAccountPage1_NewAccountBasicInfo_ServiceFee");
    private By accountNameInput = By.id("NewAccountPage1_NewAccountBasicInfo_AccountName");
    private By currencyDrp = By.id("NewAccountPage1_NewAccountBasicInfo_Currency");
    private By moreInfoBtn = By.id("NewAccountPage1_NewAccountBasicInfo_MoreInfo");
    private By commissionDiscountDrp = By.id("DiscountViewModel_Discount");
    private By okBtn = By.id("DiscountViewModel_OkButton");

    public By getFaNumberInput() {
        return this.faNumberInput;
    }
    public By getAccountTypeDrp() {
        return this.accountTypeDrp;
    }
    public By getServiceFeeDrp() {
        return this.serviceFeeDrp;
    }
    public By getAccountNameInput() {
        return this.accountNameInput;
    }
    public By getCurrencyDrp() {
        return this.currencyDrp;
    }
    public By getMoreInfoBtn() {
        return this.moreInfoBtn;
    }
    public By getCommissionDiscountDrp() {
        return this.commissionDiscountDrp;
    }
    public By getOkBtn() {
        return this.okBtn;
    }
}
