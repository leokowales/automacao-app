package automacao.app.actions;

import automacao.app.pages.AreaLogadaPage;
import automacao.app.pages.BasePage;

public class AreaLogadaActions extends BasePage {

    private static final AreaLogadaPage areaLogadaPage = new AreaLogadaPage();

    public static void validatePage(){
        areaLogadaPage.validatePage();
    }
}
