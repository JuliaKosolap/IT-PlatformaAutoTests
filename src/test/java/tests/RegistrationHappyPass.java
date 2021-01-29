package tests;

import common.test_data.IT_Platforma_Links;
import common.test_data.RandomData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static common.steps.CommonSteps.checkUrl;

public class RegistrationHappyPass extends BasePage {
    @BeforeMethod
    public void setUp2() throws IOException {
        open(IT_Platforma_Links.IT_PLATFORMA_REGISTRATION_PAGE.getValue());
    }

    @Test
    public void register() {
        //Steps
        String userName = RandomData.randomUserName();
        String password = RandomData.randomPassword();
        String email = RandomData.randomEmail();
        registrationPage.fillUserNameField(userName);
        registrationPage.fillEmailField(email);
        registrationPage.fillPasswordField(password);
        registrationPage.fillConfirmPasswordField(password);
        registrationPage.pressRegistrationButton();
        //Verification
        checkUrl(IT_Platforma_Links.IT_PLATFORMA_MAIN_PAGE.getValue(), 5);
        mainPage.verifyGreetingText(userName);
//        writeToExcelFile(userName, email, password);
    }

}
