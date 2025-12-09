package repository;


import model.*;

import java.util.ArrayList;
import java.util.List;

public class BD_Temp {
    private static List<Turma> turmaList = new ArrayList<>();
    private static List<CursoPresencial> cursoPresencialList = new ArrayList<>();
    private static List<CursoEAD> cursoEADList = new ArrayList<>();
    private static List<Professor> professorList = new ArrayList<>();
    private static List<Aluno> alunoList = new ArrayList<>();
    private static List<Avaliacao> avaliacaoList = new ArrayList<>();

    public static void cadastroTurma(Turma turma) {
        turmaList.add(turma);
        System.out.println("Turma cadastrada com sucesso!");
    }

    public static void removeTurma(Turma turma) {
        turmaList.remove(turma);
        System.out.println("Turma removida com sucesso!");
    }

    public static void cadastroAlunos(Aluno aluno) {
        alunoList.add(aluno);
        System.out.println("Aluno cadastrado com sucesso");
    }

    public static void removeAlunos(Aluno aluno){
        alunoList.remove(aluno);
        System.out.println("Aluno removido com sucesso");
    }

    public static void cadastroProfessor(Professor professor) {
        professorList.add(professor);
        System.out.println("Professor adicionado com sucesso");
    }

    public static void removeProfessor(Professor professor) {
        professorList.remove(professor);
        System.out.println("Professor removido com sucesso");
    }

    public static void cadastroCursoPresencial(CursoPresencial curso) {
        cursoPresencialList.add(curso);
        System.out.println("Curso cadastrado com sucesso!");
    }

    public static void removeCursoPresencial(CursoPresencial curso) {
        cursoPresencialList.remove(curso);
        System.out.println("Curso removido com sucesso!");
    }

    public static void cadastroCursoEad(CursoEAD curso) {
        cursoEADList.add(curso);
        System.out.println("Curso cadastrado com sucesso!");
    }

    public static void removeCursoEad(CursoEAD curso) {
        cursoEADList.remove(curso);
        System.out.println("Curso removido com sucesso!");
    }

    public static void cadastroAvaliacao(Avaliacao avaliacao) {
        if (avaliacaoList.contains(avaliacao)) {
            throw new IllegalArgumentException("Avaliação ja cadastrada no nosso sistema!");
        }
        avaliacaoList.add(avaliacao);
        System.out.println("Avaliação cadastrada com sucesso!");
    }

    public static void removeAvaliacao(Avaliacao avaliacao) {
        if (!avaliacaoList.contains(avaliacao)) {
            throw new IllegalArgumentException("Avaliação não existe em nosso sistema!");
        }
        avaliacaoList.remove(avaliacao);
        System.out.println("Avaliação removida com sucesso!");
    }

    public static List<Turma> getTurmaList() {
        return turmaList;
    }

    public static List<CursoPresencial> getCursoPresencialList() {
        return cursoPresencialList;
    }

    public static List<CursoEAD> getCursoEADList() {
        return cursoEADList;
    }

    public static List<Professor> getProfessorList() {
        return professorList;
    }

    public static List<Aluno> getAlunoList() {
        return alunoList;
    }

    public static List<Avaliacao> getAvaliacaoList() {
        return avaliacaoList;
    }
}
