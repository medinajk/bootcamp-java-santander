package main.java.list.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtoSet.addAll(produtoSet);
            return produtosPorPreco;
        }

        public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L,"Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(3L,"Produto 3", 21d, 4);
        cadastroProdutos.adicionarProduto(7L,"Produto 9", 17d, 2);
        cadastroProdutos.adicionarProduto(2L,"Produto 2", 11d, 1);

            System.out.println(cadastroProdutos.produtoSet);

            System.out.println(cadastroProdutos.exibirProdutosPorNome());
            System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        }
    }
