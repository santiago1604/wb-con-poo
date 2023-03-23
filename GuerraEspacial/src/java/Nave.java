/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public abstract class Nave {
    private String tipo;
    private int capacidadPersonas;
    private double consumoCombustible;

    public Nave(String tipo, int capacidadPersonas, double consumoCombustible) {
        this.tipo = tipo;
        this.capacidadPersonas = capacidadPersonas;
        this.consumoCombustible = consumoCombustible;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public abstract double calcularCombustibleNecesario(double parsecs);
}
