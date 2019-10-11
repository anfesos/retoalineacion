package co.com.accenture.vivacolombia.tasks;

import co.com.accenture.vivacolombia.model.Reserva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.accenture.vivacolombia.interactions.IngresarTextoPorJs.enCampo;
import static co.com.accenture.vivacolombia.userinterface.PaginaPrincipal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarFormularioDeReserva implements Task {

    List<Reserva> datosReserva;

    public DiligenciarFormularioDeReserva(List<Reserva> datosReserva){
        this.datosReserva = datosReserva;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       actor.attemptsTo(
               Click.on(TIPO_DE_VIAJE)
               , Enter.theValue(datosReserva.get(0).getCiudadOrigen()).into(CIUDAD_ORIGEN).thenHit(Keys.TAB)
               , Enter.theValue(datosReserva.get(0).getCidudadDestino()).into(CIUDAD_DESTINO).thenHit(Keys.TAB)
               );

       actor.attemptsTo(enCampo(FECHA_IDA,datosReserva.get(0).getFechaVuelo()));

       actor.attemptsTo(Click.on(BOTON_BUSCAR));

    }

    public static DiligenciarFormularioDeReserva con(List<Reserva> datosReserva){
        return instrumented(DiligenciarFormularioDeReserva.class,datosReserva);
    }
}
