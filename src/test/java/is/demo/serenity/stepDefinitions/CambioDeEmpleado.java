package is.demo.serenity.stepDefinitions;


import io.cucumber.java.es.*;
import is.demo.serenity.steps.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CambioDeEmpleado {

    @Steps
    LoginSteps loginSteps;

    @Steps
    DashBoardSteps dashBoardSteps;

    @Steps
    OrdenSteps ordenSteps;

    @Steps
    EmpleadoStep empleadoStep;

    @Steps
    AlertaSteps alertaSteps;

    @Dado("que el usuario se encuentre logueado en la pagina de Demo Serenity")
    public void queElUsuarioSeEncuentreLogueadoEnLaPaginaDeDemoSerenity() throws IOException {
        loginSteps.abrirNavegador();
        loginSteps.enviarUsuario();
        loginSteps.enviarClave();
        loginSteps.clicInicioSesion();
    }

    @Cuando("el usuario da click en la seccion Open Order y seleccione cualquier orden")
    public void elUsuarioDaClickEnLaSeccionOpenOrderYSeleccinaOrden() {
        dashBoardSteps.EntrarOpenOrden();
        ordenSteps.ClickOrden();

    }

    @Cuando("el usuario seleccionara un empleado de forma aleatoria y dara click en Aplicar cambios")
    public void elUsuarioSeleccionaraUnEmpleadoDeFormaAleatoriaYClickEnAplicarCambios() {
        empleadoStep.ClickEmpleados();
        empleadoStep.seleccionarEmpleado();
        empleadoStep.botonAplicar();

    }

    @Entonces("el usuario visualizara el mensaje de alerta Save Succes")
    public void elUsuarioVisualizaraElMensajeDeAlertaSaveSucces() {
        alertaSteps.ValidarAlerta();

    }
}
