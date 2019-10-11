package co.com.accenture.vivacolombia.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IngresarTextoPorJs implements Interaction {


    private String texto;
    private Target xpath;

   public IngresarTextoPorJs(Target target, String texto){

       this.texto=texto;
       this.xpath=target;

   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement targetElement = xpath.resolveFor(actor);
        BrowseTheWeb.as(actor).evaluateJavascript("argument[0].value=arguments[1]",targetElement,texto);
    }

    public static IngresarTextoPorJs enCampo(Target target, String texto){
       return new IngresarTextoPorJs(target, texto);
    }


}
