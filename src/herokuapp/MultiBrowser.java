package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "FireFox";
    static WebDriver driver;
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
        driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        //Open the URL
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current URL
        System.out.println("Current URL: "+driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source: "+driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("username")).sendKeys("Swaminarayan@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("Shreeji123");
        //Close the browser
        //driver.close();
    }


    }
