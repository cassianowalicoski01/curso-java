package com.walicoski.kauan.cassiano.jogo_de_monstros;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cassiano");
        Jogador jogador2 = new Jogador("Aldimara");
        Jogador jogador3 = new Jogador("Osmar");
        Jogador jogador4 = new Jogador("Thomaz");

        Jogador[] listaDeJogadores = {jogador1, jogador2, jogador3, jogador4};
    
        JogoDeMonstros jogar = new JogoDeMonstros();
        jogar.iniciarJogo(listaDeJogadores);

        for (Jogador jogador : listaDeJogadores) {
            System.out.println(jogador.placarIndividual);
        }
        
        System.out.println(Jogador.placarGeral);
    }  
}