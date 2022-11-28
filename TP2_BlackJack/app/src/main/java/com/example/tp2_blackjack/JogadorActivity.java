package com.example.tp2_blackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Vector;

public class JogadorActivity extends AppCompatActivity {

    private String nome;
    private int placarTotal;
    private int placarParcial;
    private Vector<Integer> ultimasCartas;
    private boolean humano;

    public JogadorActivity(String nome, boolean humano) {
        this.nome = nome;
        this.humano = humano;
        this.ultimasCartas = new Vector<>();
    }

    public boolean isHumano() {return humano;}

    public int getPlacarTotal() {return placarTotal;}

    public int getPlacarParcial() {return placarParcial;}

    // Abaixo implementar a logica e regras dos pontos obtidos:


}