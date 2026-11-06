package com.example;

public class Avion extends Transporte {

    private int cantidadMotores;
    private int alturaMaxima;
    private String tipoAvion;

    public Avion(String marca, String modelo, int año,
            int capacidadPasajeros, int velocidadMaxima,
            int cantidadMotores, int alturaMaxima, String tipoAvion) {

        super(marca, modelo, año, capacidadPasajeros, velocidadMaxima);

        this.cantidadMotores = cantidadMotores;
        this.alturaMaxima = alturaMaxima;
        this.tipoAvion = tipoAvion;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Cantidad de motores: " + cantidadMotores
                + ", Altura máxima: " + alturaMaxima
                + ", Tipo de avión: " + tipoAvion;
    }
}
