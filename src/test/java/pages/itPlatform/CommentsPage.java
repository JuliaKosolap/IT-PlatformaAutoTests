package pages.itPlatform;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CommentsPage {

    SelenideElement commentField = $(byXpath("//textarea[@id='comment']"));
    SelenideElement authorName = $(byXpath("//input[@id='author']"));
    SelenideElement authorEmail = $(byXpath("//input[@id='email']"));
    SelenideElement submitButton = $(byXpath("//input[@id='comment-submit']"));

    @Step
    public void submitComment(String comment, String name, String email) {
        commentField.sendKeys(comment);
        authorName.sendKeys(name);
        authorEmail.sendKeys(email);
        submitButton.click();
    }
    @Step
    public boolean verifyCommentWasSaved(String comment) {
        boolean conditionForComment = false;
        ElementsCollection allComments = $$(byXpath("//div[@class='comment-entry']/div[@class='comment-content']"));
        List comments = allComments.texts();
        int size = comments.size();
        for (int i = 0; i < size; i++) {
            String thisComment = comments.get(i).toString();
            if (thisComment.equals(comment)) {
                conditionForComment = true;

                break;
            }

        }
        return conditionForComment;
    }
    @Step
    public void assertComment(String comment) {
        Assert.assertTrue(verifyCommentWasSaved(comment));

    }
}


