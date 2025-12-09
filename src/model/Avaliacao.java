package model;

public class Avaliacao {
    private String descricao;
    private double nota;
    private Aluno aluno;

    public Avaliacao() {
    }

    public Avaliacao(Aluno aluno, String descricao) {
        this.aluno = aluno;
        this.descricao = descricao;
        this.nota = -1;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void atribuirNota(double valor) {
        if (valor < 0 || valor > 10 ) {
            throw new IllegalArgumentException("Entre com uma nota entre 0 e 10.00");
        }
        this.nota = valor;
    }

    public Aluno getAluno() {
        return aluno;
    }
}
