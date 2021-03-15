package com.example.demo;

import java.util.Date;

public class Denuncias {

    private int id_denuncia;
    private String localizacao;
    private Date data;
    private String acontecimento;

    public Denuncias() {
    }

    public Denuncias(int id_denuncia, String localizacao, Date data, String acontecimento) {
        this.id_denuncia = id_denuncia;
        this.localizacao = localizacao;
        this.data = data;
        this.acontecimento = acontecimento;
    }

    public int getId_denuncia() {
        return id_denuncia;
    }

    public void setId_denuncia(int id_denuncia) {
        this.id_denuncia = id_denuncia;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAcontecimento() {
        return acontecimento;
    }

    public void setAcontecimento(String acontecimento) {
        this.acontecimento = acontecimento;
    }

    @Override
    public String toString() {
        return "Denuncias{" +
                "id_denuncia=" + id_denuncia +
                ", localizacao='" + localizacao + '\'' +
                ", data=" + data +
                ", acontecimento='" + acontecimento + '\'' +
                '}';
    }

}
