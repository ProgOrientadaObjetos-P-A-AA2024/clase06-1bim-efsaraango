/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Det-Pc
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Computador> compus = new ArrayList<>();

        int numCompus;
        String marcaCompu;
        String marcaProcesador;
        String marcaMemoria;
        double costoProcedor;
        double costoMemoria;

        System.out.println("Ingrese el numero de Computadoras a Comprar: ");
        numCompus = entrada.nextInt();

        System.out.println("--------------------------------------");

        entrada.nextLine();

        for (int i = 0; i < numCompus; i++) {
            System.out.println("Ingrese Marca del Computador: ");
            marcaCompu = entrada.nextLine();
            System.out.println("Ingrese Marca del Procesador: ");
            marcaProcesador = entrada.nextLine();
            System.out.println("Ingrese costo del Procesador");
            costoProcedor = entrada.nextDouble();

            entrada.nextLine();
            Procesador pro1 = new Procesador(marcaProcesador, costoProcedor);

            System.out.println("Ingrese Marca de la Memoria: ");
            marcaMemoria = entrada.nextLine();
            System.out.println("Ingrese costo de la Memoria: ");
            costoMemoria = entrada.nextDouble();

            Memoria memori1 = new Memoria(marcaMemoria, costoMemoria);

            Computador compu1 = new Computador(marcaCompu, pro1, memori1);
            compu1.obtenerCostoComputador();
            compus.add(compu1);
            entrada.nextLine();

        }
        Venta ven1 = new Venta();
        ven1.establecerComputadoras(compus);
        ven1.establecerValorVente();

        System.out.printf("%s\n", ven1);

    }
}
