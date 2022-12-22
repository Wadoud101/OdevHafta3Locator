package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class b_Methods extends d_Driver {


    public static void openChromeBrowser(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-Maximized");
        driver = WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
        //driver.get(Constants.URL);
    }

    public static void navigateToChrome(){
        driver.navigate().to(c_Constants.URL);
    }

    public static void quit(){
        driver.quit();
    }

    public static void Wait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void searchSelenium(){
       WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
       element.sendKeys("Selenium");
       element.submit();
       b_Methods.Wait();
    }

    public static void selectSelenium(){
        WebElement element = driver.findElement(By.xpath("//img[@data-image-index='2']"));
        b_Methods.Wait();
        element.click();
    }

    public static void navigateBack(){
        driver.navigate().back();
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.clear();
    }

    public static void searchCalculus(){
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("Calculus");
        element.submit();
        b_Methods.Wait();
    }

    public static void selectCalculus(){
        WebElement element = driver.findElement(By.xpath("//img[@alt='Essential Calculus Skills Practice Workbook with Full Solutions']"));
        b_Methods.Wait();
        element.click();
        b_Methods.Wait();
    }

    public static void addToCard(){
        WebElement element = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        b_Methods.Wait();
        element.click();
    }

    public static void cancel(){
        WebElement element = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
        b_Methods.Wait();
        element.click();
        b_Methods.Wait();
    }


}
