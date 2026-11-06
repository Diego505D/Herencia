package com.example;

public class Main {

    public static void main(String[] args) {

        Avion avion1 = new Avion(
                "Boeing", "747", 2020,
                400, 900, 4, 13000, "Comercial"
        );

       
        Tren tren1 = new Tren(
                "Siemens", "Velaro", 2022,
                500, 300, 12, "Electrica", 2
        );

    
        Autobus autobus1 = new Autobus(
                "Mercedes-Benz", "Sprinter", 2023,
                30, 160, 2, true, "Intermunicipal"
        );

        // Mostrar información
        System.out.println("===== AVIÓN =====");
        System.out.println(avion1);

        System.out.println("\n===== TREN =====");
        System.out.println(tren1);

        System.out.println("\n===== AUTOBÚS =====");
        System.out.println(autobus1);
    }
}