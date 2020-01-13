package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.TopFilmsPage;

public class TestCase8 extends Base {

    @Test
    public void testCase8() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.top250.click();
        TopFilmsPage topFilmsPage = new TopFilmsPage();
        Assert.assertTrue(topFilmsPage.topPage.isDisplayed(),"Afisha page did not opened");
        topFilmsPage.genre.selectFromList("комедии");
        Assert.assertTrue(topFilmsPage.checkFilmInTop("Forrest Gump"));
        topFilmsPage.genre.selectFromList("-");
        Assert.assertTrue(topFilmsPage.checkFilmInTop("The Shawshank Redemption"));
    }
}
