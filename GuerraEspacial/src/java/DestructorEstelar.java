/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class DestructorEstelar extends Nave {
    public DestructorEstelar(int capacidadPersonas, double consumoCombustible) {
        super("Destructor Estelar", capacidadPersonas, consumoCombustible);
    }

    @Override
    public double calcularCombustibleNecesario(double parsecs) {
        return getConsumoCombustible() * parsecs;
    }
}
