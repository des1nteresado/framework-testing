package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class KinopoiskHdPage {
    public Label kinopoiskHd = new Label(By.xpath("//a[@aria-current='page']"), "My cinema");
    public Button logo = new Button(By.xpath("//a[contains(@class,'Header__logo-wrapper--2mjPc')]"), "logo");
    public Button kinopoisk = new Button(By.xpath("//a[@href='https://www.kinopoisk.ru']"), "kinopoisk");


}
