/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author jubsz
 */
public class Main {
     public static void main(String[] args) {  
      
      ContaBanco pessoa1 = new ContaBanco();
      
      pessoa1.setNumConta(1111);
      pessoa1.setDono("Julia");
      pessoa1.abrirConta("cc");
      pessoa1.depositar(100);
      pessoa1.sacar(5);
      //----------------------------------------------
      ContaBanco pessoa2 = new ContaBanco();
      
      pessoa2.setNumConta(2222);
      pessoa2.setDono("Rafael");
      pessoa2.abrirConta("cp");
      pessoa2.depositar(500);
      pessoa2.sacar(100);
      //----------------------------------------------
      ContaBanco pessoa3 = new ContaBanco();
      pessoa3.setNumConta(3333);
      pessoa3.setDono("Kalinda");
      pessoa3.abrirConta("cc");
      pessoa3.depositar(1000);
      pessoa3.sacar(300);
      pessoa3.sacar(1000);
      //----------------------------------------------
      pessoa1.estadoAtual();
      pessoa2.estadoAtual();
      pessoa3.estadoAtual();
      
      
}
}
