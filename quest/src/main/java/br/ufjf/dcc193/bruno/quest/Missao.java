package br.ufjf.dcc193.bruno.quest;

public class Missao {

    private Cavaleiro cavaleiro;

    public Missao(){
        System.out.println("A missao foi construida");
        this.cavaleiro = new Cavaleiro();
    }

    public void iniciar(){
        System.out.println("Iniciou missão");
    }

    public void concluir(){
        cavaleiro.agir();
        System.out.println("Concluiu missao");
    }
}
