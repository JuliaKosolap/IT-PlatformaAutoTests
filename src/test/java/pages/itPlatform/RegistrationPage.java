package pages.itPlatform;

import io.qameta.allure.Step;
import org.junit.Assert;

public class RegistrationPage {

    RegistrationPageLocators locators = new RegistrationPageLocators();


    @Step
    public void fillUserNameField(String userName) {
        locators.userNameField.sendKeys(userName);
    }

    @Step
    public void fillEmailField(String email) {
        locators.emailField.sendKeys(email);
    }

    @Step
    public void fillPasswordField(String password) {
        locators.passwordField.sendKeys(password);
    }

    @Step
    public void fillConfirmPasswordField(String password) {
        locators.confirmPasswordField.sendKeys(password);
    }

    @Step
    public void pressRegistrationButton() {
        locators.registrationButton.click();
//        sleep(5000);
    }
    @Step
    public void verifyErrorMessage1(String message){
        Assert.assertTrue(locators.errorMessage1.getText().contains(message));

    }
    @Step
    public void verifyErrorMessage2(String message){
        Assert.assertTrue(locators.errorMessage2.getText().contains(message));

    }
    @Step
    public void verifyErrorMessage3(String message){
        Assert.assertTrue(locators.errorMessage3.getText().contains(message));

    }
}
