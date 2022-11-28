package com.example.tp2_blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class JogoControlerActivity extends AppCompatActivity {

    private JogarActivity partidaCorrente;

    public JogoControlerActivity(JogarActivity partida) {this.partidaCorrente = partida;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_controler);
    }

    // O retorno indica se o jogador atual continua jogando:

    public boolean sorteio(int valorCarta) {
        JogadorActivity jogadorVez = partidaCorrente.getJogadorVez();



        return true;
    }

    // O retorno indica se o jogador venceu ou não:

    public boolean guardar() {
        JogadorActivity jogadorVez = partidaCorrente.getJogadorVez();

        // Aqui calcula o jogador vencedor
        return true;
    }
}