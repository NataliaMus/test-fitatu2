import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonPraca {

    @Test
    public void buttonPraca() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natalia\\IdeaProjects\\Fitatu\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://fitatu.com";

        driver.get(baseUrl);
        driver.findElement(By.linkText("Praca")).click();

        driver.close();
    }
}
