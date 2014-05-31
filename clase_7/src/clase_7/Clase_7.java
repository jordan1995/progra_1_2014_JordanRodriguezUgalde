/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_7;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Clase_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion =0;
        Scanner teclado= new Scanner(System.in);
        
        do{
            System.out.println("Digite la opcion que desea");
            System.out.println("1.Ejercicio 1\n"+
                                "2.Cadena\n");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    System.out.println("Digite el correo a Evaluar");
                    teclado=new Scanner(System.in);
                    ejercicio1 oejercio1 = new ejercicio1(teclado.nextLine());
                    System.out.println(oejercio1.validar_correo());
                    break;
                }
                case 2:
                {
                    System.out.println("Digite la cadena a Evaluar");
                    ejercicio_2 oejercicio_2= new ejercicio_2();
                    teclado=new Scanner(System.in);
                    oejercicio_2.setCadena(teclado.nextLine());
                    System.out.println(oejercicio_2.Media_cadena());
                    System.out.println(oejercicio_2.Ultimo_Valor());
                    System.out.println(oejercicio_2.Alreves());
                    System.out.println(oejercicio_2.Guion());
                    System.out.println(oejercicio_2.Vocales());
                    System.out.println(oejercicio_2.Palindromo());
                    break;
                }
               
            }
            
        }while(opcion<=3);
    }
    
}
