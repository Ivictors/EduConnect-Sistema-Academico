package model;

import service.Relatorio;

public class Professor extends Usuario implements Relatorio {
    private String especialidade;
    private String registro;

    public Professor() {
    }

    public Professor(String nome, String login, String senha, String especialidade, String registro) {
        super(nome, login, senha);
        this.especialidade = especialidade;
        this.registro = registro;
    }

    @Override
    public String gerarRelatorio() {
        return  "Nome: " + getNome() + "\n" +
                "Especialidade: " + getEspecialidade() + "\n" +
                "Registro: " + getRegistro();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
