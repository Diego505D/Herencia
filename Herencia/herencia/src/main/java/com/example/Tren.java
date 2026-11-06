package com.example;

public class Tren extends Transporte {

    private int cantidadVagones;
    private String tipoEnergia;
    private int cantidadLocomotoras;

    public Tren(String marca, String modelo, int año,
            int capacidadPasajeros, int velocidadMaxima,
            int cantidadVagones, String tipoEnergia,
            int cantidadLocomotoras) {

        super(marca, modelo, año, capacidadPasajeros, velocidadMaxima);

        this.cantidadVagones = cantidadVagones;
        this.tipoEnergia = tipoEnergia;
        this.cantidadLocomotoras = cantidadLocomotoras;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Cantidad de vagones: " + cantidadVagones
                + ", Tipo de energía: " + tipoEnergia
                + ", Cantidad de locomotoras: " + cantidadLocomotoras;
    }
}