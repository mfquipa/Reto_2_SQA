package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AlertaPage extends PageObject {

    By altCambioExito= By.xpath("//div[@class='toast-message']");

    public By getAltCambioExito() {
        return altCambioExito;
    }
}
