package br.ufjf.dcc193.bruno.quest;

import org.springframework.stereotype.Component;

@Component
public class Cavaleiro implements Heroi{

    public Cavaleiro(){
        System.out.println("O cavaleiro foi chamado");
    }

    public void agir(){
        System.out.println("O Cavaleiro agiu");
    }
}
