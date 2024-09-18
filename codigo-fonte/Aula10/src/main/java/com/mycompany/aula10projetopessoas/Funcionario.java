package com.mycompany.aula10projetopessoas;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalahando;
    
    public void mudarTrabalho(){
        this.trabalahando = !this.trabalahando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalahando() {
        return trabalahando;
    }

    public void setTrabalahando(boolean trabalahando) {
        this.trabalahando = trabalahando;
    }
}
