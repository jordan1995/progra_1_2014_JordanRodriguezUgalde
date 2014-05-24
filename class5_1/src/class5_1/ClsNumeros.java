/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class5_1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ClsNumeros {
    private int numero;
    
    Scanner teclado = new Scanner(System.in);
    public ClsNumeros(){
        System.out.println("Digite un Numero");
        this.numero=Integer.parseInt(teclado.nextLine());
    }
    private int Cuadrado(){
        return this.numero*this.numero;
    }
   public void Main()
   {
     System.out.println("1.Ver Cuadrado");
     System.out.println("2.ver multiplicion");
     System.out.println("3.Ver numero");
     int opcion=Integer.parseInt(teclado.nextLine());
      
         
              
          
      
   }
        
    }

