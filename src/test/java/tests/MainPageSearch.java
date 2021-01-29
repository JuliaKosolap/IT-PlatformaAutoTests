package tests;

import common.test_data.IT_Platforma_Links;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.itPlatform.BasePage;

import java.io.IOException;


import static common.steps.CommonSteps.checkUrl;
import static com.codeborne.selenide.Selenide.open;


public class MainPageSearch extends BasePage {

    @DataProvider
    public Object[][] searchWords() {
        return new Object[][]{
                {"cursus"}, {"litora"}, {"libro"}, {"vitae"}, {"magna"},
        };
    }
    @BeforeMethod
    public void setUp2() throws IOException {

        open(IT_Platforma_Links.IT_PLATFORMA_MAIN_PAGE.getValue());
    }
    @Test(dataProvider = "searchWords")
    public void verifySearchField(String searchWord) {
        mainPage.fillSearchField(searchWord);
        checkUrl(searchWord, 5);
        mainPage.verifyArticleIsFound(searchWord);
    }
}
