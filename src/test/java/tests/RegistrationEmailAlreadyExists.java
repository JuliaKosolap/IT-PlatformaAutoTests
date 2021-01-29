package tests;

import common.config.Props;
import common.test_data.IT_Platforma_Links;
import common.test_data.RandomData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationEmailAlreadyExists extends BasePage {
    @BeforeMethod
    public void setUp2() throws IOException {

        open(IT_Platforma_Links.IT_PLATFORMA_REGISTRATION_PAGE.getValue());

    }

    @Test
    public void emailAlreadyExists() {
        //Steps
        registrationPage.fillUserNameField(RandomData.randomUserName());
        registrationPage.fillEmailField(Props.login);
        registrationPage.fillPasswordField(Props.password);
        registrationPage.fillConfirmPasswordField(Props.password);
        registrationPage.pressRegistrationButton();
        //Verifications
        registrationPage.verifyErrorMessage1(": Этот email уже зарегистрирован. Пожалуйста, введите другой.");
    }
}
