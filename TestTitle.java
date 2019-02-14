import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTitle {

    @Test
    public void TestTitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natalia\\IdeaProjects\\Fitatu\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String baseUrl = "http://fitatu.com";
        String expectedTitle = "Fitatu - Strać wagę. Nie siebie. Najbardziej ludzki sposób odchudzania.";
        String actualTitle = "";

        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test passed!");
        }else {
            System.out.println("Test failed");
        }
        driver.close();

    }
}