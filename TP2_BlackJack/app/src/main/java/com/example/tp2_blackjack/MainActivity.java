package com.example.tp2_blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // método para que os botões possam acessar a tela Jogar:
    public void telaJogar(View view) {
        Intent intent = new Intent(this, JogoActivity.class);
        startActivity(intent);
    }

    // método para que os botões possam acessar a tela Regras:
    public void telaRegras(View view) {
        Intent intent = new Intent(this, RegrasActivity.class);
        startActivity(intent);
    }
}