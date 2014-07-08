/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_15;

/**
 *
 * @author profe
 */
public class Ordenamiento {
    public int[]OrdenS(int arreglo[],String Ordenamiento)
    {
        int Indice=0;
        int Indice2=0;
        int Menor=0;
        int Posicion=0;
        int Temporal=0;
        for(Indice=0;Indice<arreglo.length-1;Indice++)
        {
            Menor=arreglo[Indice];
            Posicion=Indice;
            for(Indice2=Indice+1;Indice2<arreglo.length;Indice2++)
            {
                if(arreglo[Indice2]<Menor)
                {
                    Menor=arreglo[Indice2];
                    Posicion=Indice2;
                }
            }
            if(Posicion!=Indice)
            {
              Temporal=arreglo[Indice];
              arreglo[Indice]=arreglo[Posicion];
              arreglo[Posicion]=Temporal;
                
            }
        }
        return arreglo;
    }
    
}
