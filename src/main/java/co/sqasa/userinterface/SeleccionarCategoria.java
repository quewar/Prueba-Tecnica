package co.sqasa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SeleccionarCategoria extends PageObject {

    public static final Target SELECCIONAR_CATEGORIA =
            Target.the("Permitira al usuario seleccioar la categoria Amor").locatedBy("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/div/div[2]/div/ul/li[2]/a");

}
