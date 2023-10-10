package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import co.sqasa.userinterface.SeleccionarCategoria;

public class SeleccionarCategorias implements Task{

    private String strCategoria;


    public SeleccionarCategorias(String strCategoria) {
        this.strCategoria = strCategoria;
    }

    public static SeleccionarCategorias enPagina(String strCategoria) {
        return Tasks.instrumented(SeleccionarCategorias.class, strCategoria );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionarCategoria.SELECCIONAR_CATEGORIA)

        );

    }



}
