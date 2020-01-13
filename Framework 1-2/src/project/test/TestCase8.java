package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.TopFilmsPage;

import java.io.UnsupportedEncodingException;

public class TestCase8 extends Base {

    @Test
    public void testCase8() throws UnsupportedEncodingException {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.top250.click();
        TopFilmsPage topFilmsPage = new TopFilmsPage();
        Assert.assertTrue(topFilmsPage.topPage.isDisplayed(),"Afisha page did not opened");
        byte ptext[] = "комедии".getBytes();
        String value = new String(ptext, "UTF-8");
        topFilmsPage.genre.selectFromList(value);
        Assert.assertTrue(topFilmsPage.checkFilmInTop("Forrest Gump"));
        topFilmsPage.genre.selectFromList("-");
        Assert.assertTrue(topFilmsPage.checkFilmInTop("The Shawshank Redemption"));
    }
}
