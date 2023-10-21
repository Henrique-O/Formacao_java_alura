package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
    private String estilo;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void exibeDadosFilme() {
        System.out.println("\n################# " + this.getNome() + " ####################\n");
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Estilo do filme: " + getEstilo());
        System.out.println("Você demoraria: " + this.getDuracaoEmMinutos() + " minutos para assistir");
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
}
