package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationValidateFields extends BasePage {
    @BeforeMethod
    public void setUp2() {
        open("https://it-platforma.website/login/");
    }

    @Test

    public void registerWithEmptyFields() {
        //Steps
        loginPage.pressLoginButton();
        //Verification
        loginPage.verifyErrorMessage1(": Вы не ввели имя пользователя.");
        loginPage.verifyErrorMessage2(": Вы не ввели пароль.");
    }
}
