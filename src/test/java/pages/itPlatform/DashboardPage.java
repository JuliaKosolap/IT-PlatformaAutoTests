package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    SelenideElement greetingText = $(byXpath("//p[@class='tml-dashboard-greeting']"));

    public void verifyGreetingText(String text) {
        Assert.assertTrue(greetingText.getText().contains(text));
    }

}
