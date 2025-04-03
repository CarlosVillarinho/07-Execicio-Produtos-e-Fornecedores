package br.fiap.fornecedores;

public class Fornecedores {

    //ATRIBUTOS
    private String nome;
    private long CNPJ;

    //CONSTRUTOR (ATALHO = 'alt + insert')
    public Fornecedores(String nome, long CNPJ) {
        this.nome = nome; //LOCAL (usa 'this' para diferenciar de atributo para a local)
        this.CNPJ = CNPJ; //LOCAL (usa 'this' para diferenciar de atributo para a local)
    }

    //METODOS DE ACESSO - (usa apenas quando a viariavel esta privada)
    // ----- 'get' -----
    public String getNome(){
        return nome;
    }
    // ----- 'set' -----
    public void setNome(String nome){
        this.nome = nome; //LOCAL (usa 'this' para diferenciar de atributo para a local)
    }

    // ----- 'get' -----
    public long getCNPJ() {
        return CNPJ;
    }
    // ----- 'set' -----
    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }
}
