package tests;

import common.test_data.IT_Platforma_Links;
import common.test_data.RandomData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationFieldsValidation extends BasePage {
    @BeforeMethod
    public void setUp2() {
        open(IT_Platforma_Links.IT_PLATFORMA_REGISTRATION_PAGE.getValue());
    }

    @Test
    public void registerWithEmptyFields() {
        //Steps
        registrationPage.pressRegistrationButton();
        //Verification
        registrationPage.verifyErrorMessage1(": Пожалуйста, введите имя пользователя.");
        registrationPage.verifyErrorMessage2(": Пожалуйста, введите ваш адрес email.");
        registrationPage.verifyErrorMessage3(": Please enter a password.");
    }

    @Test
    public void registerWithInvalidData() {
        //Steps
        registrationPage.fillUserNameField(RandomData.invalidRandomUserName());
        registrationPage.fillEmailField(RandomData.invalidRandomEmail());
        registrationPage.fillPasswordField(RandomData.randomPassword());
        registrationPage.fillConfirmPasswordField(RandomData.randomPassword());
        registrationPage.pressRegistrationButton();
        //Verification
        registrationPage.verifyErrorMessage1(": Это имя пользователя некорректно, поскольку оно содержит недопустимые символы.");
        registrationPage.verifyErrorMessage2(": Некорректный адрес email.");
        registrationPage.verifyErrorMessage3(": Passwords don’t match. Please enter the same password in both password fields.");
    }


}
