package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreated {
    WebDriver driver ;

    public AccountCreated(WebDriver driver) {
        this.driver = driver;
    }


    public void Continue_Button()
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }


}
