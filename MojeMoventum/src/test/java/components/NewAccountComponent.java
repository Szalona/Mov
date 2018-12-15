package components;

import models.*;
import moventum.TestConfigurationBase;
import pages.*;

public class NewAccountComponent extends TestConfigurationBase {

    public void completeNewAccount() {
        NewAccountPage newAccountPage = new NewAccountPage();
        waitUntil(newAccountPage.getAccountBrowse());
        driver.findElement(newAccountPage.getAccountBrowse()).click();
        driver.findElement(newAccountPage.getAccountItem()).click();
        driver.findElement(newAccountPage.getPersonalItem()).click();
    }

    public void completeBaseInfo(){
        BasicInfoModel basicInfoModel = new BasicInfoModel();
        basicInfoModel.setAccountName("Sergi");

        BasicInfoPage basicInfoPage = new BasicInfoPage();
        waitUntil(basicInfoPage.getMoreInfoBtn());
        expandDropDownAndClickOption(basicInfoPage.getAccountTypeDrp(), 13);
        waitUntil(basicInfoPage.getServiceFeeDrp());
        expandDropDownAndClickOption(basicInfoPage.getServiceFeeDrp(), 6);
        driver.findElement(basicInfoPage.getAccountNameInput()).sendKeys(basicInfoModel.getAccountName());
        waitUntil(basicInfoPage.getCurrencyDrp());
        expandDropDownAndClickOption(basicInfoPage.getCurrencyDrp(),2);
        waitUntil(basicInfoPage.getMoreInfoBtn());
        driver.findElement(basicInfoPage.getMoreInfoBtn()).click();
        waitUntil(basicInfoPage.getCommissionDiscountDrp());
        expandDropDownAndClickOption(basicInfoPage.getCommissionDiscountDrp(), 5);
        driver.findElement(basicInfoPage.getOkBtn()).click();
    }

    public void completePersonalDetail() {
        PersonalDetailModel personalDetailModel = new PersonalDetailModel();
        personalDetailModel.setFirstName("Sergiusz");
        personalDetailModel.setLastName("Sergiejski");
        personalDetailModel.setStreetName("Warszawska");
        personalDetailModel.setStreetNbr("30");
        personalDetailModel.setPostalCode("24-234");
        personalDetailModel.setCity("Poznań");
        personalDetailModel.setDateOfBirth("24.09.1976");
        personalDetailModel.setCityOfBirth("Poznań");
        personalDetailModel.setNameOfEmployer("Sergiusz");

        PersonalDetailPage personalDetailPage = new PersonalDetailPage();
        expandDropDownAndClickOption(personalDetailPage.getTitleDrp(), 4);
        driver.findElement(personalDetailPage.getFirstNameInput()).sendKeys(personalDetailModel.getFirstName());
        driver.findElement(personalDetailPage.getLastNameInput()).sendKeys(personalDetailModel.getLastName());
        driver.findElement(personalDetailPage.getStreetNameInput()).sendKeys(personalDetailModel.getStreetName());
        driver.findElement(personalDetailPage.getStreetNbrInput()).sendKeys(personalDetailModel.getStreetNbr());
        driver.findElement(personalDetailPage.getPostalCodeInput()).sendKeys(personalDetailModel.getPostalCode());
        driver.findElement(personalDetailPage.getCityInput()).sendKeys(personalDetailModel.getCity());
        expandDropDownAndClickOption(personalDetailPage.getCountryDrp(), 176);
        driver.findElement(personalDetailPage.getDateOfBirthInput()).sendKeys(personalDetailModel.getDateOfBirth());
        driver.findElement(personalDetailPage.getCityOfBirthInput()).sendKeys(personalDetailModel.getCityOfBirth());
        expandDropDownAndClickOption(personalDetailPage.getCountryOfBirthDrp(), 176);
        expandDropDownAndClickOption(personalDetailPage.getNationalityDrp(), 169);
        expandDropDownAndClickOption(personalDetailPage.getMaritalStatusDrp(), 3);
        expandDropDownAndClickOption(personalDetailPage.getEmploymentStatusDrp(), 2);
        expandDropDownAndClickOption(personalDetailPage.getOccupationDrp(), 33);
        driver.findElement(personalDetailPage.getNameOfEmployerInput()).sendKeys(personalDetailModel.getNameOfEmployer());
    }

    public void completeFiscalResidence() {
        FiscalResidenceModel fiscalResidenceModel = new FiscalResidenceModel();
        fiscalResidenceModel.setTin("663123654");

        FiscalResidencePage fiscalResidencePage = new FiscalResidencePage("First");
        expandDropDownAndClickOption(fiscalResidencePage.getCountryFFRDrp(), 171);
        driver.findElement(fiscalResidencePage.getTinFFRInput()).sendKeys(fiscalResidenceModel.getTin());
        driver.findElement(fiscalResidencePage.getYesBtn()).click();
    }

    public void completeDisbursement() {
        DisbursementModel disbursementModel = new DisbursementModel();
        disbursementModel.setName("Sergiusz");
        disbursementModel.setAccountNumber("6639821234");
        disbursementModel.setSwiftCode("6639821234");
        disbursementModel.setBankName("Sergiej");

        DisbursementPage disbursementPage = new DisbursementPage();
        waitUntil(disbursementPage.getDisbursementBankNameInput());
        driver.findElement(disbursementPage.getDisbursementNameInput()).sendKeys(disbursementModel.getName());
        expandDropDownAndClickOption(disbursementPage.getDisbursementCountryDrp(), 171);
        driver.findElement(disbursementPage.getDisbursementAccountNumberInput()).sendKeys(disbursementModel.getAccountNumber());
        driver.findElement(disbursementPage.getDisbursementVerifyIbanBtn()).click();
        driver.findElement(disbursementPage.getDisbursementSwiftCodeInput()).sendKeys(disbursementModel.getSwiftCode());
        driver.findElement(disbursementPage.getDisbursementResearchToolBtn()).click();
        driver.findElement(disbursementPage.getDisbursementBankNameInput()).sendKeys(disbursementModel.getBankName());
    }

    public void completeFinancialSituation() {
        FinancialSituationPage financialSituationPage = new FinancialSituationPage();
        waitUntil(financialSituationPage.getNetAssetsDrp());
        expandDropDownAndClickOption(financialSituationPage.getNetAssetsDrp(), 4);
        expandDropDownAndClickOption(financialSituationPage.getDerivesFromDrp(), 4);
    }

    public void completeInvestment() {
        InvestmentPage investmentPage = new InvestmentPage();
        driver.findElement(investmentPage.getConservativeBtn()).click();
        driver.findElement(investmentPage.getActBtn()).click();
    }

    public void completeSign() {
        SignModel signModel = new SignModel();
        signModel.setPlaceAndDate("Sergiusz");

        SignPage signPage = new SignPage();
        driver.findElement(signPage.getScaBtn()).click();
        driver.findElement(signPage.getPlaceAndDateInput()).sendKeys(signModel.getPlaceAndDate());
    }
}
