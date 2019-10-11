package co.com.accenture.vivacolombia.model;

public class Reserva {

    private String ciudadOrigen;
    private String cidudadDestino;
    private String fechaVuelo;

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCidudadDestino() {
        return cidudadDestino;
    }

    public void setCidudadDestino(String cidudadDestino) {
        this.cidudadDestino = cidudadDestino;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }
}
