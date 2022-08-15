package serenityswag;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    @Test
    public void usersCanLogOnViaTheHomePage() {
        login.useCredentials("acquyhexom1@gmail.com", "NiflFaejY92");
    }
}
