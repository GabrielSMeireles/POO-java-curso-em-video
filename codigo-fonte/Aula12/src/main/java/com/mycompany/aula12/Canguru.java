package com.mycompany.aula12;

public class Canguru extends Mamifero {
	//métodos
	public void usarBolsa() {
		System.out.println("Usando a bolsa.");
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}

}
