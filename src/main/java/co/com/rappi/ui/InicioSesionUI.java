package co.com.rappi.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionUI {

    public static Target BTN_REGISTRARME = Target.the( "btn registrarme" )
            .locatedBy( "(//button/span[@class='sc-eqUAAy jzpdih'])[1]" );
    public static Target BTN_YA_TENGO_UNA = Target.the( "btn ya tengo una" )
            .locatedBy( "//button[@class='chakra-button css-9vz7aw']" );
    public static Target BTN_CONTINUAR_CORREO = Target.the( "btn continuar con correo" )
            .locatedBy( "//button[@class='chakra-button css-1ld60lx']" );
    public static Target TXT_CORREO_ELECTRONICO = Target.the( "txt correo electronico" )
            .locatedBy( "//input[@class='chakra-input css-4ccjja']" );
    public static Target BTN_CONTINUAR = Target.the( "btn continuar" )
            .locatedBy( "//button[contains(text(),'Continuar')]" );
    public static Target BTN_VERIFICAR = Target.the( "btn verificar" )
            .locatedBy( "//button[@class='chakra-button css-1ncbkvu']" );


}
