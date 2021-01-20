package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPage {
    SelenideElement userNameField = $(byXpath("//input[@id='user_login']"));
    SelenideElement passwordField = $(byXpath("//input[@id='user_pass']"));
    SelenideElement loginButton = $(byXpath("//button[@name='submit']"));
    SelenideElement errorMessage1 = $(byXpath("//li[@class='tml-error'][1]"));
    SelenideElement errorMessage2 = $(byXpath("//li[@class='tml-error'][2]"));



    public void fillUserNameField(String userName) {
        userNameField.sendKeys(userName);
    }

    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void pressLoginButton() {
        loginButton.click();
        sleep(5000);
    }

    public void verifyErrorMessage1(String message){
        Assert.assertTrue(errorMessage1.getText().contains(message));

    }
    public void verifyErrorMessage2(String message){
        Assert.assertTrue(errorMessage2.getText().contains(message));

    }
}
