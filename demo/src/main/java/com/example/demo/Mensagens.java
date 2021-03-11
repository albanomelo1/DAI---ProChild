package com.example.demo;

import java.util.Date;

public class Mensagens {
    private int id_mensagem;
    private int id_user;
    private Date data;
    private String conteudo;
    private int id_topico;

    public Mensagens() {
    }

    public Mensagens(int id_user, Date data, String conteudo, int id_topico) {
        this.id_user = id_user;
        this.data = data;
        this.conteudo = conteudo;
        this.id_topico = id_topico;
    }

    public int getId_mensagem() {
        return id_mensagem;
    }

    public void setId_mensagem(int id_mensagem) {
        this.id_mensagem = id_mensagem;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getId_topico() {
        return id_topico;
    }

    public void setId_topico(int id_topico) {
        this.id_topico = id_topico;
    }

    @Override
    public String toString() {
        return "Mensagens{" + "id_mensagem=" + id_mensagem + ", id_user=" + id_user + ", data=" + data + ", conteudo=" + conteudo + ", id_topico=" + id_topico + '}';
    }






}
