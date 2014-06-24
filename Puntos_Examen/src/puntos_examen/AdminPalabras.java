/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puntos_examen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */

public class AdminPalabras {
    Scanner leer=new Scanner(System.in);
     private String[] lista=new String[12];
        
   
   private String[] letras=new String[3];
   private void Datas()
   {
       
       
       for(int i=0;i<12;i++)
       {
           System.out.println("Digite la lista a Comparar");
       lista[i]=leer.nextLine();
          
       }
        for(int i=0;i<3;i++)
       {
           System.out.println("Digite las Palabras a Comparar");
       letras[i]=leer.nextLine();
          
       }
       
   }
   public void Imprimir_Matrices()
   {
       System.out.println("Vector 1");
        for(int i=0;i<12;i++)
       {
           System.out.println("["+lista[i]+"]");
       
          
       }
        System.out.println("Vector 2");
         for(int i=0;i<3;i++)
       {
           System.out.println("["+letras[i]+"]");
       
          
       }
   }
    private int Contar_Palabras_Posibles()
    {
        int contador=0;
        
        for(int i=0;i<lista.length;i++)
        {
          boolean[] Palabras_Usadas=new boolean[letras.length];
          for(int j=0;j<Palabras_Usadas.length;j++)
          {
              Palabras_Usadas[j]=false;
              
          }
          boolean Posibles_Palabras=true;
          for(int j=0;j<lista[i].length();j++)
          {
              boolean Palabra_Encontrada=false;
              for(int x=0;x<letras.length&&!Palabra_Encontrada;x++)
              {
                  if(!Palabras_Usadas[x]&&lista[i].charAt(j)==Arrays.toString(letras).charAt(x))
                  {
                      Palabra_Encontrada=true;
                      Palabras_Usadas[x]=true;
                  }
                  
              }
              if(!Palabra_Encontrada)
              {
                  Posibles_Palabras=false;
              }
          }
          if(Posibles_Palabras)
          {
              contador++;
          }
            
        }
    
        return contador;
        
    }
    public void Main()
    {
      Datas();
      Imprimir_Matrices();
      System.out.println("Las combinaciones son "+Contar_Palabras_Posibles());
        
    }
}
