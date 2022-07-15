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

    public Sucursal() {
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        this.instrumentos.add(instrumento);
    }

    public void listarInstrumentos() {

    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoDeInstrumento tipoDeInstrumento) {
        return null;
    }

    public Instrumento borrarInstrumento(String ID) {
        return null;
    }

    public double[] porcentajeInstrumentosPorTipo() {
        return null;
    }

    public void porcentajeAbsoluto(double[] porcentajes) {

    }

    public Instrumento buscarInstrumento(){
    return null;
    }
    
    public String getnombre() {
        return this.nombre;
    }
    
    

}
