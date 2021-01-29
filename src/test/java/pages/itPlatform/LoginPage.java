package pages.itPlatform;

import io.qameta.allure.Step;
import org.junit.Assert;


public class LoginPage {

    LoginPageLocators locators = new LoginPageLocators();


    @Step
    public void fillUserNameField(String userName) {
        locators.userNameField.sendKeys(userName);
    }

    @Step
    public void fillPasswordField(String password) {
        locators.passwordField.sendKeys(password);
    }

    @Step
    public void pressLoginButton() {
        locators.loginButton.click();
    }

    @Step
    public void verifyErrorMessage1(String message) {
        Assert.assertTrue(locators.errorMessage1.getText().contains(message));

    }

    @Step
    public void verifyErrorMessage2(String message) {
        Assert.assertTrue(locators.errorMessage2.getText().contains(message));
    }

    @Step
    public void verifyUserNameFieldExists() {
        Assert.assertTrue(locators.userNameField.exists());

    }
}
