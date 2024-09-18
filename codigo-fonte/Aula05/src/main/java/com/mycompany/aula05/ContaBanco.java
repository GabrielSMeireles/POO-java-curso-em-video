package com.mycompany.aula05;

public class ContaBanco {
    public String numConta;
    protected String tipo; //cc e cp (conta corrente (ganha 50 ao abrir) e conta poupança (ganha 150 ao abrir))
    private String dono;
    private float saldo;
    private boolean status; //true para aberta e false para fechada, quando abrir deve receber uma mensagem de que tipo de conta é
    
    public void estadoAtual(){
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("tipo da conta: " + getTipo());
        System.out.println("dono da conta: " + getDono());
        System.out.println("saldo: " + getSaldo());
        System.out.println("status: " + isStatus());
    }
    
    public void abrirConta(String tipo){
        setStatus(true);
        setTipo(tipo);
        if(getTipo().equals("cc")){
            setSaldo(getSaldo() + 50f);
            System.out.printf("\nParabéns, você abriu sua conta corrente com sucesso, e ganhou um saldo de R$%.2f!!", getSaldo());
        }else if(getTipo().equals("cp")){
            setSaldo(getSaldo() + 150f);
            System.out.printf("\nParabéns, você abriu sua conta poupança com sucesso, e ganhou um saldo de R$%.2f!!", getSaldo());
        }
        
    }
    
    public void fecharConta(){
        if(isStatus()==true&& getSaldo()== 0.0f){
            setStatus(false);
            System.out.printf("\nSua conta %s foi fechada com sucesso", getTipo());
        } else if(getSaldo()<0f){
            System.out.println("não foi possível fechar sua conta, seu saldo está negativo.");
        }else if(getSaldo()>0f){
            System.out.println("não foi possível fechar sua conta, seu saldo está positivo.");
        }else if(isStatus()==false){
            System.out.println("não foi possível fechar sua conta, ela já foi fechada previamente.");
        }
    }   
    
    public void depositar(float valor){
        if(isStatus()==true && valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.printf("\ndepósito no valor de: %.2f bem sucedido, seu saldo atual é de: %.2f", valor, getSaldo());
        }else if(isStatus()==false){
            System.out.println("Não foi possível realizar o depósito, sua conta está fechada.");
        }else if(valor<=0){
            System.out.printf("\nnão foi possível realizar o depósito, o valor que tentou depositar é de: %.2f", valor);
        }
    }
    
    public void sacar(float valor){
        if(isStatus()==true&& valor <= getSaldo() && valor > 0){
            setSaldo(getSaldo() - valor);
            System.out.printf("\nsaque no valor de: %.2f bem sucedido, seu saldo restante é de: %.2f", valor, getSaldo());
        }else if(isStatus()==false){
            System.out.println("Não foi possível realizar o saque, sua conta está fechada.");
        }else if(valor<=getSaldo()){
            System.out.printf("\nnão foi possível realizar o saque, seu saldo é de: %.2f, e o valor que tentou sacar é de: %.2f", getSaldo(), valor);
        }
    }
    
    public void pagarMensal(){
        if(isStatus()==false){
            System.out.println("Conta fechada! impossível pagar mensalidade!");
        }else{
            if(getTipo().equals("cc")){
                if(getSaldo()>=12f){
                    setSaldo(getSaldo() - 12f);
                    System.out.println("Mensalidade paga com sucesso!");
                }else{
                    System.out.printf("\nSaldo insuficiente para pagar a mensalidade! você possui R$%.2f", getSaldo());
                }
            }else if(getTipo().equals("cp")){
                if(getSaldo()>=20f){
                    setSaldo(getSaldo() - 20f);
                    System.out.println("Mensalidade paga com sucesso!");
                }else{
                    System.out.printf("\nSaldo insuficiente para pagar a mensalidade! você possui R$%.2f", getSaldo());
                }
            }
        }
    }

    public ContaBanco(String numConta, String dono) {
        this.numConta = numConta;
        this.tipo = "";
        this.dono = dono;
        this.saldo = 0f;
        this.status = false;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("cc")||tipo.equals("cp"))
            this.tipo = tipo;
        else System.out.println("Tente novamente, só aceitamos conta corrente ou poupança");
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
