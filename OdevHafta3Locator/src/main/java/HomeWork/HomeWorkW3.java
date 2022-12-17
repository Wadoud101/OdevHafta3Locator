package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HomeWorkW3 {

    public static void main(String[] args) throws Exception {

       amazon();

        //selectItemYahoo();

        //WebElementlerim.element1();

        //WebElementlerim.elekment2();
    }

    public static void amazon () throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Hafta3
        // Odev1
        // 1.Bir websitesi seciniz.

        driver.get("https:www.amazon.com");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        // 2.Bir senaryo yaziniz, verdigim orneklere bagli kalmak zorunda degilsiniz.
        // 3.Bu zamana kadar clear(),click(),sendKeys() gibi basit methodlar gordugunuz icin
        //   icin senaryonuz sade/basit olabilir.

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium java books");
        searchBox.submit();
        Thread.sleep(1000);

        // 4.Locate edeceginiz text/button/textbox vb. webElementleri ogrendiginiz 8 farkli
        //   Selenium Locator'i kullanarak yapiniz.
        // 5.Bir webelementi 5kez, farkli yollarla locate edin.

        // Locating Amazon Logo
        // 1.
        //WebElement amazonlogo1 = driver.findElement(By.id("nav-logo-sprites"));
        // 2.
        //WebElement amazonlogo3 = driver.findElement(By.className("nav-logo-link nav-progressive-attribute"));
        // 3.
        //WebElement amazonlogo4 = driver.findElement(By.linkText("/ref=nav_logo"));
        // 4.
        //WebElement amazonlogo6 = driver.findElement(By.xpath("//div[@id='nav-logo']"));
        // 5.
        //WebElement amazonlogo7 = driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
        // 6.
        WebElement seleniumBook = driver.findElement(By.xpath("//img[@data-image-index='1']"));

        seleniumBook.click();
        Thread.sleep(1000);

        WebElement addToCard = driver.findElement(By.xpath("//span[@id='a-autoid-0']"));
        addToCard.click();

        driver.close();

    }

    public static void selectItemYahoo() throws InterruptedException {

        // 6.En az 6 webElement locate edilmis olsun.(10 idealdir.)

        // 7.Ornek senaryo1->YemekSepetine git(login olmadan, cunku ilave authentication gerekebilir),
        //   urunAra, urunSec, UrunTikla, SepeteEkle
        // 8.Ornek senaryo2->Twitter'a git(login olmadan, https://twitter.com/explore),twitKonusuAra,birTwitBul,likeYap

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https:/yahoo.com");

        Thread.sleep(1000);
        WebElement signIn = driver.findElement(By.xpath("//a[@class='_yb_rvae7']"));
        signIn.click();

        Thread.sleep(2000);

        WebElement mail = driver.findElement(By.xpath("//input[@class='phone-no ']"));

        mail.sendKeys("homework@yahoo.com");

        WebElement create = driver.findElement(By.xpath("//a[@role='button']"));
        create.click();

        Thread.sleep(2000);
        driver.close();

    }



        //

        //   11. Bir tane "Constants" isimli classiniz olucak.
        //        -public/protected/default final String EMAIL="abc@gmail.com";
        //        -public/protected/default final String URL="https://www.-----.com";
		//		-yukardaki orneklerde access modifier size kalmis.
		//			-Bilgi->javada 4 Access modifier vardir(public, protected, , private)

		//  	-Bu classtaki her variable final olacak, non-static olacak.
		//		-Baska bir classtan bu constant variablelari cagirmak icin;
		//		Constant obje=new Constant();
        //      webElement.sendKeys(obje.EMAIL);
        //      -Ek bilgi, final variablelar BUYUK_HARFLE_YAZILIRLAR

		//  12."Methodlarim" isimli bir classiniz olsun
		//	-methodlar static ya da non static olabilir size kalmis.
		//	-launchBrowser()   ,launchChrome(), goToURL(),...
		//	-actionToPerform() ,clickElement(), sendKeysToTextBox(),...gibi methodlariniz burada olacak

		//  13."Driver" isimli bir classiniz olacak
		// 	   public class Driver
		//	{
		//		public static WebDriver driver=WebDriverManager.chrome...;

		//		//static olmak zorunda, cunku static variable class'a aittir. Belli 1 tane objeye degil.
		//		//static int sayi=5; ile int sayi2=5; arasindaki farkli unutmus iseniz googlelama yapiniz, sunu yaziniz;
		//		//javada static degisken(class variable) ve normal degisken(instance variable) nedir?

		//		//ChromeOptions kullanimi istege bagli

		//	}
		//    14. "MyWebAppAutomationProgram" isimli class'iniz olsun
		//	     -Icindeki main methodu olsun.
		//	     -Bu classin icinde olusturacaginiz objeler main methodun disinda olsun, ornegin;
        //       -static Constants obje1=new Constant();
		//	      static obje olursa static olan main methodun icinden direk cagrilabilir.
		//	      non-static obje olursa da olur(yapabilirsiniz),
		//	      o zaman -> new MyWebAppAutomationProgram().obje1 diye cagirabilirsiniz.







}
