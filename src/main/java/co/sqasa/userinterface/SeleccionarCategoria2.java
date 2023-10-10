package co.sqasa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;


public class SeleccionarCategoria2 extends PageObject {



    public static final Target AGREGAR_PRODUCTO1 =
            Target.the("Permitira al usuario agregar un producto")
                    .locatedBy("//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/figure/div/div[1]/a");

    public static final Target TOOLTIP =
            Target.the("Verifica la opción del producto")
                    .locatedBy("//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/figure/a/img");

    public static final Target SELECCIONAR_CATEGORIA2 =
            Target.the("Permitira al usuario seleccioar la categoria Cumpleaños")
                    .locatedBy("//*[@id=\"primary-menu\"]/li[4]/a");

    public static final Target ELIMINAR_PRODUCTO =
            Target.the("Permitira al usuario eliminar un producto del carrito")
                    .locatedBy("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[6]/a");



}
