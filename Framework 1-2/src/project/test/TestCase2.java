package project.test;

import framework.browser.Browser;
import framework.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase2 extends Base {

    private static final int INDEX_TAB = 1;

    @Test
    public void testCase2() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.vk.click();
        Browser.switchTab(INDEX_TAB);
        Assert.assertEquals(Browser.getDriver().getCurrentUrl(), ConfigReader.getTestData("vk_link"), "redirect to the desired site did not happen");
    }
}
