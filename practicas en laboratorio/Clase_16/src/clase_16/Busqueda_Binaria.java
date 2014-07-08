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
public class Busqueda_Binaria {
    public  int Buscar_Nombre(String[]Nombres,String Busqueda)
    {
        int Inicial=0;
        int Elemento_Final=Nombres.length;
        while (Inicial<Elemento_Final)
        {
            int Central=(Inicial+Elemento_Final)/2;
            if(Busqueda.compareTo(Nombres[Central])>0)
            {
                Inicial=Central+1;
            }
            else
            {
                if(Busqueda.compareTo(Nombres[Central])<0)
                {
                    Elemento_Final=Central-1;
                }
                else
                {
                    return Central;
                }
            }
        }
    
        return -1;
    }
}
