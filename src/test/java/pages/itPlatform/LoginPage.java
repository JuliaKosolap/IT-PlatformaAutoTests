package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement userNameField = $(byXpath("//input[@id='user_login']"));
    SelenideElement passwordField = $(byXpath("//input[@id='user_pass']"));
    SelenideElement loginButton = $(byXpath("//button[@name='submit']"));
    SelenideElement errorMessage1 = $(byXpath("//li[@class='tml-error'][1]"));
    SelenideElement errorMessage2 = $(byXpath("//li[@class='tml-error'][2]"));


    @Step
    public void fillUserNameField(String userName) {
        userNameField.sendKeys(userName);
    }

    @Step
    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    @Step
    public void pressLoginButton() {
        loginButton.click();
    }

    @Step
    public void verifyErrorMessage1(String message) {
        Assert.assertTrue(errorMessage1.getText().contains(message));

    }

    @Step
    public void verifyErrorMessage2(String message) {
        Assert.assertTrue(errorMessage2.getText().contains(message));
    }

    @Step
    public void verifyUserNameFieldExists() {
        Assert.assertTrue(userNameField.exists());

    }
}