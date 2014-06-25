/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matrices {
    private int[][]Arreglo=new int[4][4];
    private int[][]Arreglo2=new int[4][4];
    private int[][]Resultado=new int[4][4];
    
    public  void Main()
    {
        Scanner dato = new Scanner (System.in);
         
         System.out.println("Datos de la Matriz A :");
         
         for (int i=0; i<4; i++){
             for (int j=0; j<4; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 Arreglo [i][j]= dato.nextInt();
                }
            }
            
            System.out.println("Datos de la Matriz B :");
            
            for (int i=0; i<4; i++){
             for ( int j=0; j<4; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 Arreglo2 [i][j]= dato.nextInt();
                }
            }
            
            for (int i=0; i<4; i++){
             for (int j=0; j<4; j++){
                 Resultado [i][j]= Arreglo[i][j]+Arreglo2[i][j];
                }
            }
            
            System.out.println("Matriz resultante de la suma :");
    for (int i=0;i<4;i++){
            for (int j=0;j<4;j++) {
                System.out.print(Resultado[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
}
  
        
        
    
