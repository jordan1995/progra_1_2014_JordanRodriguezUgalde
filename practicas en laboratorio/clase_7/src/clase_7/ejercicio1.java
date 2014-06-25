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
public class ejercicio1 {
    private String email;
    public ejercicio1(String pemail){
        this.email=pemail;
        
    }
    public String validar_correo(){
        String mensaje="El correo no tiene @";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                mensaje="El correo si tiene @";
            }
            
        }
        return mensaje;
    }
}
