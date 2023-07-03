package is.demo.serenity.steps;

import is.demo.serenity.pageObject.EmpleadoPage;
import is.demo.serenity.utils.EsperaImplicita;
import is.demo.serenity.utils.Random;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmpleadoStep {
    EmpleadoPage empleadoPage = new EmpleadoPage();
    EsperaImplicita wait = new EsperaImplicita();

    @Step ("Lista de empleados")
    public void ClickEmpleados(){
       empleadoPage.getDriver().findElement(empleadoPage.getInputEmpleados()).click();

    }

    @Step("Seleccionar empleado Aleatorio")
    public void seleccionarEmpleado() {
        wait.esperaImplicita(5);
        List<WebElement> empleado = empleadoPage.getDriver().findElements(empleadoPage.getListEmpleados());
        empleado.get(Random.IndexRandom.numeroAleatorioEnRango(0, empleado.size())).click();
    }

    @Step("Mensaje de Alerta")
    public void botonAplicar() {
        empleadoPage.getDriver().findElement(empleadoPage.getBtnAplicarCambios()).click();

    }
}
