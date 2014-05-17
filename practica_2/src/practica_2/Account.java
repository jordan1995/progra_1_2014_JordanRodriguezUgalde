/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

/**
 *
 * @author jordan
 */
public class Account {

    private double saldoInicial;
    private boolean hayError;

    public Account() {
        saldoInicial = 0;
        hayError = false;
    }

    /**
     * este metodo sirve para aumentar la cuenta de usuario
     *
     * @param monto parametro para recibir un nuevo monto
     */
    public void deposito(double monto) {
        setSaldoInicial(getSaldoInicial() + monto);
    }

    /**
     * Este metodo sirve para disminuir la cuenta de un usuario
     *
     * @param monto parametro para recibir el nuevo monto
     */
    public void retiro(double monto) {
        if (getSaldoInicial() >= monto) {
            setSaldoInicial(getSaldoInicial() - monto);
        } else {
            setHayError(true);
        }
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

}
