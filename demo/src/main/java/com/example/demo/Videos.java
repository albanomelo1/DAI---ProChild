package com.example.demo;

import java.util.Arrays;

public class Videos {

    private int id_video;
    private String nome;
    private String descricao;
    private String link;
    private byte[] thumbnail;

    public Videos() {
    }

    public Videos(String nome, String descricao, String link, byte[] thumbnail) {
        this.id_video = id_video;
        this.nome = nome;
        this.descricao = descricao;
        this.link = link;
        this.thumbnail = thumbnail;
    }

    public int getId_video() {
        return id_video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Videos{" +
                "id_video=" + id_video +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", link='" + link + '\'' +
                ", thumbnail=" + Arrays.toString(thumbnail) +
                '}';
    }
}
