/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ClsLunday {
    private int dia;
    Scanner teclado = new Scanner(System.in);
    public ClsLunday(){
        System.out.println("Ingrese un dia");
        dia=Integer.parseInt(teclado.nextLine());
    }
    public void Main(){
        switch(dia%7){
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Lunes");
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
