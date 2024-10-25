/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop10;

/**
 *
 * @author rodrigoespinosa
 */
public class Cuenta {
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > this.saldo) {
            throw new SaldoInsuficienteException("No hay fondos suficientes");
        }
        this.saldo -= monto;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String toString() {
        return "Cuenta {saldo=" + this.saldo + "}";
    }

    
}
