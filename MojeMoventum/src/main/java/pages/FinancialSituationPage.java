package pages;

import org.openqa.selenium.By;

public class FinancialSituationPage {
    private By netAssetsDrp = By.id("NewAccountPage3_DisposableNetAssets");
    private By derivesFromDrp = By.id("NewAccountPage3_MainIncomeDerivesFrom");

    public By getNetAssetsDrp() {
        return this.netAssetsDrp;
    }
    public By getDerivesFromDrp() {
        return this.derivesFromDrp;
    }
}
