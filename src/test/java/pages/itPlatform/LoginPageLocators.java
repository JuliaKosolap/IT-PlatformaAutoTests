package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageLocators {
    SelenideElement userNameField = $(byXpath("//input[@id='user_login']"));
    SelenideElement passwordField = $(byXpath("//input[@id='user_pass']"));
    SelenideElement loginButton = $(byXpath("//button[@name='submit']"));
    SelenideElement errorMessage1 = $(byXpath("//li[@class='tml-error'][1]"));
    SelenideElement errorMessage2 = $(byXpath("//li[@class='tml-error'][2]"));
}
