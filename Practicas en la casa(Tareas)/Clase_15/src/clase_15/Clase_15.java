/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_15;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Clase_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int opcion;
        
       do{
        System.out.println("Menu\n"+
                "1.Ejercisio1\n"+
                "2.Ejercisio2\n");
        opcion=Leer.nextInt();
        switch(opcion)
        {
            case 1:
            {
        int[]Arreglo={56,4,85,85,42};
        int[] Arreglo_Ordenado;
        Ordenamiento O = new Ordenamiento();
        Arreglo_Ordenado=O.OrdenS(Arreglo,"A");
        for(int i=0;i<Arreglo_Ordenado.length;i++)
        {
            System.out.println(Arreglo_Ordenado[i]);
        }
        break;
            }
            case 2:
            {
        int[]Arreglo={50,26,7,9,15,27};
        int[] Arreglo_Ordenado;
        Ordenamiento_B_Descendent Ob = new Ordenamiento_B_Descendent();
        Arreglo_Ordenado=Ob.Ordenar_Descendente(Arreglo,"p");
        for(int i=0;i<Arreglo_Ordenado.length;i++)
        {
            System.out.println(Arreglo_Ordenado[i]);
        }
        break;
            }
    }
       }while(opcion<3);
    }
    
}
