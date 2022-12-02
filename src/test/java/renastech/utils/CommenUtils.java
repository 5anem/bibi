package renastech.utils;
import org.openqa.selenium.support.ui.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;








public class CommenUtils {

    public static void hardWait(long millisecond) {


        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //fluent wait
    public static void clickWithWait(WebElement webElement) {

        Wait wait = new FluentWait(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(800))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);

        WebElement element = (WebElement) wait.until((Function<WebDriver, WebElement>) driver -> webElement);

        try {
            element.click();
        } catch (WebDriverException e) {
            e.printStackTrace();
        }


        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }


        /**
         * wait for backround processes on the browaer to complate
         *
         * @param timeOutInSeconds
         */
        //  public static void waitForPageToLoad(long timeOutInSeconds){
        //  ExpectedCondition<Boolean> expectation= driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complate");
        //  try {
        //      WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeOutInSeconds);
        //      wait.until(expectation);
        //   }catch (Throwable error){
        ///       error.printStackTrace();
        //    }
    }


    public static  void selectFromDropDown(WebElement element,String text){
        Select select=new Select(element);
        select.selectByVisibleText(text);
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }





















}




