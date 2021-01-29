package pages.fiveElement;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FIveElementBasePage {

    @Step
    public void verifyMenuItemExists(String item) {
        SelenideElement menuItem = $(byXpath("//a[@title='" +item+ "']"));
        Assert.assertTrue(menuItem.exists());
    }
}
