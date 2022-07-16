/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.ejercicio.pkg2;

/**
 *
 * @author Angel
 */
public class POOEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Fabrica
        Fabrica fabrica1 = new Fabrica();

        //Sucursales 
        Sucursal sucursal1 = new Sucursal("SucursalA");
        Sucursal sucursal2 = new Sucursal("SucurdalB");
        Sucursal sucursal3 = new Sucursal("SucurdalC");
        Sucursal sucursal4 = new Sucursal("SucurdalD");
        
        //Agregando las sucursales a la fabrica
        fabrica1.agregarSucursal(sucursal1);
        fabrica1.agregarSucursal(sucursal2);
        fabrica1.agregarSucursal(sucursal3);
        fabrica1.agregarSucursal(sucursal4);

        //Instrumentos sucursal 1
        Instrumento instrumento1 = new Instrumento("001", 100, TipoDeInstrumento.VIENTO);
        Instrumento instrumento2 = new Instrumento("002", 200, TipoDeInstrumento.CUERDA);
        Instrumento instrumento3 = new Instrumento("003", 140, TipoDeInstrumento.PERCUSION);
        Instrumento instrumento4 = new Instrumento("004", 345, TipoDeInstrumento.VIENTO);
        Instrumento instrumento5 = new Instrumento("005", 123, TipoDeInstrumento.CUERDA);
        Instrumento instrumento6 = new Instrumento("006", 100, TipoDeInstrumento.PERCUSION);

        //Instrumentos sucursal 2
        Instrumento instrumento11 = new Instrumento("007", 200, TipoDeInstrumento.CUERDA);
        Instrumento instrumento12 = new Instrumento("008", 140, TipoDeInstrumento.PERCUSION);
        Instrumento instrumento13 = new Instrumento("009", 345, TipoDeInstrumento.VIENTO);
        Instrumento instrumento14 = new Instrumento("010", 123, TipoDeInstrumento.CUERDA);

        //Agregando los instrumentos a las respectivas sucursales
        sucursal1.agregarInstrumento(instrumento1);
        sucursal1.agregarInstrumento(instrumento2);
        sucursal1.agregarInstrumento(instrumento3);
        sucursal1.agregarInstrumento(instrumento4);
        sucursal1.agregarInstrumento(instrumento5);
        sucursal1.agregarInstrumento(instrumento6);
        
        //Agregando los instrumentos a las respectivas sucursales
        sucursal2.agregarInstrumento(instrumento11);
        sucursal2.agregarInstrumento(instrumento12);
        sucursal2.agregarInstrumento(instrumento13);
        sucursal2.agregarInstrumento(instrumento14);
        
        
        fabrica1.listarInstrumentos();
        
        for (Object x : fabrica1.instrumentosPorTipo(TipoDeInstrumento.VIENTO)) {
            System.out.println(x);
        }
        
        fabrica1.borrarInstrumento("010");
        System.out.println("--------------------------------------------------");
        fabrica1.listarInstrumentos();

        for (int i = 0; i < fabrica1.porcentajeInstrumentosPorTipo("SucuralA").length; i++) {
            System.out.println(fabrica1.porcentajeInstrumentosPorTipo("SucuralA")[i]);
        }
    }
    
}
