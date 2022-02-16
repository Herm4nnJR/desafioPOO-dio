import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Monitoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso(); 
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Introdutorio para java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); 
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Curso Introdutorio para javascript");
        curso2.setCargaHoraria(6);

        Monitoria mentoria1 = new Monitoria(); 
        mentoria1.setTitulo("Curso Javascript");
        mentoria1.setDescricao("Curso Introdutorio para javascript");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Novo Estagiario");
        bootcamp1.setDescricao("Contratação de novo Estágiario");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Luis");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos " + dev1.getNome() +": " + dev1.getConteudosInscrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println("*---*");
        System.out.println("Conteudos inscritos " + dev1.getNome() +": " + dev1.getConteudosInscrito());
        System.out.println("Conteudos inscritos " + dev1.getNome() +": " + dev1.getConteudosConcluidos());
        System.out.println("XP =" + dev1.calcularTotalXp());

        System.out.println("----------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Roberta");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos" + dev2.getNome() + ": " + dev2.getConteudosInscrito());
        dev2.progredir();
        System.out.println("*---*");
        System.out.println("Conteudos inscritos" + dev2.getNome() + ": " + dev2.getConteudosInscrito());
        System.out.println("Conteudos inscritos" + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP =" + dev1.calcularTotalXp());

    }
}
