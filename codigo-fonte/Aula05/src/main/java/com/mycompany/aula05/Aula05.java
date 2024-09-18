package com.mycompany.aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco("1515", "Jubileu");
        conta1.estadoAtual();
        
        conta1.abrirConta("cc");
        conta1.depositar(1f);
        conta1.sacar(30f);
        conta1.pagarMensal();
        conta1.fecharConta();
        
        conta1.sacar(conta1.getSaldo());
        conta1.fecharConta();
        conta1.estadoAtual();
        
        ContaBanco conta2 = new ContaBanco("0505", "Creusa");
        conta2.estadoAtual();
        conta2.abrirConta("cp");
        conta2.depositar(20f);
        conta2.sacar(1f);
        conta2.pagarMensal();
        conta2.fecharConta();
        
        conta2.sacar(conta2.getSaldo());
        conta2.fecharConta();
        
    }
}
