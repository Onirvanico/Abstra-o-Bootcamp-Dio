package br.com.projeto.bootcamp.dominio;

public class Curso extends Conteudo{

    private final int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public int caculaXp() {
        return XP_PADRAO + 40;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "título= " + getTitulo() +
                " descrição= " + getDescricao() +
                " cargaHoraria= " + cargaHoraria +
                '}';
    }
}
