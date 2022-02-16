import dominio.Curso;

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

        System.out.println(curso1);
        System.out.println(curso2);
    
    
    
    
    }
}
