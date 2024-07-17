import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descrição curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia" + devJulia.getConteudosInscritos());
        devJulia.progredir();
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("Conteúdos Inscritos Julia" + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Julia" + devJulia.getConteudosConcluidos());
        System.out.println("XP:" + devJulia.calcularTotalXp());

        System.out.println("------");

        Dev devTalita = new Dev();
        devJulia.setNome("Talita");
        devTalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Talita" + devTalita.getConteudosInscritos());
        devTalita.progredir();
        System.out.println("Conteúdos Inscritos Talita" + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Talita" + devTalita.getConteudosConcluidos());
        System.out.println("XP:" + devTalita.calcularTotalXp());



    }
}