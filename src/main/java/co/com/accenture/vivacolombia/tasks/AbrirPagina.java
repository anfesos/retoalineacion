package co.com.accenture.vivacolombia.tasks;

import co.com.accenture.vivacolombia.exceptions.AbrirUrlException;
import co.com.accenture.vivacolombia.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.accenture.vivacolombia.exceptions.AbrirUrlException.NO_PUDO_ABRIR_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirPagina implements Task {

    PaginaPrincipal paginaPrincipal;

    @Override
    public <T extends Actor> void performAs(T actor) {
        abrirPagina();
    }

    private void abrirPagina() {
        try {
            theActorInTheSpotlight().attemptsTo(Open.browserOn(paginaPrincipal));
        }catch (AbrirUrlException e){
            throw new AbrirUrlException(NO_PUDO_ABRIR_URL,e);
        }
    }

    public static AbrirPagina vivaOnline(){
        return instrumented(AbrirPagina.class);
    }
}
