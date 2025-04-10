package br.fiap.funcionalidades;

import br.fiap.fornecedores.Fornecedores;
import br.fiap.produtos.Produtos;

import static javax.swing.JOptionPane.*; //(USAMOS ESSA MANEIRA PARA NAO FICAR REPETINDO -- JOptionPane. -- Static pq é metodo)
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Funcionalidades {

    //INSTANCIA O OBEJTO - (importa as classes)
    private Fornecedores[] fornecedores = new Fornecedores[4];
    private Produtos[] produtos = new Produtos[4];
    private int indexProdu = 0;
    private int indexForne = 0;

    //METODOS
    public void menuPrincipal(){
        //VARIAVEIS
        int opcao = 0;
        String menu = "1. Cadastrar Produto\n2. Pesquisar produto por NOME\n3. Pesquisar fornecedor por CNPJ\n4. Finalizar"; //(\n, para quebrar a linha, passar para proxima)

        //REPETICAO
        do {
            //JOptionPane.showInputDialog(menu); (maneira antiga, fica repetinfdo -- JOptionPane.)
            opcao = parseInt(showInputDialog(menu));
            if(opcao < 1 || opcao > 4){
                showMessageDialog(null, "Opcao invalida.");
            }
            if(opcao == 1){
                cadastrarProduto();
            }else{
                if (opcao == 2){
                    pesquisarProduto();
                }else{
                    if(opcao == 3){
                        pesquisar();
                    }else{

                    }
                }
            }
        } while(opcao != 4);
    }

    private void pesquisar(){
        String aux = "";
        Fornecedores fornecedores = pesquisarFornecedor();

        if (fornecedores != null){
            aux += "Fornecedor: " + fornecedores.getNome() + "\n";
            aux += "CNPJ: " + fornecedores.getCNPJ() + "\n";
            showMessageDialog(null, aux);
        }
    }

    private void cadastrarProduto(){
        //VARIAVEIS LOCAIS
        String nomeProduto;
        double valor;
        long qtd;
        Fornecedores fornecedores = pesquisarFornecedor();

        if (fornecedores == null){
            fornecedores = cadastrarFornecedores();
        }
        nomeProduto = showInputDialog("Nome do produto: ");
        valor = parseDouble(showInputDialog("Valor do produto: "));
        qtd = parseLong(showInputDialog("Quantidade do produto em estoque: "));
        produtos[indexProdu] = new Produtos(nomeProduto, valor, qtd, fornecedores);
        indexProdu++;
    }

    private Fornecedores cadastrarFornecedores(){
        long CNPJ = parseLong(showInputDialog("CNPJ do fornecedor"));
        String nome = showInputDialog("Nome");

        fornecedores[indexForne] = new Fornecedores(nome, CNPJ);
        indexForne++;
        return fornecedores[indexForne-1];
    }

    private void pesquisarProduto(){
        String aux = "Produto nao encontrado";
        String nomeProduto = (showInputDialog("NOME do Produto"));

        for(int i=0;i<indexProdu;i++){
            if(produtos[i].getNomeProduto().equalsIgnoreCase(nomeProduto)){
                aux = "";
                aux += "Nome do produto: " + nomeProduto + "\n";
                aux += "Valor do produto: " + produtos[i].getValor() + "\n";
                aux += "Nome do fornecedor: " + fornecedores[i].getNome() + "\n";
            }
        }
        showMessageDialog(null, aux);
    }

    private Fornecedores pesquisarFornecedor(){
        long cnpj = parseLong(showInputDialog("CNPJ do Fornecedor"));

        for(int i=0;i<indexForne;i++){
            if(fornecedores[i].getCNPJ() == cnpj){
                return fornecedores[i];
            }
        }
        showMessageDialog(null, "CNPJ nao encontrado.");
        return null;
    }
}
