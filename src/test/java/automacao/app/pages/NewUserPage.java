package automacao.app.pages;

import org.openqa.selenium.By;

public class NewUserPage extends BasePage{

    public void validatePage(){
        validateElementPresence("//*[@text='Registration']");
    }

    public By txtName = By.id("com.example.vamsi.login:id/etRegName");
    public By txtPhone = By.id("com.example.vamsi.login:id/etRegPhone");
    public By txtEmail = By.id("com.example.vamsi.login:id/etRegGmail");
    public By txtPassword = By.id("com.example.vamsi.login:id/etRegPassword");
    public By btnRegister = By.id("com.example.vamsi.login:id/btnRegLogin");
    public By btnLogin = By.id("com.example.vamsi.login:id/btnGotoLogin");
    public By toastMessage = By.xpath("/hierarchy/android.widget.Toast");
}