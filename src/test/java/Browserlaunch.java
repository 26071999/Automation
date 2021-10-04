import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import javafx.beans.InvalidationListener;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Browserlaunch {
    private static WebDriver driver;
    @BeforeClass
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public  void setupDriver(){
        driver=new ChromeDriver();
    }
    @After
    public static void test(){
        if(driver.getTitle().equals("Google"))
            System.out.println("Chrome Launch test case succeeded");
        else
            System.out.println("Chrome launch failed");
    }
    @SneakyThrows
    public static void main(String[] args)  {
        //launchHardCode();
       // launchChromePropertyFile();
        launchWebDriverManager();

    }
     @Test
    private static void launchWebDriverManager() {

        System.out.println(new ChromeDriverManager().getDriverManagerType().getBrowserName());
        driver.get("https://www.google.com");

    }

    private static void launchHardCode() {
        String driverPath = "C:\\Users\\Lenovo\\NewChrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        System.out.println(System.getProperties());
        WebDriver w = new ChromeDriver();
        w.get("https://www.google.com");
        if (w.getTitle().equals("Google")) {
            System.out.println("Chrome launch test case is pass");
        } else {
            System.out.println("Chrome launch test case is fail");
        }
    }
    @SneakyThrows
    @Test
    public static void launchChromePropertyFile()  {
        Properties p=new Properties();
        File file=new File("selenuim.properties");

        FileInputStream f=new FileInputStream(file);
        p.load(f);
       String s = p.get("chrome.driver.path").toString();
        System.setProperty("webdriver.chrome.driver", s);
        WebDriver w=new ChromeDriver();
        w.get("https://www.google.com");


    }
}
