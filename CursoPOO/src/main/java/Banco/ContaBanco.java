/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author jubsz
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        
        System.out.println("--------------------------------");
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("--------------------------------");
    }

    public void abrirConta(String t) {

        this.setTipo(t);
        this.setStatus(true);
        
        if ("cc".equals(t)) {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);

        }
    }

    public void fecharConta() {

        if (saldo > 0) {
            System.out.println("Conta com Dinheiro!");
        } else if (saldo < 0) {
            System.out.println("Conta em débito!");
        } else {
            this.setStatus(false);
        }

    }

    public void depositar(float v) {

        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar.");
        }
    }

    public void sacar(float v) {

        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }

    }

    public void pagarMensal() {

        float v = 0;

        if ("cc".equals(this.getTipo())) {
            v = 12;
        } else if ("cp".equals(this.getTipo())) {
            v = 20;
        }

        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade de " + v + "reais paga com sucesso! Obrigada, " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }

    /*Método construtor*/
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
}
