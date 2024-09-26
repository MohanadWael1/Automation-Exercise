package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingIn_LogIn {
    WebDriver driver ;

    public SingIn_LogIn(WebDriver driver) {
        this.driver = driver;
    }


    public void Enter_UserName(String username)
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys(username);
    }


    public void Enter_mail(String mail)
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys(mail);
    }

    public void Click_SignUp_Button()
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
    }

    public void Enter_Login_mail(String mail)
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys(mail);
    }

    public void Enter_Login_Password(String pass)
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys(pass);
    }

    public void Click_Login_Button()
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    }






}
