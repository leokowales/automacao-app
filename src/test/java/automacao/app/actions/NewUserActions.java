package automacao.app.actions;

import automacao.app.pages.BasePage;
import automacao.app.pages.NewUserPage;
import org.junit.Assert;

public class NewUserActions extends BasePage {

    private static final NewUserPage newUserPage = new NewUserPage();

    public static void validatePage(){
        newUserPage.validatePage();
    }

    public static void fillName(String name){
        sendKeys(newUserPage.txtName, name);
    }

    public static void fillPhone(String phone){
        sendKeys(newUserPage.txtPhone, phone);
    }

    public static void fillEmail(String email){
        sendKeys(newUserPage.txtEmail, email);
    }

    public static void fillPassword(String password){
        sendKeys(newUserPage.txtPassword, password);
    }

    public static void btnRegister(){
        tap(newUserPage.btnRegister);
    }

    public static void btnLogin(){
        tap(newUserPage.btnLogin);
    }

    public static void validateMessage(String message){
        String toastmessage = captureText(newUserPage.toastMessage);
        Assert.assertEquals(toastmessage, message);
    }
}