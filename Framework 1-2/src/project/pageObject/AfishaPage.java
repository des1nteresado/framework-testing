package project.pageObject;

import framework.elements.Button;
import org.openqa.selenium.By;

public class AfishaPage {

    public Button afisha = new Button(By.xpath("(//a[contains(text(),'Моя афиша')])[2]"), "afisha button");
    public Button HomeButton = new Button(By.xpath("//a[contains(@class, 'kinopoisk-header-logo kinopoisk-header-logo-section__logo')]"), "Home button");


    public boolean isAfishaPageOpened(){
        return afisha.isDisplayed();
    }

    public void chooseFilm(String film) {
        Button filmButton = new Button(By.xpath(String.format("//div[contains(@class,'filmsListNew js-rum-hero')]//div[@class='name']//a[contains(text(),'%s')]", film)), "film");
        filmButton.click();
    }
}
