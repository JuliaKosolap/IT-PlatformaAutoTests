package tests;

import common.config.Props;
import common.test_data.IT_Platforma_Links;
import common.test_data.RandomData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class MainPageCheckComments extends BasePage {

    @BeforeMethod
    public void setUp2() throws IOException {

        open(IT_Platforma_Links.IT_PLATFORMA_MAIN_PAGE.getValue());
    }

    @Test
    public void submitComment() {
        //Steps
        mainPage.goToCommentsPage();
        String comment = RandomData.randomString(10);
        commentsPage.submitComment(comment,
                RandomData.randomUserName(), Props.login);
        //Verification
        commentsPage.assertComment(comment);

    }
}
