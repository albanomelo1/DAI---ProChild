package com.example.demo;

import java.util.Arrays;

public class Jogos {

    private int id_jogo;
    private String nome;
    private byte[] imagem;
    private String descricao;
    private String regras;

    public Jogos() {
    }

    public Jogos(int id_jogo, String nome, byte[] imagem, String descricao, String regras) {
        this.id_jogo = id_jogo;
        this.nome = nome;
        this.imagem = imagem;
        this.descricao = descricao;
        this.regras = regras;
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "id_jogo=" + id_jogo +
                ", nome='" + nome + '\'' +
                ", imagem=" + Arrays.toString(imagem) +
                ", descricao='" + descricao + '\'' +
                ", regras='" + regras + '\'' +
                '}';
    }
}
