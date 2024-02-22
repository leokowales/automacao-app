package automacao.app.pages;

import automacao.app.Constants;
import automacao.app.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public void validateElementPresence(String xpath) {

        new WebDriverWait(Hooks.getDriver(), Constants.TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(xpath)));
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void tap(By element){
        WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 10);
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(element));
        test.click();
        delay(Constants.DEFAULT_DELAY_IN_MILLISECONDS);
    }

    public static void sendKeys(By element, String texto){
        if (!texto.isEmpty()) {
            WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Hooks.getDriver().findElement(element).sendKeys(texto);
            delay(Constants.SEND_KEYS_DELAY_IN_MILLISECONDS);
        }
    }

    public static String captureText(By element){
        return Hooks.getDriver().findElement(element).getText();
    }
}