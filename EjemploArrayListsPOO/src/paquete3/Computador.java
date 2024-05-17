/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public Computador(String mar, Procesador p, Memoria m) {
        marca = mar;
        procesador = p;
        memoria = m;
        establecerCostoComputador();
    }

    public void estableceMarca(String ma) {
        marca = ma;
    }

    public void estableceProcesador(Procesador p) {
        procesador = p;
    }

    public void estableceMemoria(Memoria m) {
        memoria = m;
    }

    public void establecerCostoComputador() {
        costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
    }

    public String obtenerMarca() {
        return marca;
    }

    public Procesador obtenerProcedor() {
        return procesador;
    }

    public Memoria obtenerMemori() {
        return memoria;
    }

    public double obtenerCostoComputador() {
        return costoComputador;
    }
}
