/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclostest;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class CiclosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * ciclo for
         */
        int cantidad;
        int suma = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el numero de impreciones que desea ver");
        cantidad = Integer.parseInt(teclado.nextLine());

        System.out.print("\n");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(i);
        }
        System.out.print("\n");
        System.out.println("Inverso");
        System.out.print("\n");
        for (int i = cantidad - 1; i > -1; i--) {
            System.out.println(i);
        }
        /**
         * ciclo while
         */
        while (suma <= cantidad) {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma + 1;

        }
        System.out.print("\n");
        suma = cantidad;
        while (suma >= 0) {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma - 1;
        }
        System.out.print("\n");
        suma = 0;
        do {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma + 1;
        } while (suma < cantidad);
        System.out.print("\n");
        suma=cantidad;
        do{
            System.out.print(suma);
            System.out.print(" - ");
            suma=suma-1;
        }while(suma>0);
    }

}
