package co.sqasa.tasks;

import co.sqasa.userinterface.SeleccionarCategoria2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class SeleccionarCategorias2 implements Task{

    private SeleccionarCategoria2 seleccionarCategoria;

    public static SeleccionarCategorias2 enPagina2(){return Tasks.instrumented(SeleccionarCategorias2.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionarCategoria2.SELECCIONAR_CATEGORIA2),
                MoveMouse.to(SeleccionarCategoria2.TOOLTIP),
                Click.on(SeleccionarCategoria2.AGREGAR_PRODUCTO1),
                Click.on(SeleccionarCategoria2.ELIMINAR_PRODUCTO)

        );

    }



}
