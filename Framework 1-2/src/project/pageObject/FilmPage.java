package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class FilmPage {

    public Label movieForm = new Label(By.xpath("//div[@class='movie-info']"), "movie info");
    public Button schedule = new Button(By.xpath("//ul[@id='newMenuSub']//li[3]"), "schedule");

}
