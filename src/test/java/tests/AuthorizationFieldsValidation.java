package tests;

import common.config.Props;
import common.test_data.IT_Platforma_Links;
import common.test_data.RandomData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class AuthorizationFieldsValidation extends BasePage {

    @BeforeMethod
    public void setUp2() {
        open(IT_Platforma_Links.IT_PLATFORMA_LOGIN_PAGE.getValue());
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
        loginPage.fillUserNameField(RandomData.randomString(10));
        loginPage.fillPasswordField(RandomData.randomPassword());
        loginPage.pressLoginButton();
        //Verification
        loginPage.verifyErrorMessage1("Неизвестное имя пользователя. Перепроверьте или попробуйте ваш адрес email.");
    }

    @Test

    public void passwordNotValid() {
        //Steps
        loginPage.fillUserNameField(Props.login);
        loginPage.fillPasswordField(RandomData.randomString(10));
        loginPage.pressLoginButton();
        //Verification
        loginPage.verifyErrorMessage1(": Введённый вами пароль для адреса " + Props.login + " неверен.");
    }
}
