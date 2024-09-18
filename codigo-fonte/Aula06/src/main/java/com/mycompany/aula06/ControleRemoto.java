package com.mycompany.aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i=0; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado()){
            setVolume(getVolume() + 5);
        }else{
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
         if(isLigado()){
            setVolume(getVolume() - 5);
        }else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
         if(isLigado() && getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
         if(isLigado() && getVolume()==0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() && isTocando()==false){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(isLigado() && isTocando()==true){
            setTocando(false);
        }
    }            
}
