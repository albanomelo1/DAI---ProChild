package com.example.demo;

public class Familias extends Users {
    private int id_familia;
    private String nome;
    private String sexo;
    private String localizacao;
    private String concelho;
    private int id_user;

    public Familias() {
    }

    public Familias(String nome, String sexo, String localizacao, String concelho, int id_user) {
        this.nome = nome;
        this.sexo = sexo;
        this.localizacao = localizacao;
        this.concelho = concelho;
        this.id_user = id_user;
    }

    public int getId_familia() {
        return id_familia;
    }

    public void setId_familia(int id_familia) {
        this.id_familia = id_familia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Familias{" + "id_familia=" + id_familia + ", nome=" + nome + ", sexo=" + sexo + ", localizacao=" + localizacao + ", concelho=" + concelho + ", id_user=" + id_user + '}';
    }


}
