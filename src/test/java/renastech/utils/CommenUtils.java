package renastech.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import sun.security.krb5.internal.TGSRep;

import java.time.Duration;
import java.util.function.Function;

public class CommenUtils {

    public static void hardWait(long millisecond){


        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    //fluent wait
    public static void clickWithWait(WebElement webElement){

        Wait wait = new FluentWait(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(800))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);

                WebElement element=(WebElement) wait.until((Function<WebDriver,WebElement>) driver  -> webElement);

                try {
                    element.click();
                }catch (WebDriverException e){
                    e.printStackTrace();
                }



                try{
                    Thread.sleep(1000);

                }catch (Exception e){
                    e.printStackTrace();
                }



    }

























}

