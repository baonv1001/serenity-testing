package serenityswag;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class LoginActions extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @Step("Login as {0}")
    public void useCredentials(String username, String password) {
//        driver.get("https://www.facebook.com/");
        openUrl("https://www.facebook.com/");
        /*driver.findElement(By.cssSelector("#email")).sendKeys("acquyhexom1@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("NiflFaejY92");
        driver.findElement(By.cssSelector("[data-testid='royal_login_button']")).click();*/

        $("#email").sendKeys(username);
        $("#pass").sendKeys(password);
        $("[data-testid='royal_login_button']").click();
    }
}
