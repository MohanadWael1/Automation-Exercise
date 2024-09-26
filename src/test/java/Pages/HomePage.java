package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver ;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void Navigate_To_HomePage()
    {
        driver.navigate().to("http://automationexercise.com");
    }

    public void Click_Sign_In()
    {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    public void Delete_Account()
    {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
    }

    public void Logout()
    {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }






}
