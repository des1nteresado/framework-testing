package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.LoginPage;
import project.pageObject.MainPage;

public class TestCase1 extends Base {

    @Test
    public void testCase1 () {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(),"Main page did not opened");
        mainPage.loginButton.click();
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isLoginPageOpened(),"Login page did not opened");
        loginPage.signIn.click();
        loginPage.error.waitVisibilityOfElement();
        Assert.assertEquals(loginPage.error.getText(),"Логин не указан", "Message about error didn't displayed");
    }
}
