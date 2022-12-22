package HomeWork;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class practicingLocators extends d_Driver{

    public static void main(String[] args) {
        runBrowser();
        wikipediaLogo();
        searchBox();
        welcomeText();
        footerText();
        mainPage();
        logIn();


        driver.quit();
    }

    public static void runBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-Maximized");
        driver = WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
        driver.get("https://en.wikipedia.org/");
    }

    public static void wikipediaLogo(){
        WebElement wikiLogo = driver.findElement(By.className("mw-wiki-logo"));
        wikiLogo = driver.findElement(By.id("p-logo"));
        wikiLogo = driver.findElement(By.xpath("//a[@title='Visit the main page']"));
        wikiLogo = driver.findElement(By.cssSelector("a[title='Visit the main page']"));

    }

    public static void searchBox(){
        WebElement searchB = driver.findElement(By.id("simpleSearch"));
        searchB = driver.findElement(By.className("vector-search-box-input"));
        searchB = driver.findElement(By.xpath("//input[@type='search']"));
        searchB = driver.findElement(By.cssSelector("input[type='search']"));
        searchB = driver.findElement(By.cssSelector("input[accesskey='f']"));
        searchB = driver.findElement(By.xpath("//input[@title='Search Wikipedia [alt-shift-f]']"));
    }

    public static void welcomeText(){
        WebElement welcomeText = driver.findElement(By.id("Welcome_to_Wikipedia"));
        welcomeText = driver.findElement(By.xpath("//a[@title='Wikipedia']"));
        welcomeText = driver.findElement(By.cssSelector("a[title='Wikipedia']"));
        welcomeText = driver.findElement(By.linkText("Wikipedia"));
        welcomeText = driver.findElement(By.partialLinkText("Wikipedi"));

    }

    public static void footerText(){
        WebElement footer = driver.findElement(By.id("footer-info-copyright"));
        footer = driver.findElement(By.xpath("(//a[@rel='license'])[1]"));
        footer = driver.findElement(By.xpath("//a[@style='display:none;']"));

    }

    public static void mainPage(){
        WebElement mainP = driver.findElement(By.id("ca-nstab-main"));
        mainP = driver.findElement(By.cssSelector("a[title='View the content page [alt-shift-c]']"));
        mainP = driver.findElement(By.linkText("Main Page"));
        mainP = driver.findElement(By.partialLinkText("Main Pa"));
        mainP = driver.findElement(By.xpath("//a[@title='View the content page [alt-shift-c]']"));

    }
    public static void logIn(){
        WebElement logI = driver.findElement(By.id("pt-login"));
        logI = driver.findElement(By.linkText("Log in"));
        logI = driver.findElement(By.cssSelector("a[accesskey='o']"));
        logI = driver.findElement(By.xpath("//li[@id='pt-login']"));


    }





}
