package tests;

import common.steps.CommonSteps;
import common.test_data.Five_Element_Links;
import common.test_data.IT_Platforma_Links;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.fiveElement.FIveElementBasePage;
import pages.itPlatform.BasePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class MainPageCheckBrokenMenuLinks extends BasePage {

    @BeforeMethod
    public void setUp2() throws IOException {

        open(IT_Platforma_Links.IT_PLATFORMA_MAIN_PAGE.getValue());
    }

    @Test
    public void checkYourObjectiveMenuItem() {
        mainPage.clickMenuItem("Your Objective");
        //Verification
        CommonSteps.checkUrl(Five_Element_Links.FIVE_ELEMENT_MAIN_PAGE.getValue(), 5);
        FIveElementBasePage fIveElementBasePage = new FIveElementBasePage();
        fIveElementBasePage.verifyMenuItemExists("О клубе");

    }

    @Test
    public void checkAchieveYourGoalMenuItem() {
        mainPage.clickMenuItem("Achieve your goal");
        //Verification
        CommonSteps.checkUrl(Five_Element_Links.FIVE_ELEMENT_OFFER_PAGE.getValue(), 5);
        FIveElementBasePage fIveElementBasePage = new FIveElementBasePage();
        fIveElementBasePage.verifyMenuItemExists("О клубе");


    }

    @Test
    public void checkChooseYourPackMenuItem() {
        mainPage.clickMenuItem("Choose your pack");
        //Verification
        CommonSteps.checkUrl(Five_Element_Links.FIVE_ELEMENT_SCHEDULE_PAGE.getValue(), 5);
        FIveElementBasePage fIveElementBasePage  = new FIveElementBasePage();
        fIveElementBasePage.verifyMenuItemExists("О клубе");


    }

    @Test
    public void checkPricingMenuItem() {
        mainPage.clickMenuItem("Pricing");
        //Verification
        CommonSteps.checkUrl(Five_Element_Links.FIVE_ELEMENT_CLUB_CARD_PAGE.getValue(), 5);
        FIveElementBasePage fIveElementBasePage = new FIveElementBasePage();
        fIveElementBasePage.verifyMenuItemExists("О клубе");


    }

    @Test
    public void checkMyAccountMenuItem() {
        mainPage.clickMenuItem("Sign in");
        //Verification
        CommonSteps.checkUrl(IT_Platforma_Links.IT_PLATFORMA_LOGIN_PAGE.getValue(), 5);
        loginPage.verifyUserNameFieldExists();
    }
}
