package com.example.demo;

public class Instituicoes extends Users {
    private int id_instituicao;
    private String nome;
    private String localizacao;
    private String concelho;
    private String tipo;
    private int id_user;

    public Instituicoes() {
    }

    public Instituicoes(String nome, String localizacao, String concelho, String tipo, int id_user) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.concelho = concelho;
        this.tipo = tipo;
        this.id_user = id_user;
    }

    public int getId_instituicao() {
        return id_instituicao;
    }

    public void setId_instituicao(int id_instituicao) {
        this.id_instituicao = id_instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Instituicoes{" + "id_instituicao=" + id_instituicao + ", nome=" + nome + ", localizacao=" + localizacao + ", concelho=" + concelho + ", tipo=" + tipo + ", id_user=" + id_user + '}';
    }


}
