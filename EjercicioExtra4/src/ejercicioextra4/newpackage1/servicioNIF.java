/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4.newpackage1;

import ejercicioextra4.newpackage.NIF;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class servicioNIF {

    Scanner leer = new Scanner(System.in);

    /*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo*/
    public NIF crearNif() {
        NIF r = new NIF();
        System.out.println("ingresa su DNI");
        r.setDNI(leer.nextInt());

        int resto = (int) (r.getDNI() % 23);

        System.out.println(resto);

        String[] Arreglo = new String[23];
        Arreglo[0] = "T";
        Arreglo[1] = "R";
        Arreglo[2] = "W";
        Arreglo[3] = "A";
        Arreglo[4] = "G";
        Arreglo[5] = "M";
        Arreglo[6] = "Y";
        Arreglo[7] = "F";
        Arreglo[8] = "P";
        Arreglo[9] = "D";
        Arreglo[10] = "X";
        Arreglo[11] = "B";
        Arreglo[12] = "N";
        Arreglo[13] = "J";
        Arreglo[14] = "Z";
        Arreglo[15] = "S";
        Arreglo[16] = "Q";
        Arreglo[17] = "V";
        Arreglo[18] = "H";
        Arreglo[19] = "L";
        Arreglo[20] = "C";
        Arreglo[21] = "K";
        Arreglo[22] = "E";

        for (int i = 0; i < Arreglo.length; i++) {
            if (resto == i) {
                r.setLetra(Arreglo[i]);
            }
        }
        return r;

    }
     public void mostrar(NIF r) {
        System.out.println("Su NIF es " + r.getDNI() + "-" + r.getLetra());
    }
}
