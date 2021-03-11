package com.example.demo;

public class Topicos {

    private int id_topico;
    private String nome;
    private String descricao;
    private int id_instituicao;

    public Topicos() {
    }

    public Topicos(int id_topico, String nome, String descricao, int id_instituicao) {
        this.id_topico = id_topico;
        this.nome = nome;
        this.descricao = descricao;
        this.id_instituicao = id_instituicao;
    }

    public int getId_topico() {
        return id_topico;
    }

    public void setId_topico(int id_topico) {
        this.id_topico = id_topico;
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

    public int getId_instituicao() {
        return id_instituicao;
    }

    public void setId_instituicao(int id_instituicao) {
        this.id_instituicao = id_instituicao;
    }

    @Override
    public String toString() {
        return "Topicos{" +
                "id_topico=" + id_topico +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", id_instituicao=" + id_instituicao +
                '}';
    }
}
