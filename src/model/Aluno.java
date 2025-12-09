package model;

import service.Relatorio;

public class Aluno extends Usuario implements Relatorio {
    private String matricula;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(String nome, String login, String senha, String matricula) {
        super(nome, login, senha);
        this.matricula = matricula;
    }

    @Override
    public String gerarRelatorio() {
        return "Nome: " + getNome() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Curso: " + getCurso().getNome();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
