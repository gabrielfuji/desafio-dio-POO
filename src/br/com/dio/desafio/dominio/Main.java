package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabriel" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluídos Gabriel" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

        System.out.println("------------------");

        Dev devIsabella = new Dev();
        devIsabella.setNome("Isabella");
        devIsabella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Isabella" + devIsabella.getConteudosInscritos());
        devIsabella.progredir();
        devIsabella.progredir();
        devIsabella.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluídos Isabella" + devIsabella.getConteudosConcluidos());
        System.out.println("XP:" + devIsabella.calcularTotalXp());

    }
}
