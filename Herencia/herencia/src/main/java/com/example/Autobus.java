package com.example;

public class Autobus extends Transporte {


    private int numeroLlantas;
    private boolean tieneBodega;
    private String tipoServicio;

    
    public Autobus(String marca, String modelo, int año,
                   int capacidadPasajeros, int velocidadMaxima,
                   int numeroLlantas, boolean tieneBodega, String tipoServicio) {

        super(marca, modelo, año, capacidadPasajeros, velocidadMaxima);

        this.numeroLlantas = numeroLlantas;
        this.tieneBodega = tieneBodega;
        this.tipoServicio = tipoServicio;
    }

    
    @Override
    public String toString() {
        return super.toString()
                + ", Número de ejes: " + numeroLlantas
                + ", Tiene bodega: " + tieneBodega
                + ", Tipo de servicio: " + tipoServicio;
    }
}
