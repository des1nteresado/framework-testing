package project.pageObject;

import framework.elements.Label;
import framework.elements.Button;
import framework.utils.LogUtils;
import org.openqa.selenium.By;

public class MainPage {

    public Label banner = new Label(By.xpath("//div[contains(@class,'section watch-on-hd-block')]"),"MainPage banner");
    public Button loginButton = new Button(By.xpath("//button[contains(@class,'header-fresh-user-partial-component__login-button')]"), "Login button");
    public Button vk = new Button(By.xpath("//a[contains(@class,'social-section__icon social-section__icon_type_vkontakte')]"),"vk button");
    public Button afisha = new Button(By.xpath("(//a[contains(text(),'Афиша кинотеатров')])[2]"),"afisha button");
    public Button goUp = new Button(By.xpath("//span[@class='elevator__icon']"), "goUp button");
    public Button search = new Button(By.xpath("//input[contains(@class,'kinopoisk-header-search-form-input__input')]"), "search");
    public Button loup = new Button(By.xpath("//button[contains(@class,'kinopoisk-header-search-form-input__submit')]"), "loup");
    public Button top250 = new Button(By.xpath("(//a[contains(text(),'Топ 250')])[2]"),"afisha button");
    public Button kinopoiskHd = new Button(By.xpath("//a[contains(@class,'kinopoisk-header-featured-menu-item kinopoisk-header-featured-menu__item')][2]"),"kinopoiskHd");

    public boolean IsMainPageOpened(){
        return banner.isDisplayed();
    }
}
