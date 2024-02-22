package automacao.app.actions;

import automacao.app.pages.BasePage;
import automacao.app.pages.LoginPage;
import org.junit.Assert;

public class LoginActions extends BasePage {

    private static final LoginPage loginPage = new LoginPage();

    public static void validatePage(){
        loginPage.validatePage();
    }

    public static void fillEmail(String email){
        sendKeys(loginPage.txtEmail, email);
    }

    public static void fillPassword(String password){
        sendKeys(loginPage.txtPassword, password);
    }

    public static void btnLogin(){
        tap(loginPage.btnLogin);
    }

    public static void btnNewUser(){
        tap(loginPage.btnNewUser);
    }

    public static void validateMessage(String mensagem){
        String error = captureText(loginPage.toastError);
        Assert.assertEquals(mensagem, error);
    }
}