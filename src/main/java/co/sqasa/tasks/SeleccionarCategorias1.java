package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import co.sqasa.userinterface.SeleccionarCategoria1;

public class SeleccionarCategorias1 implements Task{

    private SeleccionarCategoria1 seleccionarCategoria;

    public static SeleccionarCategorias1 enPagina(){return Tasks.instrumented(SeleccionarCategorias1.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SeleccionarCategoria1.SELECCIONAR_CATEGORIA),
                MoveMouse.to(seleccionarCategoria.TOOLTIP),
                Click.on(SeleccionarCategoria1.AGREGAR_PRODUCTO1),
                MoveMouse.to(seleccionarCategoria.TOOLTIP2),
                Click.on(SeleccionarCategoria1.AGREGAR_PRODUCTO2)


        );

    }



}
