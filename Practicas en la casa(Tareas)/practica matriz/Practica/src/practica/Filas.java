/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;
import java.util.Scanner;
/**
 *
 * @author profe
 */
public class Filas {
    


    private int[][]Filas_C=new int[2][5];
    private Scanner teclado=new Scanner(System.in);
    public  void Columnas()
    {
        for(int i=0;i<5;i++)
        {
        for(int j=0;j<2;j++)
        {
            System.out.println("Digite el valor de las columnas "+i);
            Filas_C[j][i]=teclado.nextInt();
        }
            
        }
        
    }
    public  void Imprimir()
    {
        for(int i=0;i<2;i++)
        {
        for(int j=0;j<5;j++)
        {
        System.out.print(Filas_C[i][j]+" ");
        }
        System.out.println();
        }
    }
}



