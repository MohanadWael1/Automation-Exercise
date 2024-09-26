package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureTestPage {

    WebDriver driver ;

    public SecureTestPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Validate_HomePage()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div")).isDisplayed());
    }


    public void Validate_SignIn_LogInPage()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).isDisplayed());
    }

    public void Validate_SignUpPage()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b")).isDisplayed());
    }

    public void Validate_Account_Created()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).isDisplayed());
    }

    public void Validate_Logged()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")).getText().contains("Logged in"));
    }

    public void Validate_Deleted_Account()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).isDisplayed());
    }

    public void Validate_Loggedout()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).isDisplayed());
    }

    public void Validate_Wrong_LogIn()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p")).isDisplayed());
    }

    public void Validate_Existing_Credentials()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p")).isDisplayed());
    }






}
