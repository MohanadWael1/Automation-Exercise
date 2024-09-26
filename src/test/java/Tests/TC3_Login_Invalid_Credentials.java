package Tests;

import Pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC3_Login_Invalid_Credentials extends TestBase {
    AccountCreated AC ;
    DeleteAccount DA ;
    HomePage HP;
    SecureTestPage STP ;
    SignUpPage SUP ;
    SingIn_LogIn SL ;

    @BeforeClass
    public void Preconditions()
    {
        AC = new AccountCreated(driver);
        DA = new DeleteAccount(driver);
        HP = new HomePage(driver);
        STP = new SecureTestPage(driver);
        SUP = new SignUpPage(driver);
        SL = new SingIn_LogIn(driver);
    }

    @Test
    public void Login_InValid_Credentials()
    {
        HP.Navigate_To_HomePage();
        STP.Validate_HomePage();
        HP.Click_Sign_In();
        STP.Validate_SignIn_LogInPage();
        SL.Enter_UserName(username);
        SL.Enter_mail(mail);
        SL.Click_SignUp_Button();
        STP.Validate_SignUpPage();
        SUP.Gender_Select_Male();
        SUP.Enter_Password(password);
        SUP.Enter_Birth_Date(D,M,Y);
        SUP.First_CheckBox_Check();
        SUP.Second_CheckBox_Check();
        SUP.Enter_FName(Fname);
        SUP.Enter_LName(Lname);
        SUP.Enter_Company(Company);
        SUP.Enter_Add(address);
        SUP.Country_Select();
        SUP.Enter_State(state);
        SUP.Enter_City(City);
        SUP.Enter_ZIP(ZIP);
        SUP.Enter_Mobile_Number(mn);
        SUP.CreateAccount_Button();
        STP.Validate_Account_Created();
        AC.Continue_Button();
        STP.Validate_Logged();
        HP.Logout();
        STP.Validate_Loggedout();
        HP.Navigate_To_HomePage();
        STP.Validate_HomePage();
        HP.Click_Sign_In();
        STP.Validate_SignIn_LogInPage();
        SL.Enter_Login_mail(Invalidmail);
        SL.Enter_Login_Password(InvalidPassword);
        SL.Click_Login_Button();
        STP.Validate_Wrong_LogIn();
        SL.Enter_Login_mail(mail);
        SL.Enter_Login_Password(password);
        SL.Click_Login_Button();
        STP.Validate_Wrong_LogIn();
        HP.Delete_Account();

    }






}
