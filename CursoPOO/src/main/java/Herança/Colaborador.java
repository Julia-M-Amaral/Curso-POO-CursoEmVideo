/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author jubsz
 */
public class Colaborador {
    
    private String nome;
    private String departamento;
    
    public Colaborador(String nome, String departamento){
        this.setNome(nome);
        this.setDepartamento(departamento);
}
    
    @Override
    public String toString(){
        return String.format("Colaborador: %s\nDepartamento: %s", this.getNome(), this.getDepartamento());
    }
    
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String dp) {
        this.departamento = dp;
    }
    
}
