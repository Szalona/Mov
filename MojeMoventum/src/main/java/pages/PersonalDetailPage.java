package pages;

import org.openqa.selenium.By;

public class PersonalDetailPage {
    private By titleDrp = By.id("NewAccountPage1_NewAccountPersonalDetails_Title");
    private By firstNameInput = By.id("NewAccountPage1_NewAccountPersonalDetails_FirstName");
    private By lastNameInput = By.id("NewAccountPage1_NewAccountPersonalDetails_LastName");
    private By streetNameInput = By.id("NewAccountPage1_NewAccountPersonalDetails_StreetName");
    private By streetNbrInput = By.id("NewAccountPage1_NewAccountPersonalDetails_StreetNumber");
    private By postalCodeInput = By.id("NewAccountPage1_NewAccountPersonalDetails_PostalCode");
    private By cityInput = By.id("NewAccountPage1_NewAccountPersonalDetails_City");
    private By countryDrp = By.id("NewAccountPage1_NewAccountPersonalDetails_Country");
    private By dateOfBirthInput = By.id("NewAccountPage1_NewAccountPersonalDetails_DateOfBirth");
    private By cityOfBirthInput = By.id("NewAccountPage1_NewAccountPersonalDetails_CityOfBirth");
    private By countryOfBirthDrp = By.id("NewAccountPage1_NewAccountPersonalDetails_CountryOfBirth");
    private By nationalityDrp = By.id("NewAccountPage1_NewAccountPersonalDetails_Nationality");
    private By maritalStatusDrp = By.id("NewAccountPage1_NewAccountPersonalDetails_MaritalStatus");
    private By employmentStatusDrp = By.id("NewAccountPage1_NewAccountPersonalDetails_EmploymentStatus");
    private By occupationDrp = By.id("NewAccountPage1_NewAccountPersonalDetails_Occupation");
    private By nameOfEmployerInput = By.id("NewAccountPage1_NewAccountPersonalDetails_NameOfEmployer");

    public By getTitleDrp() {
        return this.titleDrp;
    }
    public By getFirstNameInput() {
        return this.firstNameInput;
    }
    public By getLastNameInput() {
        return this.lastNameInput;
    }
    public By getStreetNameInput() {
        return this.streetNameInput;
    }
    public By getStreetNbrInput() {
        return this.streetNbrInput;
    }
    public By getPostalCodeInput() {
        return this.postalCodeInput;
    }
    public By getCityInput() {
        return this.cityInput;
    }
    public By getCountryDrp() {
        return this.countryDrp;
    }
    public By getDateOfBirthInput() {
        return this.dateOfBirthInput;
    }
    public By getCityOfBirthInput() {
        return this.cityOfBirthInput;
    }
    public By getCountryOfBirthDrp() {
        return this.countryOfBirthDrp;
    }
    public By getNationalityDrp() {
        return this.nationalityDrp;
    }
    public By getMaritalStatusDrp() {
        return this.maritalStatusDrp;
    }
    public By getEmploymentStatusDrp() {
        return this.employmentStatusDrp;
    }
    public By getOccupationDrp() {
        return this.occupationDrp;
    }
    public By getNameOfEmployerInput() {
        return this.nameOfEmployerInput;
    }
}
