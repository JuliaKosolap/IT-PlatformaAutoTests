package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement greetingText = $(byXpath("//a[text()='Привет, ']//span[@class='display-name']"));
    SelenideElement searchField = $(byXpath("//input[@id='ocean-search-form-1']"));
    SelenideElement articleTitle = $(byXpath("//a[@rel='bookmark']"));
    SelenideElement commentsLink = $(byXpath("//a[@class='comments-link']"));
//    SelenideElement commentsLink = $(byXpath("//article[@id='post-131']//a[@class='comments-link']"));


    @Step
    public void verifyGreetingText(String userName) {
        Assert.assertTrue(greetingText.getText().contains(userName));
    }


    @Step
    public void fillSearchField(String searchWord) {
        searchField.sendKeys(searchWord);
        searchField.sendKeys(Keys.ENTER);
    }

    @Step
    public void clickMenuItem(String item) {
        $(byXpath("//span[text()='" + item + "']")).click();
    }

    @Step
    public void verifyArticleIsFound(String searchWord) {

        Assert.assertTrue(articleTitle.getText().toLowerCase().contains(searchWord));

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
        commentsLink.click();
    }
}
