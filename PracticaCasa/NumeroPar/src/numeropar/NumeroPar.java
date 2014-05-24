/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numeropar;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A;
        char continuar;
        boolean validar = true;
        Scanner teclado = new Scanner(System.in);
        do{
        System.out. println("Digite un Numero Entero");
        A=Integer.parseInt(teclado.nextLine());
        if(A%2==0){
           System.out.println("El numero es Par");
        }else{
            System.out.println("El numero es Impar ");
        }
        System.out.println("Desea continuar con otra operacion S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 's') || (continuar == 'S')) {
                validar = true;
            }
            if ((continuar == 'N') || (continuar == 'n')) {
                validar = false;
            }
    }while(validar);
        }
}
