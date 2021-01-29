package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    SelenideElement greetingText = $(byXpath("//p[@class='tml-dashboard-greeting']"));

    @Step
    public void verifyGreetingText(String text) {
        Assert.assertTrue(greetingText.getText().contains(text));
    }

}
