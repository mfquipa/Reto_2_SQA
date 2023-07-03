package is.demo.serenity.steps;

import is.demo.serenity.pageObject.OrdenPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.codehaus.groovy.runtime.StringGroovyMethods.findAll;

public class OrdenSteps {
    OrdenPage ordenPage = new OrdenPage();

    @Step("Escoger Orden")
    public void ClickOrden() {
        ordenPage.getDriver().findElement(ordenPage.getLnkOrderItem()).click();
    }
}



    

