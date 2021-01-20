package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FIveElementBasePage {

    public void verifyMenuItemExists(String item) {
        SelenideElement menuItem = $(byXpath("//a[@title='" +item+ "']"));
        Assert.assertTrue(menuItem.exists());
    }
}
