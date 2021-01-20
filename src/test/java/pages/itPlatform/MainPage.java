package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement greetingText = $(byXpath("//a[text()='Привет, ']//span[@class='display-name']"));
    SelenideElement firstArticle = $(byXpath("//a[@title='Neque adipiscing an cursus']"));
    SelenideElement searchField = $(byXpath("//input[@id='ocean-search-form-1']"));
    SelenideElement articleTitle = $(byXpath("//a[@rel='bookmark']"));


    public void verifyGreetingText(String userName) {

        Assert.assertTrue(greetingText.getText().contains(userName));
    }

    public void verifyArticleExist() {
        Assert.assertTrue(firstArticle.exists());

    }

    public void fillSearchField(String searchWord) {
        searchField.sendKeys(searchWord);
        searchField.sendKeys(Keys.ENTER);
    }

    public void clickMenuItem(String item) {
        $(byXpath("//span[text()='"+ item + "']")).click();
    }

    public void verifyArticleIsFound(String searchWord) {
        Assert.assertTrue(articleTitle.getText().contains(searchWord));
    }
}
