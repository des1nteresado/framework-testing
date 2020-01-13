package project.pageObject;

import framework.elements.Label;
import org.openqa.selenium.By;

public class SchedulePage {

    public Label seance = new Label(By.xpath("//main[@class='film-seances-page']"), "seance form");
}
