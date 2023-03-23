/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3.newpackage1;

import ejercicioextra3.newpackage.Raices;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class servicioRaices {

    Scanner leer = new Scanner(System.in);

    /* Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c */
    public Raices getDiscriminante() {
        Raices r = new Raices();
        System.out.println("ingrese valor de a");
        r.setA(leer.nextInt());
        System.out.println("ingrese valor de b");
        r.setB(leer.nextInt());
        System.out.println("ingrese valor de c");
        r.setC(leer.nextInt());
        double discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        System.out.println(discriminante);
        return r;
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices(Raices r) {
        double discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        boolean solucion;
        if (discriminante >= 0) {
            solucion = true;
            System.out.println("si tiene dos soluciones " + solucion);
        } else {
            System.out.println("no tiene dos solucioes " );
        }
        return true;
    }

    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0. */
    public boolean tieneRaiz(Raices r) {
        double discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        boolean raiz=discriminante == 0;
        
        return raiz;
    }

    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.*/
    public boolean obtenerRaices(Raices r) {

        if (tieneRaices(r) == true) {
            //(-b±√((b^2)-(4*a*c)))/(2*a)
            double sol = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
            double sol2 = Math.sqrt(sol);
            double sol3 = -r.getB() + sol2 / 2 * r.getA();
            double sol4 = -r.getB() - sol2 / 2 * r.getA();
            System.out.println(sol3);
            System.out.println(sol4);
        }
        return true;
    }

    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.*/
    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            //(-b±√(discri)/(2*a)
            double sol = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
            double sol2 = Math.sqrt(sol);
            double sol3 = -r.getB()/ (2 * r.getA());
            //System.out.println("*********");
            System.out.println("La unica solucion posible es ");
            System.out.println("La solucion es " + sol3);
        }
       

    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.*/
    public void calcular(Raices r) {
        tieneRaices(r);
        obtenerRaices(r);
        tieneRaiz(r);
        obtenerRaiz(r);
    }
}
/*public void calcular(Raices R1) {
        if (obtenerRaiz(R1) == 1) {
            if (tieneRaiz(R1) == true) {
                //(-b±√(discri)/(2*a)
                double sol = R1.getDiscri();
                double sol2 = Math.sqrt(sol);
                double sol3 = (-R1.getB() + sol2) / (2 * R1.getA());
                System.out.println("*********");
                System.out.println("La unica solucion posible es ");
                System.out.println("La solucion es " + sol3);
            }
        } else if (obtenerRaices(R1) == 2) {
            if (tieneRaices(R1) == true) {
                //(-b±√(discri)/(2*a)
                double sol = R1.getDiscri();
                double sol2 = Math.sqrt(sol);
                double sol3 = (-R1.getB() + sol2) / (2 * R1.getA());
                double sol4 = (-R1.getB() - sol2) / (2 * R1.getA());
                System.out.println("Contiene 2 soluciones ");
                System.out.println("1ra posible solucion es " + sol3);
                System.out.println("2da posible solucion es " + sol4);
            }
        } else {
            System.out.println("Su ecuacion no tiene solucion");
        }
    }*/