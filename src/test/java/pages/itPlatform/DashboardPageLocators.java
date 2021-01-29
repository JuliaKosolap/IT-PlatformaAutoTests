package pages.itPlatform;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPageLocators {
    SelenideElement greetingText = $(byXpath("//p[@class='tml-dashboard-greeting']"));
}
