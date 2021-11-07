package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://www.nopcommerce.com/en/demo";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();

    }
}