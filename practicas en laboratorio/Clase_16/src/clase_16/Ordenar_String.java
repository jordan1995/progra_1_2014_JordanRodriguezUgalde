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
public class Ordenar_String {
     public String[]OrdenS(String arreglo[],String Ordenamiento)
    {
        int Indice=0;
        int Indice2=0;
        String Menor="";
        int Posicion=0;
        String Temporal="";
        for(Indice=0;Indice<arreglo.length-1;Indice++)
        {
            Menor=arreglo[Indice];
            Posicion=Indice;
            for(Indice2=Indice+1;Indice2<arreglo.length;Indice2++)
            {
                if(arreglo[Indice2].compareTo(Menor)<0)
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


