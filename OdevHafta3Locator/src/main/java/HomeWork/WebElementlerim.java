package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementlerim {

    public static void element1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https:/toolsqa.com");

        Thread.sleep(1000);

    }

    public WebElementlerim() {
    }


    public static void elekment2() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https:/wikipedia.org");

        Thread.sleep(1000);

    }

    // 9.Intellij'de package olusturun(maven project kullaniyorsunuz)

    // 10. Bir tane "WebElemenlerim" isimli class'iniz olucak
    //	-public/protected/default WebElement element01= driver.findElement(...); ifadeleri burdan alinacak
    //	-buradaki variablelar static olacak
    //	-Buradaki bir variable'i(statik variablelari) baska classtan cagiriken 2 yolu var
    //		-"WebElementlerim.element01"(classAdi.variableAdi)
    //                -"import static packageAdi.classAdi.*" yaptiktan sonra,  "element01"
}
