/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControleRemoto;

/**
 *
 * @author jubsz
 */
public class ControleRemoto {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }
    
    
}
