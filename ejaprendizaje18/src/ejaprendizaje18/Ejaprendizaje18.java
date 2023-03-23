/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package ejaprendizaje18;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz =new int [4][4];
        for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            int  aleatorio=(int)((Math.random()*10)+1);
            matriz[i][j]=aleatorio;
       }          
    }
        System.out.println("la matriz es");
        for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            System.out.print( "["+matriz[i][j]+"]");
        }
            System.out.println("");
}   
       int auxiliar;
       for(int i=0;i<4;i++){
           for(int j=0;j<i;j++){
               auxiliar=matriz [i][j];
               matriz[i][j]=matriz[j][i];
               matriz [j][i]=auxiliar;
           }
       }
        System.out.println("la matriz transpuesta");
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               System.out.print("["+matriz[i][j]+"]");
               }
           System.out.println("");
           }
}
        
        
 }