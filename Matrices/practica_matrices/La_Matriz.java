/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_matrices;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class La_Matriz {
   private Scanner Leer = new Scanner(System.in);
    private int columna,Fila;
    private int[][]matris;
 
 public   void llenar ()
          
    {
        System.out.println("Digite las columnas");
        columna=Leer.nextInt();
        System.out.println("Digite las filas");
        Fila=Leer.nextInt();
        matris=new int[Fila][columna];
    for (int i = 0 ; i < Fila ; i++)
    {
        for (int j = 0 ; j < columna ; j++)
        {
        System.out.print ("Inserte pos[" + i + "][" + j + "]: ");
        matris [i] [j] = Leer.nextInt();
        }
    }
    }
    public void mostrar ()
    {
    for (int i = 0 ; i < Fila ; i++)
    {
        System.out.println ();
        for (int j = 0 ; j < columna ; j++)
        {
        System.out.print ("[" + matris [i] [j] + "]");
        }
        System.out.println();
    }
    }
  public  void intercambiar()
    {
        for(int i=0;i<matris[0].length;i++) {
            int aux=matris[0][i];
            matris[0][i]=matris[1][i];
            matris[1][i]=aux;
        }
    }
    
    public void imprimir() {
        for(int f=0;f<matris.length;f++) {
            for(int c=0;c<matris[f].length;c++) {
                System.out.print("["+matris[f][c]+"]");
            }
            System.out.println();
        }
    } 
    
}
