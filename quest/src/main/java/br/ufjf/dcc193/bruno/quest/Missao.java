package br.ufjf.dcc193.bruno.quest;

public class Missao {

    private Cavaleiro cavaleiro;

    public Missao(Cavaleiro cavaleiro){
        System.out.println("O Rei criou uma nova missao");
        setCavaleiro(cavaleiro);
    }

    public Missao(){
        this(null);
    }

    public void iniciar(){
        System.out.println("Iniciou missão");
    }

    public Cavaleiro getCavaleiro() {
        return cavaleiro;
    }

    public void setCavaleiro(Cavaleiro cavaleiro) {
        this.cavaleiro = cavaleiro;
    }

    public void concluir(){
        cavaleiro.agir();
        System.out.println("Concluiu missao");
    }
}
