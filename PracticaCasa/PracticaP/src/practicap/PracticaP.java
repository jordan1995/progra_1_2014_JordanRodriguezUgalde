/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PracticaP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        double A;
        char C;
        boolean validar = true;
        int opcion;
        char continuar;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Digite un numero");
        N=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un segundo numero");
        A=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite cualquier letra del teclado");
        C=teclado.nextLine().charAt(0);
        System.out.println("El Primer valor es "+N);
        System.out.println("El segundo valor es "+A);
        System.out.println("El tercer valor es "+C);
        System.out.println("Que accion quiere Realizar\n");
        
        do{
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.valor del Caracter");
            opcion=Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1:{
                    System.out.println("La suma es "+(N+A));
                    break;
                }
                case 2:{
                    System.out.println("La Resta es "+(A-N));
                    break;
                }
                case 3:{
                    System.out.println("El valor del caracter es "+C);
                    break;
                }
            }
            System.out.println("Desea continuar S/N");
      continuar =      teclado.nextLine().charAt(0);
            if((continuar=='s'||(continuar=='S')))
      validar= true;
            if((continuar=='n')||(continuar=='N'))
                validar=false;
        }while(validar);
    }
    
}
