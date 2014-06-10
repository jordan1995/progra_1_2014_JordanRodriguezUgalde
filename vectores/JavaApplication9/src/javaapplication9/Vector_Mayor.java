/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication9;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Vector_Mayor {
   private Scanner teclado;
    private int[] Vector;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        Vector=new int[10];
        for(int i=0;i<10;i++) {
            System.out.print("Ingrese elemento:");
            Vector[i]=teclado.nextInt();
        }
    }
    
    public void verificarOrdenado() {
        int orden=1;
        for(int i=0;i<9;i++) {
            if (Vector[i+1]<Vector[i]) {
                orden=0;
            }
        }
        if (orden==1) {
            System.out.println("Esta ordenado de menor a mayor");
        } else {
            System.out.println("No esta ordenado de menor a mayor");
        }
    }
}
