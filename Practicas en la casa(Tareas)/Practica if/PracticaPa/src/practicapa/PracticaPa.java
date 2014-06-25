/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicapa;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PracticaPa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int X;
        int y;
        double N;
        double M;
        boolean validar = true;
        int opcion;
        char continuar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se le solicitaran 4 numeros con los cuales podras hacer operaciones");
        System.out.println("Digite 1°  numero");
        X = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite 2° numero");
        y = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un 3° Numero");
        N= Integer.parseInt(teclado.nextLine());
        System.out.println("Digite un 4° Numero");
        M = Integer.parseInt(teclado.nextLine());
        
        do{
            System.out.println("Cual operacion quiere hacer\n");
            System.out.println("1.sumarlos ");
            System.out.println("2.Restarlos ");
            System.out.println("Multiplicarlos ");
            System.out.println("Dividirlos");
            opcion=Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1:{
                    System.out.println("La suma es"+(X+y+N+M));
                    break;
                }
                case 2:{
                    System.out.println("La resta es"+(X-y-N-M));
                    break;
                }
                case 3:{
                    System.out.println("La multiplicaciones"+(X*y*N*M));
                    break;
                }
                case 4:{
                    System.out.println("La Division es "+(X/y/N/M));
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
