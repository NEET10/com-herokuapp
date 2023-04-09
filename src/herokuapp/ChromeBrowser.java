package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launch the Chrome browser
        WebDriver driver =new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current URL
        System.out.println("Current URL: "+driver.getCurrentUrl());
        //Print the Source page
        System.out.println("Page source: "+driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("username")).sendKeys("Swaminarayan@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("Shreeji123");
        //close the browser
       // driver.close();


    }
}
