package model;

public class CursoEAD extends Curso{
    private String plataformaVirtual;

    public CursoEAD() {
    }

    public CursoEAD(String nome, String codigo, int cargaHoraria, String plataformaVirtual) {
        super(nome, codigo, cargaHoraria);
        this.plataformaVirtual = plataformaVirtual;
    }

    @Override
    public String detalharCurso() {
        return super.detalharCurso() + "\n" +
        "Plataforma Virtual: " + getPlataformaVirtual();
    }

    @Override
    public String gerarRelatorio() {
        return super.gerarRelatorio() + ", Plataforma Virtual: " +  getPlataformaVirtual();
    }

    public String getPlataformaVirtual() {
        return plataformaVirtual;
    }

    public void setPlataformaVirtual(String plataformaVirtual) {
        this.plataformaVirtual = plataformaVirtual;
    }
}
