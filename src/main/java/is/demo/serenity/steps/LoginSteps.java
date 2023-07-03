package is.demo.serenity.steps;

import is.demo.serenity.pageObject.LoginPage;
import is.demo.serenity.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Step("Usuario abre el navegador")
    public void abrirNavegador() {
        loginPage.openUrl("https://demo.serenity.is");
    }

    @Step
    public void enviarUsuario() throws IOException {

       ArrayList<Map<String, String>> data=Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Hoja1");
        loginPage.getDriver().findElement(loginPage.getTxtUsuario()).clear();
        loginPage.getDriver().findElement(loginPage.getTxtUsuario()).sendKeys(data.get(0).get("Usuario"));
    }

    @Step
    public void enviarClave() throws IOException{
        ArrayList<Map<String, String>> data=Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Hoja1");
        loginPage.getDriver().findElement(loginPage.getTxtClave()).clear();
        loginPage.getDriver().findElement(loginPage.getTxtClave()).sendKeys(data.get(0).get("Clave"));
    }

    @Step
    public void clicInicioSesion() {
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }

}
