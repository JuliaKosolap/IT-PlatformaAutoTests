package tests;

import common.testData.RandomData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class AuthorizationValidateFields extends BasePage {

    @BeforeMethod
    public void setUp2() {
        open("https://it-platforma.website/login/");
    }

    @Test

    public void loginWithEmptyFields() {
        //Steps
        loginPage.pressLoginButton();
        //Verification
        loginPage.verifyErrorMessage1(": Вы не ввели имя пользователя.");
        loginPage.verifyErrorMessage2(": Вы не ввели пароль.");
    }

    @Test

    public void userNameDoesNotExist() {
        //Steps
        loginPage.fillUserNameField(RandomData.randomString());
        loginPage.fillPasswordField(RandomData.randomString());
        loginPage.pressLoginButton();
        //Verification
        loginPage.verifyErrorMessage1("Неизвестное имя пользователя. Перепроверьте или попробуйте ваш адрес email.");
    }

    @Test

    public void passwordNotValid() {
        //Steps
        String userName = "jkosolap@gmail.com";
        loginPage.fillUserNameField(userName);
        String randomPassword = RandomData.randomString();
        loginPage.fillPasswordField(randomPassword);
        loginPage.pressLoginButton();
        //Verification
        loginPage.verifyErrorMessage1(": Введённый вами пароль для адреса " + userName + " неверен.");
    }
}
