/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        double A;
        char letra;
        int opcion;
        N=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero"));
        A=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite otro numero"));
        letra=JOptionPane.showInputDialog(null,"Digite una letra").charAt(0);
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n"
            +"1.Sumar\n"
            +"2.Restar\n"
            +"3.Multiplicar\n"
            +"4.Dividir\n"
            +"5.Salir"));
            switch(opcion)
            {
                case 1:{
                    JOptionPane.showMessageDialog(null, "La suma de "+N+"+"+A+"="+(N+A));
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null, "La Resta de "+A+"-"+N+"="+(A-N));
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, "La multiplicacion de "+N+"*"+A+"="+(N*A));
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null, "La division de "+N+"/"+A+"="+(N/A));
                    break;
                }
                case 5:{
                    JOptionPane.showMessageDialog(null, "Saliendo del Programa");
                }
            }
            
        }while((opcion<5)&&(opcion>0));
    }
    
}
