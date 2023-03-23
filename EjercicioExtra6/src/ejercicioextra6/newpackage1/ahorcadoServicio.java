/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6.newpackage1;

import ejercicioextra6.newpackage.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class ahorcadoServicio {

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.*/
    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        Ahorcado r = new Ahorcado();
        System.out.println("ingrese la palabra");
        String palabra = leer.next();
        r.setPalabra(palabra.toCharArray());
        System.out.println("ingrese la cantidad de jugadas maximas");
        r.setJugadaMax(leer.nextInt());

        System.out.println(Arrays.toString(r.getPalabra()));
        r.setEncontradas(0);

        return r;

    }

    /* Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.*/
    public void longitud(Ahorcado r) {
        System.out.println(r.getPalabra().length);

    }

    /*Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    public void buscar(Ahorcado r) {
        System.out.println("ingrese una letra");
        String letra = leer.next();
        boolean flag = false;
        for (int i = 0; i < r.getPalabra().length; i++) {

            if (r.getPalabra()[i] == letra.charAt(0)) {
                flag = true;
                break;

            }

        }
        if (flag == true) {
            System.out.println("se encontro");
        } else {
            System.out.println("no se encontro");
        }
    }

    /*Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontradas(Ahorcado r) {
        System.out.println("ingrese una letra");
        String letra = leer.next();
        char l = letra.charAt(0);
        int capturada = 0;
        int faltantes;
        boolean estaba = false;

        for (int i = 0; i < r.getPalabra().length; i++) {
            if (r.getPalabra()[i] == letra.charAt(0)) {
                estaba=true;
               capturada++;
                  
            } else {
                
            }

        }
            
        /*for (int i = 0; i < r.getPalabra().length; i++) {
            if (r.getPalabra()[i] == letra.charAt(0)) {
                estaba = true;
                break;
            } else {
                estaba = false;
            }
        }*/
        
        faltantes = r.getPalabra().length - capturada;
        System.out.println("encontrada: " + capturada);
        System.out.println("falta encontrar: " + faltantes);
        return estaba;
    }

    /*Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public void intentos(Ahorcado r) {

        if (encontradas(r) == false) {
            r.setJugadaMax(r.getJugadaMax() - 1);
        }

        System.out.println("");
        System.out.println("Número de oportunidades restantes: " + r.getJugadaMax());
    }
    //Método juego(): el método juego se encargará de llamar todos los métodos
    //previamente mencionados e informará cuando el usuario descubra toda la palabra o
    //se quede sin intentos. Este método se llamará en el main.
    /*public void juego(Ahorcado r){
        crearJuego();
        longitud(r);
        while(r.getJugadaMax()>0||r.getEncontradas()!=r.getPalabra().length){
            intentos(r);
        }
        System.out.println(r.getJugadaMax());
        System.out.println(r.getEncontradas())*/
    
     
}