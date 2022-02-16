import java.time.LocalDate;

import dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    
    }
}
