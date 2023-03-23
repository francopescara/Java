/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejaprendizaje20;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Ejaprendizaje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese numeros del 1 al 9");
                matriz[i][j] = num = leer.nextInt();

                while (num > 9) {
                    System.out.println("dato incorrecto ingrese nuevamente");
                    num = leer.nextInt();

                }

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        sumafilas(matriz);
        sumacolunmas(matriz);
        sumadiagonales(matriz);
    }

    public static void sumafilas(int[][] matriz) {
        int sf1, sf2, sf3;
        sf1 = 0;
        sf2 = 0;
        sf3 = 0;
        for (int i = 0; i < 3; i++) {
            sf1 = sf1 + matriz[0][i];
            sf2 = sf2 + matriz[1][i];
            sf3 = sf3 + matriz[2][i];

        }
        System.out.println("la suma de la primera fila es : " + sf1);
        System.out.println("la suma de la segunda fila es : " + sf2);
        System.out.println("la suma de la tercera fila es : " + sf3);
    }

    public static void sumacolunmas(int[][] matriz) {
        int sc1, sc2, sc3;
        sc1 = 0;
        sc2 = 0;
        sc3 = 0;
        for (int j = 0; j < 3; j++) {
            sc1 = sc1 + matriz[j][0];
            sc2 = sc2 + matriz[j][1];
            sc3 = sc3 + matriz[j][2];

        }
        System.out.println("la suma de la primera colunma es : " + sc1);
        System.out.println("la suma de la segunda colunma es : " + sc2);
        System.out.println("la suma de la tercera colunma es : " + sc3);
    }

    public static void sumadiagonales(int[][] matriz) {
        int sd1 = 0;
        int sd2 = 0;

        for (int i = 0; i < 3; i++) {
            sd1 = sd1 + matriz[i][i];
        }

        for (int j = 0; j < 3; j++) {
            sd1 = sd1 + matriz[j][j];

        }
        System.out.println("la suma de la diagonal es : " + sd1);
        System.out.println("la suma de la diagonal inversa es : " + sd2);
    }
}
