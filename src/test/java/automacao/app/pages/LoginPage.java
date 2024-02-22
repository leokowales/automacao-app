package automacao.app.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public void validatePage(){
        validateElementPresence("//android.widget.TextView[@text='Login']");
    }

    public By txtEmail = By.id("com.example.vamsi.login:id/etLogGmail");
    public By txtPassword = By.id("com.example.vamsi.login:id/etLoginPassword");
    public By btnLogin = By.id("com.example.vamsi.login:id/btnLogin");
    public By btnNewUser = By.id("com.example.vamsi.login:id/tvRegister");
    public By toastError = By.xpath("/hierarchy/android.widget.Toast");
}