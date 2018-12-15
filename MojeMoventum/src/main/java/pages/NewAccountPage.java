package pages;

import org.openqa.selenium.By;

public class NewAccountPage {
    private By accountBrowse = By.id("AccountBrowseLink");
    private By accountItem = By.id("new_account_item");
    private By personalItem = By.id("new_account_personal_item");
    private By nextBtn = By.id("NewPersonalAccountViewModel_NewAccountControlsPanelCopy_Next");
    private By sendBtn = By.id("NewPersonalAccountViewModel_NewAccountControlsPanelCopy_Send");
    private By messageBtn = By.id("window_GenericMessageButton_Window");

    public By getAccountBrowse() {
        return this.accountBrowse;
    }
    public By getAccountItem() {
        return this.accountItem;
    }
    public By getPersonalItem() {
        return this.personalItem;
    }
    public By getNextBtn() {
        return this.nextBtn;
    }
    public By getSendBtn() {
        return this.sendBtn;
    }
    public By getMessageBtn() {
        return this.messageBtn;
    }
}
