package is.demo.serenity.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class DashBoardPage extends PageObject {
    By lnkOpenOrden = By.xpath("//a[@href='/Northwind/Order?shippingState=0' and contains(@class, 'card-footer')]");

    public By getLnkOpenOrden() {
        return lnkOpenOrden;
    }
}
