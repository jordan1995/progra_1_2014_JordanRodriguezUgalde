/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puntos_examen;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Puntos_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int Opcion;
        do{
        System.out.println("Menu\n"+
                "1.Traducir Palabra\n"+
                "2.Admin Palabra\n");
        Opcion=leer.nextInt();
        switch(Opcion)
        {
            case 1:
            {
        Matriz M = new Matriz();
        M.Main();
        break;
            }
            case 2:
            {
        AdminPalabras Admin= new AdminPalabras();
        Admin.Main();
         break;
            }
        }
     
        }while(Opcion<=2);
    }
    
}
