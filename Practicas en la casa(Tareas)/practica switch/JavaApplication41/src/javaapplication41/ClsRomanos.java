/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication41;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClsRomanos {
    private int unidades,decenas,centenas,millar;
    private int Numero;
    Scanner teclado = new Scanner(System.in);
    public ClsRomanos(){
        System.out.println("Digite un numero entre en Rango(1-3000)");
        Numero=Integer.parseInt(teclado.nextLine());
    }
    public void main(){
        if((Numero>0)&&(Numero<=3000)){
            millar=Numero/1000;
            centenas=Numero/100;
            decenas=(Numero%100)/10;
            unidades=(Numero%100)%10;
            
            switch(millar)
            {
                case 1:
                    System.out.println("M");
                    centenas=(Numero%1000)/100;
                    break;
                case 2:
                     System.out.println("MM");
                     centenas=(Numero%1000)/100;
                    break;
                case 3:
                     System.out.println("MMM");
                     centenas=(Numero%1000)/100;
                    break;
            }
            switch(centenas)
            {
                case 1:
                     System.out.println("C");
                    break;
                case 2:
                     System.out.println("CC");
                    break;
                case 3:
                     System.out.println("CCC");
                    break;
                case 4:
                     System.out.println("CD");
                    break;
                case 5:
                     System.out.println("D");
                    break;
                case 6:
                     System.out.println("DC");
                    break;
                case 7:
                     System.out.println("DCC");
                    break;
                case 8:
                     System.out.println("DCCC");
                    break;
                case 9:
                     System.out.println("DM");
            }
            switch(decenas)
            {
                case 1:
                     System.out.println("X");
                    break;
                case 2:
                     System.out.println("XX");
                    break;
                case 3:
                     System.out.println("XXX");
                    break;
                case 4:
                     System.out.println("XL");
                    break;
                case 5:
                     System.out.println("L");
                    break;
                case 6:
                     System.out.println("LX");
                    break;
                case 7:
                     System.out.println("LXX");
                    break;
                case 8:
                     System.out.println("LXXX");
                    break;
                case 9:
                     System.out.println("XC");
                    break;
                
                
            }
            switch(unidades)
            {
                case 1:
                     System.out.println("I");
                    break;
                case 2:
                     System.out.println("II");
                    break;
                case 3:
                     System.out.println("III");
                    break;
                case 4:
                     System.out.println("IV");
                    break;
                case 5:
                     System.out.println("V");
                    break;
                case 6:
                     System.out.println("VI");
                    break;
                case 7:
                     System.out.println("VII");
                    break;
                case 8:
                     System.out.println("VIII");
                    break;
                case 9:
                     System.out.println("IX");
                    break;
                
                
            }
            
        }
        
    }
}
