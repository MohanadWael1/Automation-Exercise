package Tests;

import Pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC4_Logout extends TestBase{
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
    public void Logout()
    {

        HP.Navigate_To_HomePage();
        STP.Validate_HomePage();
        HP.Click_Sign_In();
        STP.Validate_SignIn_LogInPage();
        SL.Enter_Login_mail(mail);
        SL.Enter_Login_Password(password);
        SL.Click_Login_Button();
        STP.Validate_Logged();
        HP.Logout();
        STP.Validate_SignIn_LogInPage();
        HP.Click_Sign_In();
        SL.Enter_Login_mail(mail);
        SL.Enter_Login_Password(password);
        SL.Click_Login_Button();
        STP.Validate_Logged();
        HP.Delete_Account();

    }
}
