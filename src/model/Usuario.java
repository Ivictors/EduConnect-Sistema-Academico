package model;

import service.Autenticacao;

public class Usuario implements Autenticacao {
    private String nome;
    private String login;
    private String senha;

    public Usuario() {

    }

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public void autenticar(String tentativaLogin, String tentativaSenha){
        if (!tentativaLogin.equals(this.login) && !tentativaSenha.equals(this.senha)){
            throw new IllegalArgumentException("Não foi possivel autenticar, dados invalidos!");
        }
        System.out.println("Autenticação bem sucedida.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
