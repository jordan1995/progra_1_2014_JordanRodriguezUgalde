/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica3;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class clsPregunta2 
{
    private int num;
    
    public clsPregunta2()
    {
        do
        {
            this.num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número (positivo): "));
        }while(this.num<=0);
    }
    
    private int cuadrado()
    {
        return this.num*this.num;
    }
    private int multi5()
    {
        return this.num*5;
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                + "1 - Ver resultado\n"
                + "2 - Cambiar número\n"
                + "3 - Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                switch(this.num%10)
                {
                    case 2: case 5: case 8:
                    {
                        JOptionPane.showMessageDialog(null, "El número ingresado fue: "+this.num+". Su cuadrado es: "+cuadrado());
                        break;
                    }
                    case 4: case 7: case 9:
                    {
                        JOptionPane.showMessageDialog(null, "El número ingresado fue: "+this.num+". Su multiplicación por 5 es: "+multi5());
                        break;
                    }default:
                    {
                        JOptionPane.showMessageDialog(null, "El número ingresado fue: "+this.num);
                    }
                }
                Menu(); break;
            }
            case 2:
            {
                do
                {
                    this.num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número (positivo): "));
                }while(this.num<=0);
                Menu();
            }
        }
    }
}
