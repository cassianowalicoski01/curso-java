package com.walicoski.kauan.cassiano.jogo_de_monstros;

/*
 * Você deve criar um Jogo de Monstros cooperativo, da seguinte forma:
 * 
 * Classe Jogador:
 * 
 * Crie uma classe Jogador com os atributos nome, placarGeral e placarIndividual. 
 * O placar individual vai pertencer a cada jogador do time, já o placar geral pertence a todo o time e é a soma das suas pontuações.
 * 
 * Crie um construtor que inicializa o nome do Jogador.
 * 
 * Crie um método derrotarMonstro que incrementa o placar individual e o placar geral em 1.
 * 
 * Sobrescreva o método equals que verifica se um jogador é igual ao outro checando o seu nome.
 */

public class Jogador {
    public String nome;
    public static int placarGeral; // Uma variável estática (pertencente à classe, não a uma instância específica) isso significa que eu não preciso usar um objeto para usar esse atributo, basta usar a class.placarGeral
    public int placarIndividual;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void derrotarMonstro() {
        this.placarIndividual += 1;
        placarGeral += 1;
    }

    public boolean equals(Object jogador) {
        return this.nome.equals(((Jogador) jogador).nome); 
    }
}
