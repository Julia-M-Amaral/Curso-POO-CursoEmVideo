/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletim;

/**
 *
 * @author jubsz
 */
public class BoletimAluno {
 
    private String nome;
    private float nota;
    private int frequencia;
    private String status;
    
    
    public void inserirNota(float nota){
        
    }
    public void excluirNota(){
        
    }
    public void alterarNota(float novaNota){
        
    }
    public void inserirFrequencia(boolean freq){
        
    }
    public void alterarStatus(){
        
    }
    public double calcularMedia(double PM, double AS){
        double media = (PM*0.4)+(AS*0.6);
        return media;
    }
    public double calcularMedia(double AM, double AC, double AS){
        double media = (AM*0.3)+(AC*0.2)+(AS*0.5);
        return media;
    }
    
    public void estadoAtual(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nota: " + this.getNota());
        System.out.println("Frequencia: " + this.getFrequencia());
        System.out.println("Status: " + this.getStatus());
        
    }

    
    public float getNota() {
        return nota;
    }

    public void setNota(float n) {
        this.nota = n;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int f) {
        this.frequencia = f;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String s) {
        this.status = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }
}
