/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class LanzaderaImperial extends Nave {
    public LanzaderaImperial(int capacidadPersonas, double consumoCombustible) {
        super("Lanzadera Imperial", capacidadPersonas, consumoCombustible);
    }

    @Override
    public double calcularCombustibleNecesario(double parsecs) {
        return getConsumoCombustible() * parsecs;
    }
}