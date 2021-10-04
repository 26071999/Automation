import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InstagramLogin {
    @Test
    public  void testSuccessfulLogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com");

        WebElement uName= driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[1]/div/label/input"));
        uName.sendKeys("pr78847@gmail.com");

        WebElement uPassword=driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[2]/div/label/input"));
        uPassword.sendKeys("Prakash@7");
        driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[3]/button")).click();
        WebElement element=driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[1]/a/div/div/img"));
        Assert.assertTrue(element.isDisplayed());

    }
}
