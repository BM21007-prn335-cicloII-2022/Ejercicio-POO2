/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio.pkg2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Angel
 */
public class Sucursal {

   private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal() {
    }

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }

    public ArrayList instrumentosPorTipo(TipoDeInstrumento instrumento) {
        ArrayList<Instrumento> instrumentosPorTipo = new ArrayList<>();

        for (Instrumento a : instrumentos) {
            if (a.getTipoDeInstrumento().equals(instrumento)) {
                instrumentosPorTipo.add(a);
            }
        }

        return instrumentosPorTipo;
    }

    public void borrarInstrumento(String ID) {
        Iterator<Instrumento> iterador = instrumentos.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().getID().equals(ID)) {
                iterador.remove();
            }
        }

    }

    public double[] porcentajeInstrumentosPorTipo() {
        final int CANT_INSTRUMENTOS = TipoDeInstrumento.values().length;
        double[] porcentajes = new double[CANT_INSTRUMENTOS];
        for (Instrumento instrumento : instrumentos) {
            porcentajes[instrumento.getTipoDeInstrumento().ordinal()]++;
        }
        absolutoAPorcentaje(porcentajes);
        return porcentajes;
    }

    private void absolutoAPorcentaje(double[] porcentajes) {
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = (porcentajes[i] * 100) / instrumentos.size();
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + '}';
    }

}
