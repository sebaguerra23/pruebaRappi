package co.com.rappi.stedDefinitions;

import co.com.rappi.tasks.BuscarProductoTask;
import co.com.rappi.tasks.InicioSesionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesionStedDefinition {

@Before

public void setStage() {setTheStage(new OnlineCast());}
    @Cuando("el usuario diligencie los credenciales de inicio de sesion")
    public void elUsuarioDiligencieLosCredencialesDeInicioDeSesion() {
        theActorInTheSpotlight().attemptsTo(

               InicioSesionTask.on()
        );

    }
    @Entonces("el usuario visualizara un mensaje de de bienvenida")
    public void elUsuarioVisualizaraUnMensajeDeDeBienvenida() {

    }

}
