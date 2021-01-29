package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

 MainPageLocators locators = new MainPageLocators();



    @Step
    public void verifyGreetingText(String userName) {
        Assert.assertTrue(locators.greetingText.getText().contains(userName));
    }


    @Step
    public void fillSearchField(String searchWord) {
        locators.searchField.sendKeys(searchWord);
        locators.searchField.sendKeys(Keys.ENTER);
    }

    @Step
    public void clickMenuItem(String item) {
        $(byXpath("//span[text()='" + item + "']")).click();
    }

    @Step
    public void verifyArticleIsFound(String searchWord) {

        Assert.assertTrue(locators.articleTitle.getText().toLowerCase().contains(searchWord));

    }
    @Step
    public void verifyResentPost(String postTitle) {
        SelenideElement resentPost = $(byXpath("//a[text()='" + postTitle + "']"));
        resentPost.click();
        SelenideElement title = $(byXpath("//h2[@class='single-post-title entry-title']"));
        Assert.assertEquals(postTitle, title.getText());
    }
    @Step
    public void goToCommentsPage() {
        locators.commentsLink.click();
    }
}
