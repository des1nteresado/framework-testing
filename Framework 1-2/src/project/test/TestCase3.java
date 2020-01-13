package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.AfishaPage;
import project.pageObject.MainPage;

public class TestCase3 extends Base {

    @Test
    public void testCase3() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.afisha.click();
        AfishaPage afishaPage = new AfishaPage();
        Assert.assertTrue(afishaPage.isAfishaPageOpened(),"Afisha page did not opened");
        afishaPage.HomeButton.click();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
    }
}
