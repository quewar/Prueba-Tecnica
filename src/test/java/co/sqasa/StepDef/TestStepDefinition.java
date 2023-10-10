package co.sqasa.StepDef;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.sqasa.tasks.*;
import java.util.List;

public class TestStepDefinition {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Kevin quiere seleccionar un producto$")
    public void KevinQuiereSeleccionarUnProducto() throws Exception {
        OnStage.theActorCalled("Kevin").wasAbleTo(
                VisitarPagina.pagina()
        );
    }


    @When("^de clic en uno de los productos$")
    public void deClicEnUnoDeLosProductos() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCategorias.enPagina()
                );
        Thread.sleep(3000);

    };




    @Then("^se deberan agregar al carrito de compras$")
    public void seDeberanAgregarAlCarritoDeCompras() throws Exception {
        OnStage.theActorInTheSpotlight();
        System.out.println("caracter");
    }


}
