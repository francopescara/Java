/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6;

import ejercicioextra6.newpackage.Ahorcado;
import ejercicioextra6.newpackage1.ahorcadoServicio;

/**
 *
 * @author franco
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ahorcadoServicio o=new ahorcadoServicio();
        Ahorcado r=o.crearJuego();
        o.longitud(r);
        o.buscar(r);
        o.encontradas(r);
        o.intentos(r);
        
    }
    
}
