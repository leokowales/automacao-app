package automacao.app.steps;

import automacao.app.actions.NewUserActions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewUserSteps {

    @Quando("preencher as informacoes obrigatorias {string} {string} {string} {string}")
    public void preencherAsInformacoesObrigatorias(String nome, String telefone, String email, String senha) {
        log.info("Preenchendo as informações");
        NewUserActions.validatePage();
        NewUserActions.fillName(nome);
        NewUserActions.fillPhone(telefone);
        NewUserActions.fillEmail(email);
        NewUserActions.fillPassword(senha);
    }

    @E("clicar em Registrar")
    public void clicarEmRegistrar() {
        log.info("Clicar no botão de Registrar");
        NewUserActions.btnRegister();
        //NewUserActions.btnLogin();
    }

    @Então("deve aparecer um popup com uma {string} de confirmação")
    public void deveAparecerUmPopupComUmaDeConfirmacao(String toastMessage) {
        log.info("Validar que o usuário foi cadastrado");
        NewUserActions.validateMessage(toastMessage);
    }
}