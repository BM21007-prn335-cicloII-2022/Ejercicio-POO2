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
public class Fabrica {

    private String nombre;
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public void listarInstrumentos() {
        for (Sucursal sucursal : sucursales) {
            sucursal.listarInstrumentos();
        }
    }

    public ArrayList instrumentosPorTipo(TipoDeInstrumento instrumento) {
        ArrayList<Instrumento> instrumentosPorTipo = new ArrayList<>();
        ArrayList<Instrumento> instrumentosPorTipoRecibidos;

        for (Sucursal sucursal : sucursales) {
            instrumentosPorTipoRecibidos = sucursal.instrumentosPorTipo(instrumento);
            for (Instrumento x : instrumentosPorTipoRecibidos) {
                instrumentosPorTipo.add(x);
            }
        }

        return instrumentosPorTipo;

    }

    public void borrarInstrumento(String ID) {
        for (Sucursal sucursal : sucursales) {
            sucursal.borrarInstrumento(ID);
        }
    }

    public double[] porcentajeInstrumentosPorTipo(String nombre) {
        double[] porcentajes = new double[TipoDeInstrumento.values().length];
        Sucursal sucursalEncontrada = buscarSucursal(nombre);
        if (sucursalEncontrada != null) {
            porcentajes = sucursalEncontrada.porcentajeInstrumentosPorTipo();
        }

        return porcentajes;
    }

    public Sucursal buscarSucursal(String nombre) {
        Sucursal sucursalEncontrada = new Sucursal();
        int posicion = 0;

        while (posicion < sucursales.size() && !this.sucursales.get(posicion).getNombre().equals(nombre)) {
            posicion++;
        }

        if (posicion < sucursales.size()) {
            sucursalEncontrada = this.sucursales.get(posicion);
        }

        return sucursalEncontrada;
    }

}
