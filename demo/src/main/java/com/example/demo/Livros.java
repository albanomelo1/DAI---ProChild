package com.example.demo;

public class Livros {
    private int id_livro;
    private String nome;
    private String descricao;
    private String link;
    private byte[] capa;

    public Livros() {
    }

    public Livros(String nome, String descricao, String link, byte[] capa) {
        this.nome = nome;
        this.descricao = descricao;
        this.link = link;
        this.capa = capa;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
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

    public byte[] getCapa() {
        return capa;
    }

    public void setCapa(byte[] capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Livros{" + "id_livro=" + id_livro + ", nome=" + nome + ", descricao=" + descricao + ", link=" + link + ", capa=" + capa + '}';
    }


}
