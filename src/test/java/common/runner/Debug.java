package common.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;

import static common.config.Props.initProperties;
import static common.config.Props.resetProperties;

public class Debug {

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) throws IOException {
        Configuration.timeout = 30000;
        Configuration.startMaximized = true;
        Configuration.browser = browser;
        System.out.println("Current browser: " + browser);
        initProperties();
    }

    @AfterMethod(alwaysRun = true)
    void tearDown() {
        resetProperties();
        Selenide.closeWebDriver();
    }


}
