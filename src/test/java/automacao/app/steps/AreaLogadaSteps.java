package automacao.app.steps;

import automacao.app.actions.AreaLogadaActions;
import io.cucumber.java.pt.Então;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AreaLogadaSteps {

    @Então("devo visualizar a area logada")
    public void devoVisualizarAAreaLogada() {
        log.info("Validar que está logado");
        AreaLogadaActions.validatePage();
    }
}