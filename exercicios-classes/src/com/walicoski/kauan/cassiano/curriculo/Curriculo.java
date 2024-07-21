package com.walicoski.kauan.cassiano.curriculo;

import java.util.Arrays;

/*
 * Escreva uma classe chamada Curriculo para montar o seu currículo profissional. Ela deve ter atributos nome, idade, competencias e experiencias. 
 * 
 * Além disso, deve ter um método sobreMim que imprime um resumo do currículo da seguinte forma: "Olá, eu sou Giuliana, trabalho com [Java], 
 * e minhas experiências foram [Instrutora Online, Desenvolvedora]".
 * 
 * Esse exercício é para praticar a sintaxe de uso de uma classe com atributos e métodos, então aproveite para reforçar o conteúdo estudado!
 */

public class Curriculo {
    public String nome = "Cassiano"; // Se eu não usar o public nesses atributos para deixá-los visíveis, eu não vou conseguir acessar esse atributos se o método main estiver em outra pasta.
    public final Integer idade = 19; // Se eu usar o "final" essa váriavel(atributo) se tornara constante, ou seja não é possivel altera-la.
    public String[] competencias = {"Biodiesel", "ETE"};
    public String[] experiencias = {"Estudar Java", "YouTuber"};

    public String sobreMim() { // Se eu não usar o public nesse método para deixá-lo visível, eu não vou conseguir acessar esse método se o método main estiver em outra pasta
        return "Olá, eu sou " + nome + ", tenho " + idade + " anos, trabalho com " + Arrays.toString(competencias) + ", e minhas experiências foram " + Arrays.toString(experiencias);
    }
}

class Main {
    public static void main(String[] args) {
        Curriculo meuCurriculo = new Curriculo();

        String imprimirCurriculo = meuCurriculo.sobreMim();

        System.out.println(imprimirCurriculo);
    }
}