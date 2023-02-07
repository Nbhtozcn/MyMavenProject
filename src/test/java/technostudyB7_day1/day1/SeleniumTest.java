package technostudyB7_day1.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- browser driver set up
        WebDriverManager.chromedriver().setup(); //from pom from bonigarcia
        //2- create object of ChromeDriver to open the browser
        WebDriver driver= new ChromeDriver(); //WebDriver is an interface and ChromeDriver is a class
        //3- go to google page
        driver.get("https://www.google.com"); //those are all selenium methods
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.techno.study");
        System.out.println(driver.getTitle());
        String expectedTitle="Join the best coding bootcamps online and get IT training in the US";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println(" is done: PASS");
        }else{
            System.out.println("Verification is done: FAILED");

            System.out.println("actualTitle="+ actualTitle);
        }

    }
}
