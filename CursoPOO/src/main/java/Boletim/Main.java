/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletim;

/**
 *
 * @author jubsz
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escreva = new Scanner(System.in);
        // BoletimAluno B1 = new BoletimAluno();
        //BoletimAluno B2 = new BoletimAluno();

        float nota;
        int frequencia;
        String status;

        //double mediaGrad = B1.calcularMedia(9.5, 4.7, 6.9);
        //double mediaPos = B2.calcularMedia(7.4, 9.2);
        //JOptionPane.showMessageDialog(null, "A média da graduação é: " + mediaGrad + " <-- Graduação "  + mediaPos + " <-- Pós", "BOLETIM" , JOptionPane.PLAIN_MESSAGE);
        System.out.println("Insira a nota de início");
        nota = escreva.nextFloat();
        System.out.println("Insira a frequência de início");
        frequencia = escreva.nextInt();
        System.out.println("Insira o status de início");
        status = escreva.next();
        
        BoletimAluno B1 = new BoletimAluno(nota, frequencia, status);
        BoletimAluno B2 = new BoletimAluno();
        BoletimAluno B3 = new BoletimAluno("Aprovado!");
        
        System.out.println("Uso do construtor com 3 parâmetros: ");
		B1.print();
		System.out.println("Uso do construtor com nenhum parâmetro: ");
		B2.print();
		System.out.println("Uso do construtor com 2 parâmetros: ");
		B3.print();
    }
}
