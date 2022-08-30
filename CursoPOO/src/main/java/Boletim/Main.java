/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletim;

/**
 *
 * @author jubsz
 */
public class Main {
    
    public static void main(String[] args) {
        
        BoletimAluno B1 = new BoletimAluno();
        //Boletim B2 = new Boletim();
        
        B1.setNota(10);
        B1.setNome("Jubsz");
        B1.setFrequencia(5);
        B1.setStatus("Aprovado");
        
        B1.estadoAtual();
        
    }
}
