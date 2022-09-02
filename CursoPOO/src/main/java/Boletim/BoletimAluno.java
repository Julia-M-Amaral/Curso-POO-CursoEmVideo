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

    /*public BoletimAluno(String nome, float nota, int frequencia, String status) {
        this.nome = nome;
        this.nota = nota;
        this.frequencia = frequencia;
        this.status = status;
    }*/
    
      /*Construtor onde o usuário decide os valores*/
    public BoletimAluno(float nt, int fr, String st){
        setBoletimAluno(nt,fr,st);
}
    
    /*Construtor com valores padrão*/
    public BoletimAluno(String st){
        this(10,100,st);
}
    
    /*Construtor padrão*/
    public BoletimAluno(){
        this(0,0,null);
}
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

    public void print(){
        System.out.println(getNota()+"\n"+getFrequencia()+"\n"+getStatus()+"\n");
    }
    public void setBoletimAluno(float nt, int fr, String st) {
		setNota(nt);
		setFrequencia(fr);
		setStatus(st);
	}
    
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
