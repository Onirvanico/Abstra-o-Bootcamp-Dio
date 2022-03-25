package br.com.projeto.bootcamp;

import br.com.projeto.bootcamp.dominio.Bootcamp;
import br.com.projeto.bootcamp.dominio.Curso;
import br.com.projeto.bootcamp.dominio.Dev;
import br.com.projeto.bootcamp.dominio.Mentoria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Teste {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Android", "Curso do básico ao avancado", 36);
        Curso curso2 = new Curso("Kotlin", "Curso do básico ao avancado", 20);
        Curso curso3 = new Curso("Angular", "Domine este framework", 20);
        Curso curso4 = new Curso("Orientação a objetos", "Conceitos de herança, polimorfismo e abstração do domíno do problema", 20);

        Mentoria mentoria1 = new Mentoria("Designer Patterns", "Evolua seus projetos", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Threads", "Trabalhando de forma assínscrona", LocalDate.now().plusWeeks(4));

        Bootcamp bootcamp1 = new Bootcamp("Desenvolvedor Mobile Android", "Desafios empolgantes no desenvolvimento de aplicativos");
        Bootcamp bootcamp2 = new Bootcamp("Desenvolvedor Mobile IOS", "Curta essa vibe");

        bootcamp1.getConteudos().add(curso4);
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);

        bootcamp2.getConteudos().add(curso4);
        bootcamp2.getConteudos().add(mentoria1);
        bootcamp2.getConteudos().add(mentoria2);

        Dev dev1 = new Dev("Cristiano", bootcamp1.getConteudos());
        dev1.entrarNoBootcamp(bootcamp1);
        dev1.progredir();
        System.out.println("Dev 1 " + dev1.getConteudosInscritos());
        System.out.println("---------------------------------------");
        Dev dev2 = new Dev("Clara", bootcamp2.getConteudos());
        System.out.println("XP" + dev1.calcularTotalXP());
        dev2.entrarNoBootcamp(bootcamp2);
        dev2.progredir();
        dev2.progredir();
        System.out.println("Dev 2 " + dev2.getConteudosInscritos());
        System.out.println("XP " + dev2.calcularTotalXP());



    }
}
