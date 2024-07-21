package com.walicoski.kauan.cassiano.curriculo;

import java.util.Arrays;

public class Curriculo {
    public String nome = "Cassiano"; // Se eu não usar o public nesses atributos para deixá-los visíveis, eu não vou conseguir acessar esse atributos se o método main estiver em outra pasta.
    public final Integer idade = 19; // Se eu usar o "final" essa váriavel(atributo) se tornara constante, ou seja não é possivel altera-la.
    public String[] competencias = {"Biodiesel", "ETE"};
    public String[] experiencias = {"Estudar Java", "YouTuber"};

    public String sobreMim() { // Se eu não usar o public nesse método para deixá-lo visível, eu não vou conseguir acessar esse método se o método main estiver em outra pasta
        return "Olá, eu sou " + nome + ", tenho " + idade + " anos, trabalho com " + Arrays.toString(competencias) + ", e minhas experiências foram " + Arrays.toString(experiencias);
    }
}