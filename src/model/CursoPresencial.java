package model;

public class CursoPresencial extends Curso {
    private String salaAula;

    public CursoPresencial() {
    }

    public CursoPresencial(String nome, String codigo, int cargaHoraria, String salaAula) {
        super(nome, codigo, cargaHoraria);
        this.salaAula = salaAula;
    }

    @Override
    public String detalharCurso() {
        return super.detalharCurso() + "\n" +
                "Sala Virtual: " + getSalaAula();
    }

    @Override
    public String gerarRelatorio() {
        return super.gerarRelatorio() + ", Sala de aula: " + getSalaAula();
    }

    public String getSalaAula() {
        return salaAula;
    }

    public void setSalaAula(String salaAula) {
        this.salaAula = salaAula;
    }
}
