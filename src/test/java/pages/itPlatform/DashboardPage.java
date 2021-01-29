package pages.itPlatform;

import io.qameta.allure.Step;
import org.junit.Assert;

public class DashboardPage {

 DashboardPageLocators locators = new DashboardPageLocators();

    @Step
    public void verifyGreetingText(String text) {
        Assert.assertTrue(locators.greetingText.getText().contains(text));
    }

}
