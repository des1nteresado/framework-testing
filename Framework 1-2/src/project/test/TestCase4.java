package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase4 extends Base {

    private static final int POSITION = 0;

    @Test
    public void testCase4() throws InterruptedException {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.IsMainPageOpened(), "Main page did not opened");
        mainPage.vk.hoverElement();
        mainPage.goUp.click();
        Thread.sleep(1000);
        Assert.assertEquals(Browser.getCurrentScrollPosition().intValue(), POSITION);
    }
}
