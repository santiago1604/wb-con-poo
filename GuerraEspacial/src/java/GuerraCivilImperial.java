/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class GuerraCivilImperial {
    private List<Nave> naves;
    private double parsecsEstimados;

    public GuerraCivilImperial(double parsecsEstimados) {
        this.parsecsEstimados = parsecsEstimados;
        naves = new ArrayList<>();
    }

    public void agregarNave(Nave nave) {
        naves.add(nave);
    }

    public double calcularCombustibleTotal() {
        double combustibleTotal = 0;
        for (Nave nave : naves) {
            if (nave instanceof Transportable) {
                combustibleTotal += nave.calcularCombustibleNecesario(parsecsEstimados) +
                        ((Transportable) nave).getCantidadNavesTransportables() *
                        nave.getConsumoCombustible() * 0.1 * parsecsEstimados;
            } else {
                combustibleTotal += nave.calcularCombustibleNecesario(parsecsEstimados);
            }
        }
        return combustibleTotal;
    }
}
