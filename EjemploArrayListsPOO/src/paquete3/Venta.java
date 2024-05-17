/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta() {

    }

    public void establecerComputadoras(ArrayList<Computador> c) {
        computadoras = c;

    }

    public void establecerValorVente() {
        valorVenta = 0;

        for (Computador computadora : computadoras) {
            valorVenta = valorVenta + computadora.obtenerCostoComputador();
        }
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    public double obtenerValorVenta() {

        return valorVenta;
    }

    @Override

    public String toString() {
        String cadena = "\nDescripcion de venta";

        for (Computador computa : computadoras) {
            cadena = String.format("%s\n\n" 
                    + "Marca de la Computadora: %s\n"
                    + "Marca del Procesador: %s\n"
                    + "Marca de la Memoria: %s\n"
                    + "Costo del Procesador: %.2f\n"
                    + "Costo de la Memoria: %.2f\n"
                    + "Costo del Computador: %.2f\n",
                    cadena,
                    computa.obtenerMarca(),
                    computa.obtenerProcedor().obtenerMarca(),
                    computa.obtenerMemori().obtenerMarca(),
                    computa.obtenerProcedor().obtenerCosto(),
                    computa.obtenerMemori().obtenerCosto(),
                    computa.obtenerCostoComputador());
        }

        cadena = String.format("%s\nValor Total de la Venta: %.2f\n",
                cadena,
                obtenerValorVenta());

        return cadena;
    }
}
