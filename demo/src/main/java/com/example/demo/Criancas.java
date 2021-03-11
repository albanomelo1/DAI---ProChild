package com.example.demo;

public class Criancas extends Users {
    private int id_crianca;
    private String sexo;
    private String faixa_etaria;
    private String localizacao;
    private int id_user;

    public Criancas() {
    }

    public Criancas(String sexo, String faixa_etaria, String localizacao, int id_user) {
        this.sexo = sexo;
        this.faixa_etaria = faixa_etaria;
        this.localizacao = localizacao;
        this.id_user = id_user;
    }

    public int getId_crianca() {
        return id_crianca;
    }

    public void setId_crianca(int id_crianca) {
        this.id_crianca = id_crianca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFaixa_etaria() {
        return faixa_etaria;
    }

    public void setFaixa_etaria(String faixa_etaria) {
        this.faixa_etaria = faixa_etaria;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Criancas{" +
                "id_crianca=" + id_crianca +
                ", sexo='" + sexo + '\'' +
                ", faixa_etaria='" + faixa_etaria + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", id_user=" + id_user +
                '}';
    }
}
