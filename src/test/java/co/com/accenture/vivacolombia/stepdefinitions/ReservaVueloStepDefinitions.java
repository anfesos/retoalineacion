package co.com.accenture.vivacolombia.stepdefinitions;

import co.com.accenture.vivacolombia.model.Reserva;
import co.com.accenture.vivacolombia.tasks.AbrirPagina;
import co.com.accenture.vivacolombia.tasks.DiligenciarFormularioDeReserva;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReservaVueloStepDefinitions {

    @Before
    public void crearUsuario(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que el usuario se encuentra dentro de la pagina de viva colombia$")
    public void queElUsuarioSeEncuentraDentroDeLaPaginaDeVivaColombia()  {
            theActorCalled("Usuario").wasAbleTo(AbrirPagina.vivaOnline());
    }


    @Cuando("^se ingresan los datos de reserva$")
    public void seIngresanLosDatosDeReserva(List<Reserva> datosReserva) {
            theActorInTheSpotlight().attemptsTo(DiligenciarFormularioDeReserva.con(datosReserva));
    }

    @Entonces("^la reserva se realiza de forma exitosa$")
    public void laReservaSeRealizaDeFormaExitosa() {

    }
}
