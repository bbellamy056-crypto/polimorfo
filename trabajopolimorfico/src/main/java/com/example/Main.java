package com.example;

import java.util.ArrayList;

import com.example.vehiculo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new Automovil("Chevrolet", "Onix", 2022, 4));
        flota.add(new Camion("Volvo", "FH", 2020, 20.5));
        flota.add(new Motocicleta("Yamaha", "MT-07", 2023, 689));

        for (Vehiculo v : flota) {
            System.out.println("Vehículo: " + v.getMarca() + " " + v.getModelo() + 
                               " | Costo de Mantenimiento: $" + v.calcularMantenimiento());
        }
    }
}