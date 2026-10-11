package com.example;

import com.example.vehiculo.Vehiculo;

public class automovil {
    public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public double calcularMantenimiento() {
        return 150.0;
    }
}

}
