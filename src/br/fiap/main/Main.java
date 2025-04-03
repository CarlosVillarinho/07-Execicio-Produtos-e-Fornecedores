package br.fiap.main;

import br.fiap.fornecedores.Fornecedores;
import br.fiap.funcionalidades.Funcionalidades;

public class Main {
    public static void main(String[] args) {

        //INSTANCIA O OBJETO
        Fornecedores fornecedor = new Fornecedores("xpto", 1);
        Funcionalidades funcionalidades = new Funcionalidades();
        funcionalidades.menuPrincipal();

        System.out.println(fornecedor.getNome());
        fornecedor.setNome("fiap"); //'set' - ALTERA O NOME
        System.out.println(fornecedor.getNome());

    }
}
