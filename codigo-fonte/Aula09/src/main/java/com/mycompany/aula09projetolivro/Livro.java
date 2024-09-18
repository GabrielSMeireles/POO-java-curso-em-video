package com.mycompany.aula09projetolivro;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
//    public void detalhes(){
//        System.out.println("### Detalhes do livro ###");
//        System.out.println("Título do livro: " + this.titulo);
//        System.out.println("Autor: " + this.autor);
//        System.out.println("Total de páginas: " + this.totPaginas);
//        System.out.println("Página atual: " + this.pagAtual);
//        System.out.println("O livro está aberto? " + this.aberto);
//        System.out.println("Qual o leitor atual? " + this.leitor.getNome());
//    }

    public String detalhes() {
        return "Livro" + "\ntitulo=" + titulo + ", autor="
                + autor + ", \ntotPaginas=" + totPaginas 
                + ", pagAtual=" + pagAtual + ", aberto=" 
                + aberto + ", \nleitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo();
    }
    
     @Override
    public void abrir() {
        if(this.aberto == false){
            this.aberto = true;
        }
    }

    @Override
    public void fechar() {
        if(this.aberto == true){
            this.aberto = false;
        }
    }

    @Override
    public void folhear(int pagina) {
        if(pagina > this.totPaginas){
            this.pagAtual = 0;
        }else{
            this.pagAtual = pagina;
        }
    }

    @Override
    public void avançarPag() {
        if(this.pagAtual<this.totPaginas){
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if(this.pagAtual > 1){
            this.pagAtual--;
        }
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
