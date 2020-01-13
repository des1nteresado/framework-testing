package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.AfishaPage;
import project.pageObject.MainPage;

import java.io.UnsupportedEncodingException;

public class TestCase9 extends Base {

    @Test
    public void testCase9() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.afisha.click();
        AfishaPage afishaPage = new AfishaPage();
        Assert.assertTrue(afishaPage.isAfishaPageOpened(),"Afisha page did not opened");
        afishaPage.HomeButton.click();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
    }
}
