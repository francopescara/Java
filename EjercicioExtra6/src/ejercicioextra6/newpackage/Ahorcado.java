/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6.newpackage;

/**
 *
 * @author franco
 */
public class Ahorcado {
    private char[] palabra;
    private int encontradas;
    private int jugadaMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int encontradas, int jugadaMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadaMax = jugadaMax;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadaMax() {
        return jugadaMax;
    }

    public void setJugadaMax(int jugadaMax) {
        this.jugadaMax = jugadaMax;
    }

    
    
}
