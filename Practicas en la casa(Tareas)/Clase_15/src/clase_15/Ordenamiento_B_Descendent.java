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
public class Ordenamiento_B_Descendent {
    public int[] Ordenar_Descendente(int[]Arreglo,String Ordenamiento)
    {
         int indice;
        int indice2;
        int Auxiliar;
        if(Ordenamiento.equals("A"))
        {
        for( indice=0;indice<Arreglo.length-1;indice++)
        {
            for(indice2=0;indice2<Arreglo.length-indice-1;indice2++)
            {
                if(Arreglo[indice2+1]<Arreglo[indice2])
                {
                    Auxiliar=Arreglo[indice2+1];
                    Arreglo[indice2+1]=Arreglo[indice2];
                    Arreglo[indice2]=Auxiliar;
                }
            }
        }
    }
        else
        {
             for( indice=0;indice<Arreglo.length-1;indice++)
        {
            for(indice2=0;indice2<Arreglo.length-indice-1;indice2++)
            {
                if(Arreglo[indice2+1]>Arreglo[indice2])
                {
                    Auxiliar=Arreglo[indice2+1];
                    Arreglo[indice2+1]=Arreglo[indice2];
                    Arreglo[indice2]=Auxiliar;
                }
            }
        }
            
        }
        return Arreglo;
    }
    

    
}
