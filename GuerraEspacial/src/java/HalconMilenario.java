/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class HalconMilenario extends Nave {
    public HalconMilenario(int capacidadPersonas, double consumoCombustible) {
        super("Halcón Milenario", capacidadPersonas, consumoCombustible);
    }

    @Override
    public double calcularCombustibleNecesario(double parsecs) {
        return getConsumoCombustible() * parsecs;
    }
}