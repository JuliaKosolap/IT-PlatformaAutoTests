package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    SelenideElement userNameField = $(byXpath("//input[@id='user_login']"));
    SelenideElement emailField = $(byXpath("//input[@id='user_email']"));
    SelenideElement passwordField = $(byXpath("//input[@id='pass1']"));
    SelenideElement confirmPasswordField = $(byXpath("//input[@id='pass2']"));
    SelenideElement registrationButton = $(byXpath("//button[@name='submit']"));
    SelenideElement errorMessage1 = $(byXpath("//li[@class='tml-error'][1]"));
    SelenideElement errorMessage2 = $(byXpath("//li[@class='tml-error'][2]"));
    SelenideElement errorMessage3 = $(byXpath("//li[@class='tml-error'][3]"));

    @Step
    public void fillUserNameField(String userName) {
        userNameField.sendKeys(userName);
    }

    @Step
    public void fillEmailField(String email) {
        emailField.sendKeys(email);
    }

    @Step
    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    @Step
    public void fillConfirmPasswordField(String password) {
        confirmPasswordField.sendKeys(password);
    }

    @Step
    public void pressRegistrationButton() {
        registrationButton.click();
//        sleep(5000);
    }
    @Step
    public void verifyErrorMessage1(String message){
        Assert.assertTrue(errorMessage1.getText().contains(message));

    }
    @Step
    public void verifyErrorMessage2(String message){
        Assert.assertTrue(errorMessage2.getText().contains(message));

    }
    @Step
    public void verifyErrorMessage3(String message){
        Assert.assertTrue(errorMessage3.getText().contains(message));

    }
}
