package co.com.rappi.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ElegirUbicacionUI {

    public static Target LBL_UBICACION = Target.the( "Lbl ubicacion" )
            .locatedBy( "//div/span[@class='sc-eCYdqJ hAMrPE']" );
    public static Target TXT_NOMBRE_UBICACION = Target.the( "Txt nombre ubicacion" )
            .locatedBy( "//div/input[@class='chakra-input css-5p5pfl']" );
    public static Target BTN_SELECCIONAR_UBICACION = Target.the( "Btn seleccionar ubicacion" )
            .locatedBy( "(//li/button[@class='chakra-button css-ady25'])[4]" );
    public static Target BTN_CONFIRMAR_UBICACION = Target.the( "Btn confirmar ubicacion" )
            .locatedBy( "//div/button[@id='confirm-address-button']" );
    public static Target BTN_GUARDAR_UBICACION = Target.the( "Btn guardar ubicacion" )
            .locatedBy( "//div/button[@id='save-address-button']" );

}
