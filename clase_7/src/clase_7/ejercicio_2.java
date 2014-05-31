/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_7;

/**
 *
 * @author profe
 */
public class ejercicio_2 {
    private String cadena;
    
public  String Media_cadena(){
    String Retorno = "";
    for(int i=0;i<getCadena().length()/2;i++){
        Retorno+=getCadena().charAt(i);
        
        
    }
    return Retorno;
}
public String Ultimo_Valor(){
    return getCadena().charAt(getCadena().length()-1)+"";
    
}
public String Alreves()
{
    String Retorno="";
    for(int i=getCadena().length()-1;i>=0;i--){
    Retorno+=getCadena().charAt(i);
    }
    return Retorno;
}
public  String Guion()
{
    String Retorno="";
    for(int i=0;i<getCadena().length();i++)
    {
    if(getCadena().length()-1==i)
    { 
        Retorno+=getCadena().charAt(i);
}else
    {
       Retorno+=getCadena().charAt(i)+"-";
    }
    
    } 
    return  Retorno;
}
public  int Vocales()
{
    int cantidad_Vocales=0;
    for(int i=0;i<getCadena().length();i++)
    {
    if((getCadena().charAt(i)=='a')||
        (getCadena().charAt(i)=='A')||
            (getCadena().charAt(i)=='e')||
            (getCadena().charAt(i)=='E')||
            (getCadena().charAt(i)=='i')||
            (getCadena().charAt(i)=='I')||
            (getCadena().charAt(i)=='O')||
            (getCadena().charAt(i)=='o')||
            (getCadena().charAt(i)=='U')||
            (getCadena().charAt(i)=='u')) {
        cantidad_Vocales++;
    }
    
    }  
    return cantidad_Vocales;
}
public boolean Palindromo(){
    String Palabra_AlReves="";
    boolean estado=true;
            
    for(int i=getCadena().length()-1;i>=0;i--){
        Palabra_AlReves+=+getCadena().charAt(i);
        if(getCadena().equals(Palabra_AlReves)){
            estado= true;
        }else{
          estado= false;
        }
        
    }
    return  estado;
}

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
}
