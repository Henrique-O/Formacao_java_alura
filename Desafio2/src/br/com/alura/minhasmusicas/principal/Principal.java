package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Under the tree");
        musica1.setCantor("Banda SiM");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();

        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Entrevistando o Henrique");
        podcast1.setApresentador("Flow Podcast");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);


    }
}
