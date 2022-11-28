package com.example.tp2_blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class JogarActivity extends AppCompatActivity {

    private JogadorActivity jogadores[];
    private int vez;
    private boolean status;

    public JogarActivity() {
        JogadorActivity arrayJogadores[] = {new JogadorActivity("VOCÊ", true),
                                            new JogadorActivity("JOGADOR 1", false),
                                            new JogadorActivity("JOGADOR 2", false),
                                            new JogadorActivity("JOGADOR 3", false),};

        this.jogadores = arrayJogadores;
        this.status = true;
        sorteioJogadorInicial();
    }

    public JogarActivity(JogadorActivity[] jogadores) {
        this.jogadores = jogadores;
        this.status = true;
    }

    private void sorteioJogadorInicial() {
        Random rand = new Random();
        // Sorteia entre os 4 jogadores:
        this.vez = rand.nextInt(4);
    }

    public JogadorActivity getJogadorVez() {return this.jogadores[vez];}

    public void pararJogada() {
        if(vez == 0) {
            Random rand = new Random();
            // Sorteia entre os 4 jogadores:
            this.vez = rand.nextInt(4);
        }
        else if(vez == 1) {
            Random rand = new Random();
            // Sorteia entre os 4 jogadores:
            this.vez = rand.nextInt(4);
        }
        else if(vez == 2) {
            Random rand = new Random();
            // Sorteia entre os 4 jogadores:
            this.vez = rand.nextInt(4);
        }
        else if(vez == 3) {
            Random rand = new Random();
            // Sorteia entre os 4 jogadores:
            this.vez = rand.nextInt(4);
        }
    }
}