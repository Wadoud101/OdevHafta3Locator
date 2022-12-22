package HomeWork;

public class a_MainClass {

    public static void main(String[] args) throws Exception {

       b_Methods.openChromeBrowser();
       b_Methods.navigateToChrome();
       b_Methods.searchSelenium();
       b_Methods.selectSelenium();
       b_Methods.navigateBack();
       b_Methods.searchCalculus();
       b_Methods.selectCalculus();
       b_Methods.addToCard();
       Thread.sleep(3000);
       b_Methods.cancel();
       b_Methods.quit();
    }
}