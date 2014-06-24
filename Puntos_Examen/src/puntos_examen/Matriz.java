/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puntos_examen;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matriz {
    Scanner leer= new Scanner(System.in);
    private String Cadena;
    private char[][]Matriz=new char[5][5];
    private boolean Verificar_Palabra=false;
    private String llenar_puntos="";
   private void llenar_Matriz()
   {
       Matriz[0][0]='A';
        Matriz[0][1]='B';
        Matriz[0][2]='C';
        Matriz[0][3]='D';
        Matriz[0][4]='E';
        Matriz[1][0]='F';
        Matriz[1][1]='G';
        Matriz[1][2]='H';
        Matriz[1][3]='I';
        Matriz[1][4]='J';
        Matriz[2][0]='L';
        Matriz[2][1]='M';
        Matriz[2][2]='N';
        Matriz[2][3]='O';
        Matriz[2][4]='P';
        Matriz[3][0]='Q';
        Matriz[3][1]='R';
        Matriz[3][2]='S';
        Matriz[3][3]='T';
        Matriz[3][4]='U';
        Matriz[4][0]='V';
        Matriz[4][1]='W';
        Matriz[4][2]='X';
        Matriz[4][3]='Y';
        Matriz[4][4]='Z';
         for(int i=0;i<5;i++)
         {
             for(int j=0;j<5;j++)
             {
                 System.out.print("["+Matriz[i][j]+"]");
             }
             System.out.println();
         }
       
   }
    private void Cadena()
    {
        System.out.println("Digite la Palabra que Desee en Mayuscula");
        Cadena=leer.nextLine();
       
        
        
    }
    private void Traducir_Palabra()
    {
        for(int x=0;x<Cadena.length();x++)
        {
            Verificar_Palabra=false;
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(Cadena.charAt(x)==Matriz[i][j])
                    {
                        Verificar_Palabra=true;
                        int N=0;
                        while(N<=i)
                        {
                            llenar_puntos=llenar_puntos+".";
                            N++;
                        }
                        N = 0;
                        
                        llenar_puntos=llenar_puntos+" ";
                        
                        while(N<=j)
                        {
                            llenar_puntos=llenar_puntos+".";
                            N++;
                        }
                        llenar_puntos=llenar_puntos+" ";
                        break;
                    }
                }
                if(Verificar_Palabra==true)
                {
                    break;
                }
                
            }
            
        }
        System.out.println(llenar_puntos);
    }
    public void Main()
    {
        llenar_Matriz();
        Cadena();
        Traducir_Palabra();
   
}
}
