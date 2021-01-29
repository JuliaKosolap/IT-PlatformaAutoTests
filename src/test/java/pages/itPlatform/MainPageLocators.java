package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPageLocators {
    SelenideElement greetingText = $(byXpath("//a[text()='Привет, ']//span[@class='display-name']"));
    SelenideElement searchField = $(byXpath("//input[@id='ocean-search-form-1']"));
    SelenideElement articleTitle = $(byXpath("//a[@rel='bookmark']"));
    SelenideElement commentsLink = $(byXpath("//a[@class='comments-link']"));
}
