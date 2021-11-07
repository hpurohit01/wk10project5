package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

    public static void main(String[] args) {

        String baseUrl ="https://www.nopcommerce.com/en/demo";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();

    }

}
