package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {
    private String codigo;
    private Professor professor;
    private Curso curso;
    private List<Aluno> alunoList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Turma() {
    }

    public Turma(String codigo, Professor professor, Curso curso, Aluno aluno) {
        this.codigo = codigo;
        this.professor = professor;
        this.curso = curso;
        this.alunoList.add(aluno
        );
    }

    public void addAlunos(Aluno aluno) {
//        if (alunoList.contains(aluno)) throw new IllegalArgumentException("Aluno ja cadastrado na turma!");
        this.alunoList.add(aluno);
        System.out.println("Aluno adicionado a turma com sucesso.");
    }

    public void removeAlunos(Aluno aluno) {
//        if (!alunoList.contains(aluno)) throw new NoSuchElementException("Aluno não encontrado.");
        alunoList.remove(aluno);
        System.out.println("Aluno removido com sucesso.");
    }

    public String resumo() {
        return "Curso Vinculado: " + curso.getNome() + "\n" +
                "Professor Responsável: " + professor.getNome() + "\n" +
                "Código da Turma: " + getCodigo() + "\n" +
                "Total de Alunos: " + getAlunoList().size();
    }

    public void avaliarAluno(Avaliacao avaliacao) {
        System.out.printf("Entre com uma nota de 0 a 10.00 para o aluno %s\n", avaliacao.getAluno().getNome());
        avaliacao.atribuirNota(sc.nextDouble());
        System.out.printf("Avaliação: %s\nNota: %.2f", avaliacao.getAluno().getNome(), avaliacao.getNota());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }
}
