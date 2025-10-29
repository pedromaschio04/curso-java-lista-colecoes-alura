package br.com.alura.screenmatch.main;

import java.util.ArrayList;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

public class MainWithLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(5);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Matrix",1999);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000);
        
        //Lista somente de filmes
        // ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        // listaDeFilmes.add(filmeDoPaulo);
        // listaDeFilmes.add(meuFilme);
        // listaDeFilmes.add(outroFilme);
        // System.out.println(listaDeFilmes);
        
        //Lista que recebe tudo que herda de titulo
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filmeDoPaulo);
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(outroFilme);
        listaDeTitulos.add(lost);
        // forEach padrão
        for (Titulo t : listaDeTitulos) {
            System.out.println(t);

            // valida se o tipo do objeto e cria umea variavel fazendo cast
            // criação da variável foi implementada no java 14
            if(t instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // forEach da interface List
        // listaDeTitulos.forEach(t -> System.out.println(t));

        // forEach da interface List com method reference
        // listaDeTitulos.forEach(System.out::println);
        // :: faz referência ao método println
    }
}
