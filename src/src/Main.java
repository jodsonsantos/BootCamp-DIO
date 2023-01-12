import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso em java");
        curso1.setDescricao("descrição curso em java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso em js");
        curso2.setDescricao("descrição curso em js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devjodson = new Dev();
        devjodson.setNome("Jodson");
        devjodson.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Jodson" + devjodson.getConteudosInscritos());
        devjodson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jodson" + devjodson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jodson" + devjodson.getConteudosConcluidos());
        System.out.println("XP:" + devjodson.calcularXp());

        System.out.println("--------");

        Dev devmarcelo = new Dev();
        devmarcelo.setNome("Marcelo");
        devmarcelo.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Marcelo" + devmarcelo.getConteudosInscritos());
        devmarcelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcelo" + devmarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcelo" + devmarcelo.getConteudosConcluidos());
        System.out.println("XP:" + devmarcelo.calcularXp());

        System.out.println("--------");
    }
}