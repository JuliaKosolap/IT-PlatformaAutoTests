package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CommentsPageLocators {
    SelenideElement commentField = $(byXpath("//textarea[@id='comment']"));
    SelenideElement authorName = $(byXpath("//input[@id='author']"));
    SelenideElement authorEmail = $(byXpath("//input[@id='email']"));
    SelenideElement submitButton = $(byXpath("//input[@id='comment-submit']"));
}
