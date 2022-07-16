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

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public void listarInstrumentos() {
        for (Sucursal sucural  : sucursales) {
            sucural.listarInstrumentos();
        }
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

    public Sucursal buscarSucursal(String nombre) {
        return null;
    }

}
