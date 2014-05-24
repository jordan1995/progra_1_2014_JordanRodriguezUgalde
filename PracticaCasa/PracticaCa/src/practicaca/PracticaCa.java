/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaca;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PracticaCa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A;
        int opcion;
        boolean validar=true;
        char continuar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero");
        A=Integer.parseInt(teclado.nextLine());
        do{
            System.out.println("Digite la opcion que quiera realizar\n");
             System.out.println("1.Incrementar el numero en 77");
              System.out.println("2.Decrementar el numero en 3 ");
               System.out.println("3.Duplicar numero");
               opcion=Integer.parseInt(teclado.nextLine());
               switch(opcion){
                   case 1:{
                        System.out.println("El Resultado es "+(A+77));
                        break;
                   }
                   case 2:{
                        System.out.println("El resultado es "+(A-3));
                        break;
                   }
                   case 3:{
                        System.out.println("El resultado es "+(A*2));
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
