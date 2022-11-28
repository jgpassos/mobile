package com.example.tp2_blackjack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JogoActivity extends AppCompatActivity {

    private Button button_sortear;
    private Button button_passarvez;

    private TextView placarJogadorTxt;
    private TextView placarMaquina1Txt;
    private TextView placarMaquina2Txt;
    private TextView placarMaquina3Txt;

    private ImageView carta_sorteada;
    private ImageView cartaJogadorImg;
    private ImageView cartaMaquina1Img;
    private ImageView cartaMaquina2Img;
    private ImageView cartaMaquina3Img;

    private Random rand = new Random();

    private JogarActivity partida;
    private JogoControlerActivity jogoControler;

    int cartaTirada = 0, ultimaTirada = 0;

    // Vetor com as imagens que serão sorteadas aleatóriamente:

    int[] cartasImg = {R.drawable.a, R.drawable.carta2, R.drawable.carta3, R.drawable.carta4,
            R.drawable.carta5, R.drawable.carta6, R.drawable.carta7, R.drawable.carta8,
            R.drawable.carta9, R.drawable.carta10, R.drawable.j, R.drawable.k, R.drawable.q};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        rand = new Random();

        // Referenciando os componentes do layout aos atributos (botoes)

        button_sortear = findViewById(R.id.button_sortear);
        button_passarvez = findViewById(R.id.button_sortear);

        // Referenciando os componentes do layout aos atributos (placar dos jogadores)

        this.placarJogadorTxt = findViewById(R.id.seu_placar);
        this.placarMaquina1Txt = findViewById(R.id.placar_maquina1);
        this.placarMaquina2Txt = findViewById(R.id.placar_maquina2);
        this.placarMaquina3Txt = findViewById(R.id.placar_maquina3);
        //this.cartaSorteadaImg = findViewById(R.id.carta_sorteada);

        // Referenciando os componentes do layout aos atributos (cartas sorteadas)

        this.cartaJogadorImg = findViewById(R.id.sua_carta);
        this.cartaMaquina1Img = findViewById(R.id.carta_maquina1);
        this.cartaMaquina2Img = findViewById(R.id.carta_maquina2);
        this.cartaMaquina3Img = findViewById(R.id.carta_maquina3);

        // Configuando inicio da partida:

        this.partida = new JogarActivity();
        this.jogoControler = new JogoControlerActivity(this.partida);

        this.button_sortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Evita que saiam cartas repetidas:
                cartaTirada = rand.nextInt(cartasImg.length);
                do {
                    ultimaTirada = rand.nextInt(cartasImg.length);
                } while (cartaTirada == ultimaTirada);

                // Exibe na tela a carta sorteada:
                ultimaTirada = cartaTirada;
                carta_sorteada.setImageResource(cartasImg[cartaTirada]);
            }
        });

        this.button_passarvez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {partida.pararJogada();}
        });

        configuraInicioJogo();
    }

    private void configuraInicioJogo() {
        // Se o jogador não for humano invocamos o método que toma as decisões:
        if(!partida.getJogadorVez().isHumano()) {
            jogadasCPUs();
        }
    }

    private void atualizaParcialUltCartas() {}

    private void jogadasCPUs() {
        Handler handler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                int probabilidade = rand.nextInt(100);
                Toast.makeText(JogoActivity.this, ""
                        + probabilidade, Toast.LENGTH_SHORT).show();
                if(probabilidade <= 49 || partida.getJogadorVez().getPlacarParcial() == 0) {
                    //sorteio();
                }
            }
        };
    }

    /*
    new Thread() {
        public void run() {
            try {
                Thread.sleep(2000);
                handler.sendEmptyMessage(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }.start();
     */
}