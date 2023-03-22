import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hojeFormatado = hoje.format(formatter);


        Curso curso = new Curso();
        curso.setCargaHoraria(114);
        curso.setDescricao("Aprendendo Java");
        curso.setTitulo("Bootcamp Dio Java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(94);
        curso2.setDescricao("Aprendendo Angular");
        curso2.setTitulo("Bootcamp Dio Angular");
        
        System.out.println(curso);
        System.out.println(curso2);


        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Voltada para aprendizado");
        mentoria.setTitulo("Ajudando juninhos");
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Italo");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println("Conteúdos incritos Italo: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Italo: " + dev.getConteudosConcluidos());
        
        System.out.println("-----------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Isabelle");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("Conteúdos incritos Isabelle: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Isabelle: " + dev2.getConteudosConcluidos());
    }
}
