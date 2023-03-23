/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1.newpackage1;

import ejercicioextra1.newpackage.Cancion;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Cancionservicio {
    Scanner leer=new Scanner(System.in);
    public Cancion tituloAutor(){
        Cancion r=new Cancion();
        System.out.println("ingrese el titulo de la cancion");
        r.setTitulo(leer.next());
        System.out.println("ingrese el nombre del autor");
        r.setAutor(leer.next());
        return r;
    }
}
