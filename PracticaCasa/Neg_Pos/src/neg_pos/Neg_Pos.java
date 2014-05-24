/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neg_pos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Neg_Pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int B;
        boolean validar = true;
        char continuar;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite un numero Entero");
            B = Integer.parseInt(teclado.nextLine());
            if (B < 0) {
                System.out.println("El numero es Negativo");
            } else {
                System.out.println("El numero es Positivo");
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
