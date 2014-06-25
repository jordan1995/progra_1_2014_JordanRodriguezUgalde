/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author profe
 */
public class Operaciones {
    public double  sumar(double  valor1,double  valor2){
        return valor1+valor2;
    }
      public double  restar(double  valor1,double  valor2){
        return valor1-valor2;
    }
        public double  division(double  valor1,double  valor2){
       if(valor1>0){
           return valor1/valor2;
       }
       else{
           return 0;
       }
    }
          public double  multiplicacion(double  valor1,double  valor2){
        return valor1*valor2;
    }
            public double  Raiz(double  valor1){
        return Math.sqrt(valor1);
    }
              public double  potencia(double  valor1,double  valor2){
        return Math.pow(valor1, valor2);
    }
    
}
