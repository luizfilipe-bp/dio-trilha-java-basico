import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso("Curso Java", "Este é um curso java", 4);        
        Curso curso2 = new Curso("Curso Java 2", "Este é um curso java 2", 6);
        Mentoria mentoria = new Mentoria("Mentoria", "Está é uma mentoria", LocalDate.now());


        Bootcamp bootcamp = new Bootcamp("Meu bootcamp", "Descrição do meu bootcamp");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Luiz");
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("João");

        desenvolvedor1.inscreverBootcamp(bootcamp);
        desenvolvedor2.inscreverBootcamp(bootcamp);
        System.out.println(desenvolvedor1.getConteudosInscritos());
        desenvolvedor2.progredir();
        desenvolvedor2.calcularXP();
        System.out.println(desenvolvedor2.getConteudosInscritos());
    }
}
