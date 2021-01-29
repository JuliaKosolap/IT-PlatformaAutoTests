package tests;

import common.config.Props;
import common.test_data.IT_Platforma_Links;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static common.steps.CommonSteps.checkUrl;

public class AuthorizationHappyPass extends BasePage {
    @BeforeMethod
    public void setUp2() throws IOException {

        open(IT_Platforma_Links.IT_PLATFORMA_LOGIN_PAGE.getValue());
    }
    @Test
    public void logIn() throws InterruptedException {
        loginPage.fillUserNameField(Props.login);
        loginPage.fillPasswordField(Props.password);
        loginPage.pressLoginButton();
        //Verification
        checkUrl(IT_Platforma_Links.IT_PLATFORMA_DASHBOARD_PAGE.getValue(), 5);
        dashboardPage.verifyGreetingText("Привет");


    }
}


