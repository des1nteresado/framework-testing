package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class LoginPage {

    public Label loginForm = new Label(By.xpath("//div[@class='passp-auth']"),"Login form");
    public Button signIn = new Button(By.xpath("//button[contains(@class,'control button2 button2_view_classic button2_size_l button2_theme_action button2_width_max button2_type_submit passp-form-button')]"),"signIn button");
    public Label error = new Label(By.xpath("//div[@class='passp-form-field__error']"),"passwordButton");

    public boolean isLoginPageOpened() {
        return loginForm.isDisplayed();
    }


}
