package main.java.list;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;
    private Livro LivroPorTitulo;

    public CatalogoLivros() { this.livroList = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
        }
        public Livro pesquisarPorTitulo(String titulo) {
         Livro livroPorTitulo = null;
         if(!livroList.isEmpty()) {
             for(Livro l : livroList) {
                 if(l.getTitulo().equalsIgnoreCase(titulo)) {
                     LivroPorTitulo = l;
                     break;
                 }
             }
         }
         return LivroPorTitulo;
        }

        public static void main(String[] args) {
            CatalogoLivros catalogoLivros = new CatalogoLivros();
            catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
            catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
            catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
            catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
            catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

            System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
            System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
            System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        }


    }
