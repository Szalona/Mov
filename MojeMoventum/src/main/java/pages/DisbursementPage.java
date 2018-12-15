package pages;

import org.openqa.selenium.By;

public class DisbursementPage {
    private By disbursementNameInput = By.id("NewAccountPage2_NewAccountDisbursementAccount_Name");
    private By disbursementCountryDrp = By.id("NewAccountPage2_NewAccountDisbursementAccount_Country");
    private By disbursementAccountNumberInput = By.id("NewAccountPage2_NewAccountDisbursementAccount_Number");
    private By disbursementVerifyIbanBtn = By.id("NewAccountPage2_NewAccountDisbursementAccount_VerifyIban");
    private By disbursementSwiftCodeInput = By.id("NewAccountPage2_NewAccountDisbursementAccount_SwiftCode");
    private By disbursementResearchToolBtn = By.id("NewAccountPage2_NewAccountDisbursementAccount_ResearchTool");
    private By disbursementBankNameInput = By.id("NewAccountPage2_NewAccountDisbursementAccount_BankName");

    public By getDisbursementNameInput(){
        return this.disbursementNameInput;
    }
    public By getDisbursementCountryDrp() {
        return this.disbursementCountryDrp;
    }
    public By getDisbursementAccountNumberInput() {
        return this.disbursementAccountNumberInput;
    }
    public By getDisbursementVerifyIbanBtn() {
        return this.disbursementVerifyIbanBtn;
    }
    public By getDisbursementSwiftCodeInput() {
        return this.disbursementSwiftCodeInput;
    }
    public By getDisbursementResearchToolBtn() {
        return this.disbursementResearchToolBtn;
    }
    public By getDisbursementBankNameInput() {
        return this.disbursementBankNameInput;
    }
}
