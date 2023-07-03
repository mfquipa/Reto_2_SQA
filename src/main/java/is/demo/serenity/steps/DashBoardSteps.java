package is.demo.serenity.steps;

import is.demo.serenity.pageObject.DashBoardPage;
import net.thucydides.core.annotations.Step;



public class DashBoardSteps {
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Step("Entrar a OpenOrden")
    public void EntrarOpenOrden() {
                        dashBoardPage.getDriver().findElement(dashBoardPage.getLnkOpenOrden()).click();

    }
    }
