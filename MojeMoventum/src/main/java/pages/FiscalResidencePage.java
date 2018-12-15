package pages;

import org.openqa.selenium.By;

public class FiscalResidencePage {

    public FiscalResidencePage(String type) {
        this.countryFFRDrp = By.id("NewAccountPage1_NewAccountFiscalResidenceGroup_Country_FiscalResidence" + type);
        this.tinFFRInput = By.id("NewAccountPage1_NewAccountFiscalResidenceGroup_TaxIdentificationNumber_FiscalResidence" + type);
        this.reasonForNoTinFFRDrp = By.id("NewAccountPage1_NewAccountFiscalResidenceGroup_ReasonForNoTin_FiscalResidence" + type);
        this.commentFFRInput = By.id("NewAccountPage1_NewAccountFiscalResidenceGroup_Comments_FiscalResidence" + type);
    }

    private By countryFFRDrp;
    private By tinFFRInput;
    private By reasonForNoTinFFRDrp;
    private By commentFFRInput;
    private By yesBtn = By.xpath("//*[@id=\"NewAccountPage1_NewAccountFiscalResidenceGroup_LegalCompliance\"]/div/label[1]/span");

    public By getCountryFFRDrp() {
        return this.countryFFRDrp;
    }
    public By getTinFFRInput() {
        return this.tinFFRInput;
    }
    public By getReasonForNoTinFFRDrp() {
        return this.reasonForNoTinFFRDrp;
    }
    public By getCommentFFRInput() {
        return this.commentFFRInput;
    }
    public By getYesBtn() {
        return this.yesBtn;
    }
}
