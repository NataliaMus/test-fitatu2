import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class languageChange {

    @Test
    public void languageChange() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natalia\\IdeaProjects\\Fitatu\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://fitatu.com";

        driver.get(baseUrl);

        WebElement languageSelect = driver.findElement(By.className("js--language"));
        languageSelect.click();

        WebElement languageEspanol = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div[2]/div[4]"));
        languageEspanol.click();

        boolean isFlexDisplayed = driver.findElement(By.linkText("Fitatu Flex™")).isDisplayed();

        Assert.assertTrue(isFlexDisplayed);

        driver.close();
    }
}