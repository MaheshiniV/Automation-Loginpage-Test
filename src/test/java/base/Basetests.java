package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.util.List;

public class Basetests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {   // Selenium WebDriver is going to need to know where is that executable file that you have
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
       // driver.manage().window().fullscreen();
        homePage = new HomePage(driver);

       /* WebElement inputLinks =  driver.findElement(By.linkText("Shifting Content"));
       inputLinks.click();

        WebElement inputLinks1 =  driver.findElement(By.linkText("Example 1: Menu Element"));
        inputLinks1.click();

       List<WebElement> Links = driver.findElements(By.tagName("li"));
       System.out.println(Links.size());

        System.out.println(driver.getTitle());
        //driver.quit();

    } **/
}

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
