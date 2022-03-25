package br.com.projeto.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private final LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public int caculaXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                " título= " + getTitulo() +
                " descrição= " + getDescricao() +
                " data=" + data +
                '}';
    }
}
