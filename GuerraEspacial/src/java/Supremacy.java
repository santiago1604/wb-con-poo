/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Supremacy extends Nave implements Transportable {
    private int cantidadNavesTransportables;

    public Supremacy(int capacidadPersonas, double consumoCombustible, int cantidadNavesTransportables) {
        super("Supremacy", capacidadPersonas, consumoCombustible);
        this.cantidadNavesTransportables = cantidadNavesTransportables;
    }

    @Override
    public double calcularCombustibleNecesario
(double parsecs) {
    double consumoCombustible = getConsumoCombustible() * (1 + 0.1 * cantidadNavesTransportables);
    return consumoCombustible * parsecs;
}

@Override
public int getCantidadNavesTransportables() {
    return cantidadNavesTransportables;
}
}
