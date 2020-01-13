package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.AfishaPage;
import project.pageObject.FilmPage;
import project.pageObject.MainPage;
import project.pageObject.SchedulePage;

public class TestCase6 extends Base {

    @Test
    public void testCase6() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.afisha.click();
        AfishaPage afishaPage = new AfishaPage();
        Assert.assertTrue(afishaPage.isAfishaPageOpened(),"Afisha page did not opened");
        afishaPage.chooseFilm("Холоп");
        FilmPage filmPage = new FilmPage();
        Assert.assertTrue(filmPage.movieForm.isDisplayed(),"Film page did not opened");
        filmPage.schedule.click();
        SchedulePage schedulePage = new SchedulePage();
        Assert.assertTrue(schedulePage.seance.isDisplayed(),"Afisha page did not opened");

    }
}
