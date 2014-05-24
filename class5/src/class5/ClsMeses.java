/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

/**
 *
 * @author profe
 */
public class ClsMeses {
    private int numero;
    
    public ClsMeses(int pN){
        this.numero=pN;
    }
    public String meses(int numero){
        String cadena = "";
        if(this.numero==1){
            cadena="Enero";
        }
        if(this.numero==2){
            cadena="Febrero";
        }
        if(this.numero==3){
            cadena="Marzo";
        }
        if(this.numero==4){
            cadena="Abril";
        }
        if(this.numero==5){
            cadena="Mayo";
        }
        if(this.numero==6){
            cadena="Junio";
        }
        if(this.numero==7){
            cadena="Julio";
        }
        if(this.numero==8){
            cadena="Agosto";
        }
        if(this.numero==9){
            cadena="Setiembre";
        }
        if(this.numero==10){
            cadena="Octubre";
        }
        if(this.numero==11){
            cadena="Noviembre";
        }
        if(this.numero==12){
            cadena="Diciembre";
        }
        return cadena;
    }
    
}
