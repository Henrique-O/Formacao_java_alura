package br.com.alura.screenmatch.modelos;

import java.sql.SQLOutput;

public class Animes extends Titulo{
    private int arcos;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private  int episodiosFillers;
    private int episodiosFillersMinutos;

    public Animes(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getarcos() {
        return arcos;
    }

    public void setarcos(int arcos) {
        this.arcos = arcos;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getEpisodiosFillers() {
        return episodiosFillers;
    }

    public void setEpisodiosFillers(int episodiosFillers) {
        this.episodiosFillers = episodiosFillers;
    }

    public int getEpisodiosFillersMinutos() {
        return episodiosFillersMinutos * episodiosFillers;
    }

    public void setEpisodiosFillersMinutos(int episodiosFillersMinutos) {
        this.episodiosFillersMinutos = episodiosFillersMinutos;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return arcos * episodiosPorTemporada * minutosPorEpisodio;
    }

    public void exibeDadosAnime() {
        System.out.println("\n################# " + this.getNome() + " ####################\n");
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Total de temporadas/Arcos: " + this.getarcos());
        System.out.println("Tem em média: " + this.getEpisodiosPorTemporada() + " episodios por arco");
        System.out.println("Tem mais de: " + this.getEpisodiosFillers() + " episodios fillers");
        System.out.println("Cada episodio tem ao todo: " + this.getMinutosPorEpisodio() + " minutos");
        System.out.println("Você demoraria: " + this.getDuracaoEmMinutos() + " minutos, para maratonar tudo, O que em horas são: " + this.getDuracaoEmMinutos() / 60 + " e em dias são: " + (this.getDuracaoEmMinutos() /60) / 24 + " assistindo SEM PARAR");
    }

    @Override
    public String toString() {
        return "Anime: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
}


