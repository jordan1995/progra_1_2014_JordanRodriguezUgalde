/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication39;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClsChar {
    private char letra;
    private boolean  validar=true;
    char continuar;
    Scanner teclado= new Scanner(System.in);
    public ClsChar(){
        
        System.out.println("Digite una letra entre A y B para saber su estado");
        letra=teclado.nextLine().charAt(0);
    }
  private void opcion1(){
   System.out.println("Excelente");
    
  }    
   private void opcion2(){
   System.out.println("Bueno");
   }
    private void opcion3(){
   System.out.println("Regular");
}
     private void opcion4(){
   System.out.println("Malo");
}
      private void opcion5(){
   System.out.println("Pesimo");
}
      public void menu(){
         do{
          int opcion; 
          System.out.println("1.ver letra");
          System.out.println("2.Ver condicion");
          
          opcion=Integer.parseInt(teclado.nextLine());
          
          switch(opcion)
          {
              case 1:{
                  System.out.println("La letra tecleada fue "+letra);
                  break;
              }
              case 2:{
                  if((letra=='a')||(letra=='A')){
                      opcion1();
                  }
                  if((letra=='b')||(letra=='B')){
                      opcion2();
                  }
                     if((letra=='c')||(letra=='C')){
                         opcion3();
                     } 
                     if((letra=='d')||(letra=='D')){
                         opcion4();
                     }
                     if((letra=='e')||(letra=='E')){
                         opcion5();
                     }
                     break;
             
          }
      }
          System.out.println("Desea continuar con otra operacion S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 's') || (continuar == 'S')) {
                validar = true;
            }
            if ((continuar == 'N') || (continuar == 'n')) {
                validar = false;
            }
            
        }while(validar);
         
}
}