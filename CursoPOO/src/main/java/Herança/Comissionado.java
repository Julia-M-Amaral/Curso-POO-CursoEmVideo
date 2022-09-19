/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author jubsz
 */
public class Comissionado extends Colaborador{
    private double totalVendas;
    private int comissao;
    
    public Comissionado(String nome, String departamento, int comissao){
        super(nome,departamento);
        this.comissao = comissao;
        
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
    
    public double salario(){
        return this.totalVendas*(this.comissao/100.);
    }
}
