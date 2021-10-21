/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author imad
 */
public class Ej5 {

    public static void main(String[] args) {
        int numero = 1;

        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero < 11);
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }
}
