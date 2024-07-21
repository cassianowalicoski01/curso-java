package com.walicoski.kauan.cassiano.jogo_de_monstros;

/*
 * Classe JogoDeMonstros:
 * 
 * Crie uma classe JogoDeMonstros com o método iniciarJogo, que recebe como parâmetro uma lista de jogadores, percorre essa lista e invoca para cada jogador o método derrotarMonstro.
 * 
 * Ex: Após executar o iniciarJogo com 2 jogadores, o placar individual de cada jogador será 1 e o placar geral será 2.
 */

public class JogoDeMonstros {
    
    public void iniciarJogo(Jogador[] listaJogadores) {

        for (Jogador jogador : listaJogadores) {
            jogador.derrotarMonstro();
        }
    }
}