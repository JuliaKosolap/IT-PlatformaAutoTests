package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageLocators {
    SelenideElement userNameField = $(byXpath("//input[@id='user_login']"));
    SelenideElement emailField = $(byXpath("//input[@id='user_email']"));
    SelenideElement passwordField = $(byXpath("//input[@id='pass1']"));
    SelenideElement confirmPasswordField = $(byXpath("//input[@id='pass2']"));
    SelenideElement registrationButton = $(byXpath("//button[@name='submit']"));
    SelenideElement errorMessage1 = $(byXpath("//li[@class='tml-error'][1]"));
    SelenideElement errorMessage2 = $(byXpath("//li[@class='tml-error'][2]"));
    SelenideElement errorMessage3 = $(byXpath("//li[@class='tml-error'][3]"));
}
