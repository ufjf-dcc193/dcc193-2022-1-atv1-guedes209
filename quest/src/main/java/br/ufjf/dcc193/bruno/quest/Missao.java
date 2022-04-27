package br.ufjf.dcc193.bruno.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Missao {
    @Autowired
    private Heroi heroi;

    public Missao(Heroi heroi){
        System.out.println("O Rei criou uma nova missao");
        setHeroi(heroi);
    }

    public Missao(){
        this(null);
    }

    public void iniciar(){
        System.out.println("Iniciou missão");
    }

    public Heroi getHeroi() {
        return heroi;
    }

    public void setHeroi(Heroi heroi) {
        this.heroi = heroi;
    }

    public void concluir(){
        heroi.agir();
        System.out.println("Concluiu missao");
    }
}
