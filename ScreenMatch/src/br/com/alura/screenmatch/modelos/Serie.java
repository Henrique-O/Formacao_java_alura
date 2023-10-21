package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public void exibeDadosSerie() {
        System.out.println("\n################# " + this.getNome() + " ####################\n");
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Total de temporadas/Arcos: " + this.getTemporadas());
        System.out.println("Tem em média: " + this.getEpisodiosPorTemporada() + " episodios por arco");
        System.out.println("Cada episodio tem ao todo: " + this.getMinutosPorEpisodio() + " minutos");
        System.out.println("Você demoraria: " + this.getDuracaoEmMinutos() + " minutos, para maratonar tudo, O que em horas são: " + this.getDuracaoEmMinutos() / 60 + " e em dias são: " + (this.getDuracaoEmMinutos() /60) / 24 + " assistindo SEM PARAR");
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
}
