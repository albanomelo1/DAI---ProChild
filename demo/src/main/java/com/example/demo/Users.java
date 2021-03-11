package com.example.demo;

public class Users {
    private int id_user;
    private String username;
    private String email;
    private String passsword;
    private String tipo;

    public Users() {
    }

    public Users(String username, String email, String passsword, String tipo) {
        this.username = username;
        this.email = email;
        this.passsword = passsword;
        this.tipo = tipo;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Users{" + "id_user=" + id_user + ", username=" + username + ", email=" + email + ", passsword=" + passsword + ", tipo=" + tipo + '}';
    }


}
