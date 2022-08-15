package serenityswag.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.inventory.InventoryPage;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage() {
        login.useCredentials(User.STANDARD_USER);
//        Assertions.assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products");
        /*Serenity.reportThat("This inventory page should be displayed with the correct title",
                () -> Assertions.assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products"));*/
    }
}
