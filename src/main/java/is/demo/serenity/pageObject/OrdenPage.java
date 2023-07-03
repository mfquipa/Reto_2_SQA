package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;


public class OrdenPage extends PageObject {

    By lnkOrderItem =  By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[3]/div[1]/a");

    public By getLnkOrderItem() {
        return lnkOrderItem;
    }
/*public List<WebElementFacade> listOrden(){
        return findAll("//a[@data-item-id");*/
    }


    /*public List<String> listOrden() {
        List<String> ids = new ArrayList<>();
        List<WebElement> elementos = findAll(By.xpath("//a[@data-item-id]");
        for (WebElement elemento : elementos) {
            String id = elemento.getAttribute("id");
            ids.add(id);
        }
        return ids;*/



      /*//facil ejemplos
    By listOrden = By.xpath("//a[@data-item-id]");

    public By getListOrden() {
        return listOrden;
    }
  }*/


