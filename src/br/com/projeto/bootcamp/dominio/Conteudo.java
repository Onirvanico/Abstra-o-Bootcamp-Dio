package br.com.projeto.bootcamp.dominio;

public abstract class Conteudo {

    protected static int XP_PADRAO = 20;
    private final String titulo;
    private final String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract int caculaXp();
}
