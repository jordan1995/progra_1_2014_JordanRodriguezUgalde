/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicacasa;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PracticaCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A;
        int B;
        int C;
        int D;
        boolean validar = true;
        int opcion;
        char continuar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el Primer Digito A");
        A= Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el segundo Digito B");
        B= Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el Tercer Digito C");
        C= Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el Cuarto Digito D");
        D= Integer.parseInt(teclado.nextLine());
        tomaValores toma= new tomaValores(A, B, C, D);
        do{
            System.out.println("1.Igualar B a C");
            System.out.println("2.Igualar C a A");
            System.out.println("3.Igualar A a D");
            System.out.println("4.Igualar D a B");
            opcion=Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1:{
                    System.out.println("B Ahora es igual A "+toma.toma1(B, C));
                    break;
                }
                case 2:{
                    System.out.println("C Ahora es igual A "+toma.toma2(C, A));
                    break;
                }
                case 3:{
                    System.out.println("A Ahora es igual D "+toma.toma3(A, D));
                    break;
                }
                case 4:{
                    System.out.println("D Ahora es igual B "+toma.toma4(D, B));
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
