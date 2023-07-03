package is.demo.serenity.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EmpleadoPage extends PageObject {
    By inputEmpleados = By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID']");
    By listEmpleados = By.xpath("//*[@id='select2-results-9']//li");

    By btnAplicarCambios = By.xpath("//div[@data-action='apply-changes']");

    public By getInputEmpleados() {
        return inputEmpleados;
    }

    public By getListEmpleados() {
        return listEmpleados;
    }

    public By getBtnAplicarCambios() {
        return btnAplicarCambios;
    }


}



