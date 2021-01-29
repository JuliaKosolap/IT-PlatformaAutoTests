package tests;

import common.test_data.IT_Platforma_Links;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;


public class MainPageCheckPosts extends BasePage {

    @BeforeMethod
    public void setUp2() throws IOException {

        open(IT_Platforma_Links.IT_PLATFORMA_MAIN_PAGE.getValue());
    }

    @Test
    public void checkResentPosts() {

        String resentPostTitle = "Neque adipiscing an cursus";
        mainPage.verifyResentPost(resentPostTitle);
    }
}
