/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2.newpackage1;

import ejercicioextra2.newpackage.Puntos;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class ServicioPuntos {
    Scanner leer=new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos r=new Puntos();
        System.out.println("ingrese numero para el punto x");
        r.setX1(leer.nextInt());
        System.out.println("igrese numero apra el segundo punto x");
        r.setX2(leer.nextInt());
        System.out.println("ingrese numero para el punto y");
        r.setY1(leer.nextInt());
        System.out.println("ingrese numero para el segundo punto y");
        r.setY2(leer.nextInt());
        
        return r;
    }
    public void calcularDistancia(Puntos r){
      double calcular=  Math.pow(r.getX2(), 2)-Math.pow(r.getX1(), 2)+Math.pow(r.getY2(), 2)-Math.pow(r.getY1(), 2);
      double raiz=Math.sqrt(calcular);
        System.out.println(calcular);
        System.out.println(raiz);
    }
}
