package project.pageObject;

import framework.elements.Button;
import framework.elements.DropList;
import framework.elements.Label;
import org.openqa.selenium.By;

public class TopFilmsPage {
    public Label topPage = new Label(By.xpath("//tr[@id='top250_place_1']"), "Top Page");
    public DropList genre = new DropList(By.xpath("(//select[@onchange='MakeSort(this);'])[1]"), "genre list");
    public Button star = new Button(By.xpath("//div[@class='show_vote_326 star']"), "Start vote");
    public Button vote10 = new Button(By.xpath("(//div[@class='stars stars10'])[1]"), "vote 10");

    public boolean checkFilmInTop(String name) {
        Button film = new Button(By.xpath("//span[contains(text(),'Forrest Gump')]"), "name of film");
        return film.isDisplayed();
    }
}
