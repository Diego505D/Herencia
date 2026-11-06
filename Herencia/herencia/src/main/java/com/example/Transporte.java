package com.example;

public class Transporte {
    protected String modelo;
    protected String marca;
    protected int año;
    protected int capacidadPasajeros;
    protected int velocidadMaxima;
    

    public Transporte(String marca, String modelo, int año, int capacidadPasajeros, int velocidadMaxima ){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
    }


public void setVelocidadMaxima(int velocidadMaxima){
    if (velocidadMaxima < 0 ){
        throw new IllegalArgumentException("La velocidad no puede ser negativa");
    }

}

public void setAño(int año){
    if (año <= 1900 || año > 2026) {
    throw new IllegalArgumentException("Año inválido");
}
}

public void setCapacidadPasajeros(int capacidadPasajeros){
    if (capacidadPasajeros <= 0) {
    throw new IllegalArgumentException("La capacidad debe ser mayor a cero");
}

}


@Override 
public String toString(){
    return "Marca" + marca + " ,Modelo " + modelo + ", Año" + año + ", Maximo de pasajeros:" + capacidadPasajeros + ", Maxima velocidad" + velocidadMaxima;
}
}



