package br.fiap.produtos;

import br.fiap.fornecedores.Fornecedores;

public class Produtos {

    //ATRIBUTOS
    private String nomeProduto;
    private double valor;
    private long qtd;
    private Fornecedores fornecedores;

    //CONSTRUTOR
    public Produtos(String nomeProduto, double valor, long qtd, Fornecedores fornecedores) {
        this.nomeProduto = nomeProduto; //LOCAL (usa 'this' para diferenciar de atributo para a local)
        this.valor = valor;
        this.qtd = qtd;
    }

    //METODOS DE ACESSO
    // ----- 'get' -----
    public String getNomeProduto() {
        return nomeProduto;
    }
    // ----- 'set' -----
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto; //LOCAL (usa 'this' para diferenciar de atributo para a local)
    }

    // ----- 'get' -----
    public double getValor() {
        return valor;
    }
    // ----- 'set' -----
    public void setValor(double valor) {
        this.valor = valor;
    }

    // ----- 'get' -----
    public long getQtd() {
        return qtd;
    }
    // ----- 'set' -----
    public void setQtd(long qtd) {
        this.qtd = qtd;
    }
}
