package com.mycompany.aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }
}
