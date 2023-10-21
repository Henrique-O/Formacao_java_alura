package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.awt.image.FilteredImageSource;
import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme Coraline = new Filme("Coraline e o mundo secreto", 2009);
        Coraline.avalia(10);
        Filme mugenTrain = new Filme("Demon Slayer: Mugen Train", 2020);
        mugenTrain.avalia(9);
        Filme bubble = new Filme("Bubble", 2022);
        bubble.avalia(8);
        Filme noivaCadaver = new Filme("Noiva Cadáver", 2005);
        noivaCadaver.avalia(10);
        Serie onePiece = new Serie("One piece a série", 2023);

        List<Titulo> lista = new LinkedList<>();
        lista.add(Coraline);
        lista.add(mugenTrain);
        lista.add(bubble);
        lista.add(noivaCadaver);
        lista.add(onePiece);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Henrique");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Rafaella");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
