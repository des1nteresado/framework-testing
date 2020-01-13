package project.test;

import framework.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;

public class TestCase5 extends Base {

    @Test
    public void testCase5() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.search.sendKeys("@Фильмы$");
        mainPage.loup.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.searchResult.isDisplayed(), "Search page did not opened");
        Assert.assertTrue(Integer.parseInt(searchResultPage.getCountSearchResult()) > 0, "result is null");
    }
}
