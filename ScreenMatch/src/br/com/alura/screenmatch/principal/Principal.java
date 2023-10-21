package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Animes;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme Coraline = new Filme("Coraline e o mundo secreto", 2009);
        Coraline.setEstilo("Stop Motion");
        Coraline.setDuracaoEmMinutos(90);

        Coraline.exibeDadosFilme();

        Serie onePiece = new Serie("One piece a série", 2023);
        onePiece.setGenero("Ação e Aventura");
        onePiece.setTemporadas(1);
        onePiece.setEpisodiosPorTemporada(8);
        onePiece.setMinutosPorEpisodio(50);

        onePiece.exibeDadosSerie();

        Animes onePieceA = new Animes("One Piece", 1999 );
        onePieceA.setGenero("Shounen");
        onePieceA.setarcos(11);
        onePieceA.setEpisodiosPorTemporada(100);
        onePieceA.setMinutosPorEpisodio(24);
        onePieceA.setEpisodiosFillers(100);
        onePieceA.setEpisodiosFillersMinutos(24);

        onePieceA.exibeDadosAnime();
        System.out.println("Você demoraria: " + (onePieceA.getDuracaoEmMinutos() - onePieceA.getEpisodiosFillersMinutos())  + " minutos, para maratonar tudo" +
                ", O que em horas são: " + (onePieceA.getDuracaoEmMinutos() - onePieceA.getEpisodiosFillersMinutos()) / 60 +
                " e em dias são: " + (onePieceA.getDuracaoEmMinutos() - onePieceA.getEpisodiosFillersMinutos())  /60 / 24 + " assistindo SEM PARAR");

        Animes JoJos = new Animes("JoJo´s Bizarre Adventures", 2012);
        JoJos.setGenero("Shounen");
        JoJos.setarcos(5);
        JoJos.setEpisodiosPorTemporada(40);
        JoJos.setMinutosPorEpisodio(24);
        JoJos.setEpisodiosFillers(0);
        JoJos.setEpisodiosFillersMinutos(24);

        JoJos.exibeDadosAnime();

        Animes deathNote = new Animes("Death note", 2006);
        deathNote.setGenero("Shounen");
        deathNote.setarcos(1);
        deathNote.setEpisodiosPorTemporada(32);
        deathNote.setMinutosPorEpisodio(24);
        deathNote.setEpisodiosFillers(0);
        deathNote.setEpisodiosFillersMinutos(24);

        deathNote.exibeDadosAnime();
        System.out.println();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(Coraline);
        calculadora.inclui(onePiece);
        calculadora.inclui(onePieceA);
        calculadora.inclui(JoJos);
        calculadora.inclui(deathNote);
        System.out.println("\nVocê iria precisar de: " + (calculadora.getTempoTotal() /60)  /24 + " DIAS, vendo sem parar.");
        System.out.println();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
                filtro.filtra(Coraline);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(onePiece);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme mugenTrain = new Filme("Demon Slayer: Mugen Train", 2020);
        mugenTrain.setDuracaoEmMinutos(120);
        mugenTrain.avalia(9);

        Filme bubble = new Filme("Bubble", 2022);
        bubble.setDuracaoEmMinutos(100);
        bubble.avalia(8);

        Filme noivaCadaver = new Filme("Noiva Cadáver", 2005);
        noivaCadaver.setDuracaoEmMinutos(90);
        noivaCadaver.avalia(10);

        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(onePiece);
        System.out.println("\nTamanho da lista: " + listaDeSeries.size());
        System.out.println(listaDeSeries);

        ArrayList<Animes> listaDeAnimes = new ArrayList<>();
        listaDeAnimes.add(onePieceA);
        listaDeAnimes.add(JoJos);
        listaDeAnimes.add(deathNote);

        System.out.println("\nTamanho da lista: " + listaDeAnimes.size());
        System.out.println(listaDeAnimes);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(Coraline);
        listaDeFilmes.add(mugenTrain);
        listaDeFilmes.add(bubble);
        listaDeFilmes.add(noivaCadaver);
        System.out.println("\nTamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);


    }
}
