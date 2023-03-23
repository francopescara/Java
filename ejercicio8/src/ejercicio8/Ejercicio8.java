/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("ingrese un numero");
        nota = leer.nextInt();
        while(nota < 0 || nota >10){
            System.out.println("nota incorrecta");
            nota = leer.nextInt();
        }
        System.out.println("nota correcta");
    }
    
}
