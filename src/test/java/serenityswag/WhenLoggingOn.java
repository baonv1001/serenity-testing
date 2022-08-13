package serenityswag;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn {
    @Managed
    WebDriver driver;

    @Test
    public void usersCanLogOnViaTheHomePage() {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("#email")).sendKeys("acquyhexom1@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("NiflFaejY92");
        driver.findElement(By.cssSelector("[data-testid='royal_login_button']")).click();
    }
}
