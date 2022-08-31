/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControleRemoto;

/**
 *
 * @author jubsz
 */
public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    /*Métodos abstratos*/
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        
        for(int i = 0; i <= this.getVolume(); i+= 10){
            System.out.print(" | "); 
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

     @Override
    public void desligarMudo() {
        if(this.isLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    @Override
    public void play() {
        if(this.isLigado() == true && !(this.isTocando()))
            this.setTocando(true);
    }

    @Override
    public void pause() {
        if(this.isLigado() == true && this.isTocando() == true){
            this.setTocando(false);
        }
    }
}
   
