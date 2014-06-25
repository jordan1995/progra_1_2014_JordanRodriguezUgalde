/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication40;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClsDias {
    private int año,mes;
    Scanner teclado = new Scanner(System.in);
    public ClsDias(){
        System.out.println("Ingrese el numero de mes(1-12)");
        mes=Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el año");
        año=Integer.parseInt(teclado.nextLine());
    }
    public void menu(){
   switch(mes)
   {
       case 1:case 3: case 5:case 7: case 8:case 10:case 12:{
           System.out.println("El mes tiene 31 Dias");
           break;
       }
       case 4:case 6:case 9:case 11:{
           System.out.println("El mes tiene 30 dias");
           break;
       }
       case 2:{
           if((mes%4==0&&mes%100!=0)||mes%400==0){
               System.out.println("El mes tiene 29 Dias");
           }else{
               System.out.println("El mes tiene 28 Dias");
           }
       }
       
   }
    
        
            
    
    }
}
