package br.com.pedro.reprodutormusical.Main;

import br.com.pedro.reprodutormusical.modelos.Musicas;
import br.com.pedro.reprodutormusical.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();

        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000 ; i++) {
            meuPodcast.curte();

        }
    }

}
