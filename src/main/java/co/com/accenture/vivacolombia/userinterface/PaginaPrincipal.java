package co.com.accenture.vivacolombia.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.vivaair.com/co/es?gclid=EAIaIQobChMI_PGikubG5AIVlFuGCh0TdwoPEAAYASAAEgK98fD_BwE")
public class PaginaPrincipal extends PageObject {

    public static final Target TIPO_DE_VIAJE = Target.the("Tipo de vuelo").located(By.xpath("//*[@id='criteria']/div[2]/div[1]/label/span[1]"));
    public static final Target CIUDAD_ORIGEN = Target.the("Elección Ciudad Origen").located(By.id ("criteria-airport-select-departure-input"));
    public static final Target CIUDAD_DESTINO = Target.the("Elección Ciudad Destino").located(By.id ("criteria-airport-select-destination-input"));
    public static final Target FECHA_IDA = Target.the("Elección Fecha Ida").located(By.xpath("//*[@id='criteria-dates-from']"));
    public static final Target BOTON_BUSCAR = Target.the("Elección Fecha Ida").located(By.id ("criteria-search-button-desktop"));

}

