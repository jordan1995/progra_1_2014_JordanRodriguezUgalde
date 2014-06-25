/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 0;
        int valor2;
        double resultado;
        char continuar = ' ';
        boolean validar = true;
        int opcion = 0;


        Scanner teclado = new Scanner(System.in);
        Operaciones oOperaciones = new Operaciones();
        do {
            System.out.println("Digite la operacion a Evaluar");
            System.out.println("1.suma");
            System.out.println("2.Resta");
            System.out.println("3.Division");
            System.out.println("4.Multiplicacion");
            System.out.println("5.Raiz");
            System.out.println("6.Potencia");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Digite el valor del Primer Digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del Segundo Digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("Digite el valor del Primer Digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del Segundo Digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.restar(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 3:
                    System.out.println("Digite el valor del Primer Digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del Segundo Digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.division(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.println("Digite el valor del Primer Digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del Segundo Digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.multiplicacion(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("Digite el valor del Primer Digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Raiz(valor1);
                    System.out.println(resultado);
                    break;
                case 6:
                    System.out.println("Digite el valor del Primer Digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del Segundo Digito");
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.potencia(valor1, valor2);
                    System.out.println(resultado);
                    break;
                default:
                    break;
            }

            System.out.println("Desea continuar con otra operacion S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 's') || (continuar == 'S')) {
                validar = true;
            }
            if ((continuar == 'N') || (continuar == 'n')) {
                validar = false;
            }
        } while (validar);
      
    }
}
