package common.runner;


import com.codeborne.selenide.Selenide;
import common.config.SelenoidConfig;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.WebDriverRunner.driver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static common.global.Global.*;
import static common.steps.CommonSteps.writeLog;

public class SelenoidRunner {

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        globalDevice = "Desktop";
        SelenoidConfig selenoidConfig = new SelenoidConfig();
        selenoidConfig.createWebDriverInstance();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (globalBrowserName.equals("Chrome") && driver().hasWebDriverStarted()) {
            Logs logs = getWebDriver().manage().logs();
            writeLog(logs.get(LogType.BROWSER), "BrowserConsoleLog");
        }
        Selenide.closeWebDriver();
        resetGlobalVariablesAfterMethod();
    }
}
