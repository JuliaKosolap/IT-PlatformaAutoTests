package pages.itPlatform;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class CommentsPage {

    CommentsPageLocators locators = new CommentsPageLocators();

    @Step
    public void submitComment(String comment, String name, String email) {
        locators.commentField.sendKeys(comment);
        locators.authorName.sendKeys(name);
        locators.authorEmail.sendKeys(email);
        locators.submitButton.click();
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


