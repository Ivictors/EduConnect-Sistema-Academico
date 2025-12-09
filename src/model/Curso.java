package model;

import service.Relatorio;

public class Curso implements Relatorio {
    private String nome;
    private String codigo;
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String gerarRelatorio() {
        return "Nome: " + getNome() + ", Carga horaria: " + getCargaHoraria();
    }

    public String detalharCurso() {
        return "Nome Curso: " + getNome() + "\n" +
                "Codigo: " + (getCodigo()) + "\n" +
                "Carga Horaria: " + getCargaHoraria();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
