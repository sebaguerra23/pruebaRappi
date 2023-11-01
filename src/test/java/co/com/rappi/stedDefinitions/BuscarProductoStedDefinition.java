package co.com.rappi.stedDefinitions;

import co.com.rappi.tasks.BuscarProductoTask;
import co.com.rappi.tasks.ElegirUbicacionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BuscarProductoStedDefinition {

@Before

public void setStage() {setTheStage(new OnlineCast());}
    @Dado("que el usuario encuentre la pagina de rappi")
    public void queElUsuarioEncuentreLaPaginaDeRappi() {

        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.rappi.com.co/")
        );
    }
    @Cuando("el usuario seleccione y de click en el producto")
    public void elUsuarioSeleccioneYDeClickEnElProducto() {
        theActorInTheSpotlight().attemptsTo(
                ElegirUbicacionTask.on(),
                BuscarProductoTask.on()
        );

    }
    @Entonces("el usuario visualizara el pruducto seleccionado")
    public void elUsuarioVisualizaraElPruductoSeleccionado() {

    }
}
