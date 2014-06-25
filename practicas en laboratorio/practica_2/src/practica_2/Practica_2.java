/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class Practica_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = true;
        int opcion;
        char continuar;
        double monto;

        Account oAccount = new Account();
        Scanner teclado = new Scanner(System.in);

        while (validar) {
            System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere Realizar un retiro");
            opcion = Integer.parseInt(teclado.nextLine());
            if(opcion==1){
                System.out.println("Digite el monto que desea Realizar");
                monto=Double.parseDouble(teclado.nextLine());
                oAccount.deposito(monto);
            }
            if(opcion==2){
                System.out.println("Digite el monto a Retirar");
                monto=Double.parseDouble(teclado.nextLine());
                oAccount.retiro(monto);
                if(oAccount.isHayError()){
                    System.out.println("El monto que usted va a retirar no puede ser Retirado");
                }
            }
            System.out.println("El saldo finalo es de");
            System.out.println("Desea continuar con otra transaccion S/N");
            continuar=teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='s')){
                validar=true;
            }
            if((continuar=='N')||(continuar=='n')){
                validar=false;
            }
        }
    }

}
