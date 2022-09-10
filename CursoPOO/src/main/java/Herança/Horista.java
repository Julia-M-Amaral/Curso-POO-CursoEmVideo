/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author jubsz
 */
public class Horista extends Colaborador{
    private int horasTrabalhadas;
    private double valorPorHora;

    public Horista(String nome, String departamento, double valorPorHora){
            super(nome, departamento);
            this.setValorPorHora(valorPorHora);
    }
    
    public double salario(){
        return this.getHorasTrabalhadas() * this.getValorPorHora();
    }
    
    @Override
    public String toString(){
        return String.format("%s\nHoras trabalhadas: %d\n" + "Valor por hora: R$ %.2f\nSalário: R$ %.2f",
                super.toString(), this.getHorasTrabalhadas(), this.getValorPorHora(), this.salario());
    }
   
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
 
}
