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
public class ejercicio_3 {
    
  private int [][]matriz;
   private Scanner teclado;
   public void cargar_Matrix()
   {
       teclado= new Scanner(System.in);
       matriz= new int[3][4];
       for(int i=0;i<3;i++)
       {
          for(int j=0;j<4;j++)
          {
              System.out.println("Ingrese el numero correspodiente");
              matriz[i][j]= teclado.nextInt();
          }
           
       }
       
   }
   public void Primera_Fila()
   {
       System.out.println("Primera fila de la matriz");
       for(int i=0;i<4;i++)
       {
           System.out.println(matriz[0][i]+" ");
   }
   }
   public void Imprimir_ultima_fila()
   {
       System.out.println("\nUltima fila");
       for(int i=0;i<4;i++)
       {
          System.out.println(matriz[2][i]+" ");
           
       }
   }
   public  void Primer_columna()
   {
     System.out.println("\nPrimer columna de la Matriz fila");
       for(int i=0;i<3;i++)
       {
          System.out.println(matriz[i][0]+" ");
           
       }  
       
   }
   public  void Ultima_columna()
   {
     System.out.println("\nUltima columna de la Matriz fila");
       for(int i=0;i<3;i++)
       {
          System.out.println(matriz[i][3]+" ");
           
       }  
       
   }
}
