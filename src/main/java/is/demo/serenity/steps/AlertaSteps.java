package is.demo.serenity.steps;

import is.demo.serenity.pageObject.AlertaPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AlertaSteps {

    AlertaPage alertaPage= new AlertaPage();

    @Step
    public void ValidarAlerta(){
        Assert.assertTrue(
               alertaPage.getDriver().findElement(alertaPage.getAltCambioExito()).isDisplayed()
        );
    }
}
