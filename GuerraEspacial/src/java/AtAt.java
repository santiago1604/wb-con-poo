/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class AtAt extends Nave {
    public AtAt(int capacidadPersonas, double consumoCombustible) {
        super("AT-AT", capacidadPersonas, consumoCombustible);
    }

    @Override
    public double calcularCombustibleNecesario(double parsecs) {
        double consumoCombustible = getConsumoCombustible() * 0.75;
        return consumoCombustible * parsecs;
    }
}
