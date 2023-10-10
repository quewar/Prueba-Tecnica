package co.sqasa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;


public class SeleccionarCategoria1 extends PageObject {

    public static final Target SELECCIONAR_CATEGORIA =
            Target.the("Permitira al usuario seleccioar la categoria Amor")
                    .locatedBy("//*[@id=\"primary-menu\"]/li[3]/a");

    public static final Target AGREGAR_PRODUCTO1 =
            Target.the("Permitira al usuario agregar un producto")
                    .locatedBy("//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/figure/div/div[1]/a");

    public static final Target AGREGAR_PRODUCTO2 =
            Target.the("Permitira al usuario agregar un producto 2")
                    .locatedBy("//*[@id=\"main\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]/figure/div/div[1]/a");

    public static final Target TOOLTIP =
            Target.the("Verifica la opción del producto")
                    .locatedBy("//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/figure/a/img");

    public static final Target TOOLTIP2 =
            Target.the("Verifica la opción del producto 2")
                    .locatedBy("//*[@id=\"main\"]/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]/figure/a/img");




}
