import java.time.LocalDate;

import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso = new Curso("Java 8", "Curso Java 8 da DIO", 5);
    Mentoria mentoria = new Mentoria("Mentoria Java Spring Boot", "Mentoria sobre Java Spring Boot", LocalDate.now());
    Bootcamp bootcamp = new Bootcamp("Bootcamp TQI Backend Developer", "Bootcamp para conhecimentos na área do backend com Java e Kotlin");
    Aluno aluno = new Aluno("Davi");

    System.out.println(bootcamp.getNome());
    System.out.println(bootcamp.getDescricao());
    System.out.println(aluno.getNome());
    System.out.println(curso);
    System.out.println(mentoria);
  }
}
