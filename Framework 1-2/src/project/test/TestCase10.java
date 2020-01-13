package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.LoginPage;
import project.pageObject.MainPage;
import project.pageObject.TopFilmsPage;

public class TestCase10 extends Base {

    @Test
    public void testCase10() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.top250.click();
        TopFilmsPage topFilmsPage = new TopFilmsPage();
        Assert.assertTrue(topFilmsPage.topPage.isDisplayed(),"Afisha page did not opened");
        topFilmsPage.star.click();
        topFilmsPage.vote10.click();
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isLoginPageOpened(),"Login page did not opened");

    }
}
