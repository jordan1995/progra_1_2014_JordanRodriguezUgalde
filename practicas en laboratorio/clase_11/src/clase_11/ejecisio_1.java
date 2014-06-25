/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_11;


import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ejecisio_1 {
    
   private int [][]matriz;
   private Scanner teclado;
   public void cargar_Matrix()
   {
       teclado= new Scanner(System.in);
       matriz= new int[3][5];
       for(int i=0;i<3;i++)
       {
          for(int j=0;j<5;j++)
          {
              System.out.println("Ingrese el numero correspodiente");
              matriz[i][j]= teclado.nextInt();
          }
           
       }
       
   }
   public void Imprimir()
   {
       for(int i=0;i<3;i++)
       {
           for(int j=0;5<j;j++)
           {
               System.out.print(matriz[i][j]+" ");
               
           }
           System.out.println();
           
       }
       
   }
}
