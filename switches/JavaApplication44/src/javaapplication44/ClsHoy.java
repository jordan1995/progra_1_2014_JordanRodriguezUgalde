/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication44;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClsHoy {
   private int Dia,x;
   private char dia1;
    Scanner teclado = new Scanner(System.in);
   public ClsHoy(){
       System.out.println("Ingrese dia 1(L,M,X,J,V,S,D)");
       dia1=teclado.nextLine().charAt(0);
   }
   public void menu(){
       switch(dia1){
           
           case 'L':case 'l':
           x=0;
               break;
           case 'M':case 'm':
               x=1;
               break;
           case 'X':case 'x':
               x=2;
               break;
           case 'J':case 'j':
               x=3;
               break;
           case 'V':case 'v':
               x=4;
               break;
           case 'S':case 's':
               x=5;
               break;
           case 'D':case 'd':
               x=6;
               break;
       }
       System.out.println("Ingrese el Numero de Dia actual");
       Dia=Integer.parseInt(teclado.nextLine());
       Dia=Dia+x;
       switch(Dia%7){
           case 0:
           System.out.println("Domingo");
           break;
           case 1:
               System.out.println("lunes");
               break;
           case 2:
               System.out.println("Martes");
               break;
           case 3:
               System.out.println("Miercoles");
               break;
           case 4:
               System.out.println("Jueves");
               break;
           case 5:
               System.out.println("Viernes");
               break;
           case 6:
               System.out.println("Sabado");
               break;
       }
   }
}
