/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Promedios {
    
    

    private Scanner teclado;
    private int[] curso_A;
    private int[] curso_B;
    private int[] vecto_Suma;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        curso_A=new int[5];
        curso_B=new int[5];
        System.out.println("Carga de notas del curso A");
        for(int i=0;i<5;i++) {
            System.out.print("Ingrese nota:");
            curso_A[i]=teclado.nextInt();
        }
        System.out.println("Carga del notas del curso B");
        for(int i=0;i<5;i++) {
            System.out.print("Ingrese nota:");
            curso_B[i]=teclado.nextInt();
        }        
    }    
    
    public void calcularPromedios() {
        int suma1=0;
        int suma2=0;
        for(int i=0;i<5;i++) {
            suma1=suma1+curso_A[i];
            suma2=suma2+curso_B[i];            
        }
        int promedio_A=suma1/5;
        int promedio_B=suma2/5;
        if (promedio_A>promedio_B) {
            System.out.println("El curso A tiene un promedio mayor.");
        } else {
            System.out.println("El curso B tiene un promedio mayor.");
        }
    }
    
}
