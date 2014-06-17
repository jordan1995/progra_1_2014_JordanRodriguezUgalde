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
public class ejercisio_2 {
    private int [][]matriz;
   private Scanner teclado;
   public void cargar_Matrix()
   {
       teclado= new Scanner(System.in);
       matriz= new int[4][4];
       for(int i=0;i<4;i++)
       {
          for(int j=0;j<4;j++)
          {
              System.out.println("Ingrese el numero correspodiente");
              matriz[i][j]= teclado.nextInt();
          }
           
       }
       
   }
   public  void Imprimir_Diagonal()
   {
       for (int i=0;i<4;i++)
       {
       for (int j=0;j<4;j++)
       {
           if(i==j)
           {
           System.out.print(matriz[i][i]+"  ");
           }
           else
           {
             System.out.print("_"+" ");
           }
           }
       System.out.println();
           
           
       
   }
}
}