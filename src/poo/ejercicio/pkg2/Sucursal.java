/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Sucursal {

    private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        this.instrumentos.add(instrumento);
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoDeInstrumento tipoDeInstrumento) {
        ArrayList<Instrumento> instrumentosPorTipo = new ArrayList<>();
        for (Instrumento instrumento : instrumentos) {
            if (instrumento.getTipoDeInstrumento().equals(tipoDeInstrumento)) {
                instrumentosPorTipo.add(instrumento);
            }
        }
        
        return instrumentosPorTipo;
    }

    public Instrumento borrarInstrumento(String ID) {
        return null;
    }

    public double[] porcentajeInstrumentosPorTipo() {
        return null;
    }

    public void porcentajeAbsoluto(double[] porcentajes) {

    }

//    public Instrumento buscarInstrumento() {
//        return null;
//    }

    public String getnombre() {
        return this.nombre;
    }

}
