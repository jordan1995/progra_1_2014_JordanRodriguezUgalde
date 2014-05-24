/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjoect_ifs;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Prjoect_Ifs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int C;
        boolean validar = true;
        int opcion;
        char continuar;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el numero a Evaluar");
        C = Integer.parseInt(teclado.nextLine());

        do {
            System.out.println("1.Negativo o Positivo");
            System.out.println("2.Es multiplo de 5");
            System.out.println("3.Es multiplo de 10");
            System.out.println("4.Es mayor o manor que 100");
            System.out.println("5.Es Par o Impar");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    if (C < 0) {
                        System.out.println("El numero es Negativo");
                    } else {
                        System.out.println("El numero es Positivo");
                        break;
                    }
                case 2: {
                    if (C % 5 == 0) {
                        System.out.println("El numero es multiplo de 5");
                    }
                    break;
                }
                case 3: {
                    if (C % 10 == 0) {
                        System.out.println("El numero es Multiplo de 10");
                    }
                    break;
                }
                case 4: {
                    if (C < 100) {
                        System.out.println("El numero es menor de 100");
                    } else {
                        System.out.println("El numero es Mayor de 100");
                    }
                    break;
                }
                case 5: {
                    if (C % 2 == 0) {
                        System.out.println("El numero es Par");
                    } else {
                        System.out.println("El  numero es Impar");
                    }
                    break;
                }

            }
            System.out.println("Desea continuar S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 's' || (continuar == 'S'))) {
                validar = true;
            }
            if ((continuar == 'n') || (continuar == 'N')) {
                validar = false;
            }
        } while (validar);

    }

}
