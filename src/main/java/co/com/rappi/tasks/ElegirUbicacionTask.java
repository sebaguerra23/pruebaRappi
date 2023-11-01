package co.com.rappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.rappi.ui.ElegirUbicacionUI.*;

public class ElegirUbicacionTask implements Task {
    @Override
    public <T extends Actor> void performAs( T actor ) {

        actor.attemptsTo(

                Click.on( LBL_UBICACION ),
                Enter.theValue( "Monteria" ).into( TXT_NOMBRE_UBICACION ),
                Click.on( BTN_SELECCIONAR_UBICACION ),
                Click.on( BTN_CONFIRMAR_UBICACION ),
                Click.on( BTN_GUARDAR_UBICACION )

        );
    }
    public static Performable on(){

        return Tasks.instrumented( ElegirUbicacionTask.class );
    }
}
