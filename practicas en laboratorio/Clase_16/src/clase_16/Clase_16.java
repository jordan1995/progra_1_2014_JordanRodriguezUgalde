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
public class Clase_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Arreglo={"Mario","Efren","Susana","Campbell","Agustin","Elias"};
        Metodos_Busqueda M=new Metodos_Busqueda();
        System.out.println("La busqueda Lineal es: "+M.Buscar_Nombre(Arreglo, "Efren"));
        System.out.println();
        String[] Arreglo2={"Mario","Efren","Susana","Campbell","Agustin","Elias"};
        
        Busqueda_Binaria BB = new Busqueda_Binaria();
        System.out.println("La busqueda binaria es: "+BB.Buscar_Nombre(Arreglo2, "Efren"));
        
        System.out.println();
    }
    
    
    
}
