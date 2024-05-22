/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import paquete1.Calificacion;

/**
 *
 * @author Det-Pc
 */
public class ArchivoEscritura {
    private String nombreArchivo;
    private String rutaArchivo;
    private Empresa registro;
    private Formatter salidaArchivo;
    
    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo); // "data/profesores2.txt"
                        // ""
    }
    
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public void establecerRegistro(Empresa n) {
        registro = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Empresa obtenerRegistro() {
        return registro;
    }

    // agrega registros al archivo
    public void establecerSalida() {
        try {
            salidaArchivo = new Formatter(new FileWriter(rutaArchivo, true));
            Empresa p = obtenerRegistro();
            String cadenaRegistro = String.format("%s;%s",
                    p.obtenerNombre(), p.obtenerCiudad()
                   
                    );
            salidaArchivo.format("%s\n", cadenaRegistro);
            salidaArchivo.close();
        } catch (IOException e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }

    }

    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        } // cierra el archivo

    }
    
}
