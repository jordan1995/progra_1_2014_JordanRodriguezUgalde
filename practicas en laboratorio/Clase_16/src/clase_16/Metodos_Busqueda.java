/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_16;

/**
 *
 * @author profe
 */
public class Metodos_Busqueda {
    
    public  int Buscar_Nombre(String[]Nombres,String Busqueda)
    {
        for(int i=0;i<Nombres.length;i++)
        {
            if(Nombres[i].equals(Busqueda))
            {
                return i;
            }
        }
        return -1;
    }
}
