package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import resources.URLs;

public class first {
    public static void main(String args[]){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get(URLs.google);
        driver.quit();
    }
}
