import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Descrição do Curso Python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos de Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos de Maria após progredir: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP de Maria: " + devMaria.calcularTotalXp());

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos de Jorge: " + devJorge.getConteudosInscritos());
        devJorge.progredir();
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos de Jorge após progredir: " + devJorge.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Jorge: " + devJorge.getConteudosConcluidos());
        System.out.println("XP de Jorge: " + devJorge.calcularTotalXp());
        
    }

}
