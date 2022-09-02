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
public class Main {
    
    public static void main(String[] args) {
        
        BoletimAluno B1 = new BoletimAluno();
        BoletimAluno B2 = new BoletimAluno();
        
       double mediaGrad = B1.calcularMedia(9.5, 4.7, 6.9);
       double mediaPos = B2.calcularMedia(7.4, 9.2);
       
       JOptionPane.showMessageDialog(null, "A média da graduação é: " + mediaGrad + " <-- Graduação "  + mediaPos + " <-- Pós", "BOLETIM" , JOptionPane.PLAIN_MESSAGE);
        
    }
}
