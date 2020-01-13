package project.pageObject;

import framework.elements.Button;
import org.openqa.selenium.By;

import java.io.UnsupportedEncodingException;

public class AfishaPage {

    public String convertToUtf(String str)
    {
        byte pText[] = str.getBytes();
        String value = "";
        try
        {
            value = new String(pText, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }

    public Button afisha = new Button(By.xpath(convertToUtf("(//a[contains(text(),'Моя афиша')])[2]")), "afisha button");
    public Button HomeButton = new Button(By.xpath("//a[contains(@class, 'kinopoisk-header-logo kinopoisk-header-logo-section__logo')]"), "Home button");

    public boolean isAfishaPageOpened(){
        return afisha.isDisplayed();
    }

    public void chooseFilm(String film) {
        Button filmButton = new Button(By.xpath(String.format("//div[contains(@class,'filmsListNew js-rum-hero')]//div[@class='name']//a[contains(text(),'%s')]", film)), "film");
        filmButton.click();
    }
}
