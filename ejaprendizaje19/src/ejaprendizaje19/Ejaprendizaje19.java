/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaprendizaje19;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Ejaprendizaje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese numeros a cargar en la matriz");
                matriz[i][j] = leer.nextInt();
            }

        }
        comprobar(matriz);
        mostrar(matriz);
    }

    public static void comprobar(int[][] matriz) {
        boolean log = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    log = true;
                }
            }
        }
        if (log) {
            System.out.println("la matriz no es simetrica");
        } else {
            System.out.println("la matriz es simetrica");
        }
    }

    public static void mostrar(int[][] matriz) {
        System.out.println("matriz cargada");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
