package automacao.app.steps;

import automacao.app.actions.LoginActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginSteps {

    @Dado("que eu acesse a página de Login do app")
    public void queEuAcesseAPaginaDeLoginDoApp() {
        log.info("Validar que a pagina inicial foi carregada");
        LoginActions.validatePage();
    }

    @E("clique em registrar um novo usuário")
    public void cliqueEmRegistrarUmNovoUsuario() {
        log.info("Clicar em registrar novo usuário");
        LoginActions.btnNewUser();
    }

    @Quando("preencher as informacoes de Login {string} {string}")
    public void preencherAsInformacoesDeLogin(String email, String password) {
        log.info("Preencher as informacoes de usuario e senha");
        LoginActions.validatePage();
        LoginActions.fillEmail(email);
        LoginActions.fillPassword(password);
    }

    @E("eu clicar em login")
    public void euClicarEmLogin() {
        log.info("Clicar em login");
        LoginActions.btnLogin();
    }

    @Então("deve aparecer um popup com a {string}")
    public void deveAparecerUmPopupComA(String mensagem) {
        log.info("Validando o popup");
        LoginActions.validateMessage(mensagem);
    }
}