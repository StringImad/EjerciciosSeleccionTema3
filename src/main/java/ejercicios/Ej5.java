/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ej5 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
       int n, x;
        System.out.println("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
       do  {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }while (x <= n);
    }
}
