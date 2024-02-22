package automacao.app.pages;

public class AreaLogadaPage extends BasePage{

    public void validatePage(){
        validateElementPresence("//android.widget.TextView[@text='You are now logged in']");
    }
}
