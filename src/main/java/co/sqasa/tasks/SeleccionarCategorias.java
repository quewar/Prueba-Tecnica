package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import co.sqasa.userinterface.SeleccionarCategoria;

public class SeleccionarCategorias implements Task{

    private  SeleccionarCategoria seleccionarCategoria;

    public static SeleccionarCategorias enPagina(){return Tasks.instrumented(SeleccionarCategorias.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SeleccionarCategoria.SELECCIONAR_CATEGORIA),
                MoveMouse.to(seleccionarCategoria.TOOLTIP),
                Click.on(SeleccionarCategoria.AGREGAR_PRODUCTO1),
                MoveMouse.to(seleccionarCategoria.TOOLTIP2),
                Click.on(SeleccionarCategoria.AGREGAR_PRODUCTO2)

        );

    }



}
