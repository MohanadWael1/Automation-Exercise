package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

    WebDriver driver ;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Gender_Select_Male()
    {
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
    }


    public void Gender_Select_Female()
    {
        driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
    }


    public void Enter_Password(String password)
    {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

    public void Enter_Birth_Date(String day , String month , String year)
    {
        Select day_select = new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
        day_select.selectByValue(day);

        Select month_select = new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
        month_select.selectByValue(month);

        Select year_select = new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
        year_select.selectByValue(year);
    }


    public void First_CheckBox_Check()
    {
        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
    }

    public void Second_CheckBox_Check()
    {
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
    }


    public void Enter_LName(String LName)
    {
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys(LName);
    }

    public void Enter_Company(String Company)
    {
        driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys(Company);
    }

    public void Enter_Add(String Add)
    {
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys(Add);
    }



    public void Enter_State(String State)
    {
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys(State);
    }

    public void Enter_City(String City)
    {
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(City);
    }

    public void Enter_ZIP(String ZIP)
    {
        driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys(ZIP);
    }

    public void Enter_Mobile_Number(String Number)
    {
        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys(Number);
    }

    public void Enter_FName(String FName)
    {
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys(FName);
    }


    public void Country_Select()
    {
        Select country_select = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
        country_select.selectByIndex(1);
    }


    public void CreateAccount_Button()
    {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
    }
















}
