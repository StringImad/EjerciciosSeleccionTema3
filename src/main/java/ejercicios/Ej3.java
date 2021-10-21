/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author imad
 */
public class Ej3 {

    public static void main(String[] args) {
        final int NUM_TERMINOS = 25;
        int digitos = 15;
        int contador = 0;
        while (contador != NUM_TERMINOS) {
            System.out.print(digitos+" - ");
            digitos = digitos * 2;
            
            contador++;
        }
    }
}
