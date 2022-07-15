/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio.pkg2;

/**
 *
 * @author Angel
 */
public class Instrumento {
    private String ID;
    private double precio;
    private TipoDeInstrumento tipoDeInstrumento;

    public Instrumento(){}
    
    public Instrumento(String ID, double precio, TipoDeInstrumento tipoDeInstrumento) {
        this.ID = ID;
        this.precio = precio;
        this.tipoDeInstrumento = tipoDeInstrumento;
    }

    public String getID() {
        return ID;
    }

    public TipoDeInstrumento getTipoDeInstrumento() {
        return tipoDeInstrumento;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "ID=" + ID + ", precio=" + precio + ", tipoDeInstrumento=" + tipoDeInstrumento + '}';
    }
    
}
