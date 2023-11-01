package co.com.rappi.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarProductoUI {


    public static Target TXT_BUSCAR_PRODUCTO_1 = Target.the( "Txt buscar producto" )
            .locatedBy( "(//div/input[@id='input'])[1]" );
    public static Target TXT_BUSCAR_PRODUCTO = Target.the( "Txt buscar producto" )
            .locatedBy( "(//div/input[@id='input'])[2]" );


}
