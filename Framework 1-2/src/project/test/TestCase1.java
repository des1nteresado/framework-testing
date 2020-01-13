package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.LoginPage;
import project.pageObject.MainPage;

import java.io.UnsupportedEncodingException;

public class TestCase1 extends Base {

    @Test
    public void testCase1 () throws UnsupportedEncodingException {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(),"Main page did not opened");
        mainPage.loginButton.click();
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isLoginPageOpened(),"Login page did not opened");
        loginPage.signIn.click();
        loginPage.error.waitVisibilityOfElement();
        byte ptext[] = "Логин не указан".getBytes();
        String value = new String(ptext, "UTF-8");

        Assert.assertEquals(loginPage.error.getText(),value, "Message about error didn't displayed");
    }
}
