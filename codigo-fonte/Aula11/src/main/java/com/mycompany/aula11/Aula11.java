package com.mycompany.aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa; //uma classe abstrata não pode ser instanciada
        Visitante v1 = new Visitante();
        v1.setNome("Júlio");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        a1.setCurso("Agronegócio");
        a1.setIdade(23);
        a1.setSexo("F");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Marco");
        b1.setCurso("ADS");
        b1.setIdade(17);
        b1.renovarBolsa();
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Pedro");
        p1.setEspecialidade("doutor em logística");
        p1.setSalario(4500f);
        p1.receberAumento(500f);
        System.out.println("O professor "+p1.getNome()+" especializado em "+p1.getEspecialidade()+" tem o salário de R$"+p1.getSalario());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Julia");
        t1.praticar();
        
    }
}
