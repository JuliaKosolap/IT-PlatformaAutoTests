package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import java.awt.*;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationPage {
    SelenideElement userNameField = $(byXpath("//input[@id='user_login']"));
    SelenideElement emailField = $(byXpath("//input[@id='user_email']"));
    SelenideElement passwordField = $(byXpath("//input[@id='pass1']"));
    SelenideElement confirmPasswordField = $(byXpath("//input[@id='pass2']"));
    SelenideElement registrationButton = $(byXpath("//button[@name='submit']"));
    SelenideElement errorMessage1 = $(byXpath("//li[@class='tml-error'][1]"));
    SelenideElement errorMessage2 = $(byXpath("//li[@class='tml-error'][2]"));
    SelenideElement errorMessage3 = $(byXpath("//li[@class='tml-error'][3]"));

    public void fillUserNameField(String userName) {
        userNameField.sendKeys(userName);
    }

    public void fillEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void fillConfirmPasswordField(String password) {
        confirmPasswordField.sendKeys(password);
    }

    public void pressRegistrationButton() {
        registrationButton.click();
        sleep(5000);
    }
    public void verifyErrorMessage1(String message){
        Assert.assertTrue(errorMessage1.getText().contains(message));

    }
    public void verifyErrorMessage2(String message){
        Assert.assertTrue(errorMessage2.getText().contains(message));

    }
    public void verifyErrorMessage3(String message){
        Assert.assertTrue(errorMessage3.getText().contains(message));

    }
}
