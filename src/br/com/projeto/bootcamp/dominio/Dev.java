package br.com.projeto.bootcamp.dominio;

import java.util.*;

public class Dev {
    private final String nome;
    private final Set<Conteudo> conteudosInscritos;
    private final Set<Conteudo> conteudosConcluidos;

    public Dev(String nome, Set<Conteudo> conteudosInscritos) {
        this.nome = nome;
        this.conteudosInscritos = conteudosInscritos;
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    public void entrarNoBootcamp(Bootcamp bootcamp) {
         conteudosInscritos.addAll(bootcamp.getConteudos());
         bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream()
                .findFirst();
        if(conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else
            System.err.print("Não há mais conteúdos inscritos para sua progressão");
    }

    public Integer calcularTotalXP() {
        return conteudosConcluidos.stream().mapToInt(Conteudo::caculaXp).sum();
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
