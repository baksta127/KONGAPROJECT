package testLogin;
import org.testng.annotations.Test;
import PageObject.DashboardPage;
import SetUp.SetUpTests;
public class LoginTests extends SetUpTests {
    //TestNG annotation
    @Test
    public void testLogin() throws InterruptedException{
        String username = "gavin";
        loginPage.enterUsername(username);
        loginPage.enterUserpassword("user1111");
        DashboardPage dashboardPage = loginPage.ClickLoginButton();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
    }
