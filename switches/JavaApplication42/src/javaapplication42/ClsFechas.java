/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication42;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClsFechas {
  private int dia,mes, año;
    Scanner teclado = new Scanner(System.in);
  public ClsFechas(){
      System.out.println("Igrese el Dia");
      dia=Integer.parseInt(teclado.nextLine());
      System.out.println("ingrese mes");
      mes=Integer.parseInt(teclado.nextLine());
      System.out.println("Ingrese Año");
      año=Integer.parseInt(teclado.nextLine());
      
  }
  public void main(){
      int Nd=0;
      int M=mes-1;
      if(M==0){
          M=12;
      }
      switch(M){
          case 1:case 3:case 5:case 7:case 8:case 10:case 12:
              Nd=31;
              break;
          case 4:case 6:case 9:case 11:
              Nd=30;
              break;
          case 2:
              if((mes%4==0&&mes%100!=0)||mes%400==0){
               Nd=29;
           }else{
               Nd=28;
           }
          break;
      }
      dia=dia-1;
      if(dia==0){
          dia=Nd;
          mes=mes-1;
      }
      if(mes==0){
          mes=12;
          año=año-1;
      }
      System.out.println("La fecha del dia Anterior es "+dia+"/"+mes+"/"+año);
  }
}
