package co.sqasa.tasks;

import co.sqasa.userinterface.VisitarIni;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class VisitarPagina implements Task{
    private VisitarIni visitarIni;
    public static VisitarPagina pagina() {
        return Tasks.instrumented(VisitarPagina.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(visitarIni));
    }
}
