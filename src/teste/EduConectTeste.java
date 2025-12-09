package teste;

import model.*;
import repository.BD_Temp;
import ui.Menu;

import java.util.Scanner;

public class EduConectTeste {
    static Scanner sc = new Scanner(System.in);

    private static class Inicializacao {
        //        Curso curso0;
        CursoPresencial cursoPresencial1;
        CursoEAD cursoEAD1;
        Aluno aluno1;
        Aluno aluno2;
        Professor professor1;
        Turma turma1;
        Avaliacao avaliacao1;
    }

    public static void main(String[] args) {
        Inicializacao dadosIniciais = instancias();
        associacoes(dadosIniciais);
        testesBasicos(dadosIniciais);
        menuCadastroBD(dadosIniciais);
        menuRelatorios(dadosIniciais);
        gerarRelatorios(dadosIniciais);
    }


    private static Inicializacao instancias() {
        Inicializacao v = new Inicializacao();
        //v.curso0 = new Curso();
        v.cursoPresencial1 = new CursoPresencial("Cloud", "123", 5000, "1a");
        v.cursoEAD1 = new CursoEAD("ADS", "x1x1", 2600, "Studeo");
        v.aluno1 = new Aluno("Victor", "Victor@gmail.com", "victor123", "123456789");
        v.aluno1 = new Aluno("Marques", "Victor@outlook.com", "marques123", "987654321");
        v.professor1 = new Professor("Jose", "joseLogin@gmail", "abc", "Java", "00001111");
        v.turma1 = new Turma("xyz123", v.professor1, v.cursoEAD1, v.aluno1);
        v.avaliacao1 = new Avaliacao(v.aluno1, "Java");
        return v;
    }

    private static void testesBasicos(Inicializacao objeto) {
//        System.out.println(objeto.curso0.getNome());
//        System.out.println(objeto.curso0.getCodigo());
//        System.out.println(objeto.curso0.getCargaHoraria());
        System.out.println("\n====== DETALHES CURSO PRESENCIAL ======");
        System.out.println(objeto.cursoPresencial1.detalharCurso());

        System.out.println("\n======== DETALHES CURSO EAD =========");
        System.out.println(objeto.cursoEAD1.detalharCurso());

        System.out.println("\n======== RELATORIO PROFESSOR ========");
        System.out.println(objeto.professor1.gerarRelatorio());

        System.out.println("\n========== RELATORIO ALUNO ===========");
        System.out.println(objeto.aluno1.gerarRelatorio());

        System.out.println("\n========== RESUMO DA TURMA ==========");
        System.out.println(objeto.turma1.resumo());

        System.out.println("\n======== DETALHES AVALIAÇÃO =========");
        System.out.println("Descrição: " + objeto.avaliacao1.getDescricao());
    }

    private static void associacoes(Inicializacao objeto) {
        System.out.println("======== ASSOCIAÇÃO ========");
        objeto.turma1.addAlunos(objeto.aluno1);
        objeto.turma1.addAlunos(objeto.aluno2);
        objeto.turma1.removeAlunos(objeto.aluno2);
        objeto.turma1.setProfessor(objeto.professor1);
        objeto.turma1.setCurso(objeto.cursoPresencial1);
        objeto.aluno1.setCurso(objeto.cursoPresencial1);
        objeto.turma1.avaliarAluno(objeto.avaliacao1);
    }

    private static void gerarRelatorios(Inicializacao objeto) {
        objeto.aluno1.gerarRelatorio();
        objeto.professor1.gerarRelatorio();
        objeto.cursoEAD1.gerarRelatorio();
        objeto.cursoPresencial1.gerarRelatorio();
    }

    public static void menuCadastroBD(Inicializacao objeto) {
        int op;
        do {
            Menu.menuCadastro();
            op = sc.nextInt();
            switch (op) {
                case 1 -> BD_Temp.cadastroAlunos(objeto.aluno1);
                case 2 -> BD_Temp.cadastroProfessor(objeto.professor1);
                case 3 -> BD_Temp.cadastroCursoPresencial(objeto.cursoPresencial1);
                case 4 -> BD_Temp.cadastroCursoEad(objeto.cursoEAD1);
                case 5 -> BD_Temp.cadastroTurma(objeto.turma1);
                case 6 -> BD_Temp.cadastroAvaliacao(objeto.avaliacao1);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção invalida");
            }
        } while (op != 0);
    }

    private static void menuRelatorios(Inicializacao objetos) {
        int op;
        do {
           Menu.menuRelatorio();
            op = sc.nextInt();
            switch (op) {
                case 1 -> System.out.println(objetos.aluno1.gerarRelatorio());
                case 2 -> System.out.println(objetos.professor1.gerarRelatorio());
                case 3 -> System.out.println(objetos.cursoPresencial1.gerarRelatorio());
                case 4 -> System.out.println(objetos.cursoEAD1.gerarRelatorio());
                case 0 -> System.out.println("Saindo ...");
                default -> System.out.println("Opção invalida, entre com o valor correspondente!");
            }
        } while (op != 0);
    }
}
