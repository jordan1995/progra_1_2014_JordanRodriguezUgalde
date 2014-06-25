/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Class5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = true;
        int opcion;
        
        char continuar;
        
        Scanner teclado = new Scanner(System.in);
         
        
        do{
          
            System.out.println("1.Enero");
            System.out.println("2.Febrero");
            System.out.println("3.Marzo");
            System.out.println("4.Abril");
            System.out.println("5.Mayo");
            System.out.println("6.Junio");
            System.out.println("7.Julio");
            System.out.println("8.Agosto");
            System.out.println("9.Setiembre");
            System.out.println("10.Octubre");
            System.out.println("11.Nobiembre");
            System.out.println("12.Diciembre\n");
            System.out.println("Digite el Mes que desee \n");
            opcion = Integer.parseInt(teclado.nextLine());
             ClsMeses c = new ClsMeses(opcion);
        
            switch(opcion)
            {
                case 1:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 2:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 3:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 4:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 5:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 6:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 7:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 8:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 9:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 10:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 11:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
                case 12:{
                    System.out.println("El mes que eligio es "+c.meses(opcion));
                    break;
                }
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
