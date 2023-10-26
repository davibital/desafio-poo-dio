import java.time.LocalDate;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso = new Curso("Java 8", "Curso Java 8 da DIO", 5);
    Mentoria mentoria = new Mentoria("Mentoria Java Spring Boot", "Mentoria sobre Java Spring Boot", LocalDate.now());

    System.out.println(curso);
    System.out.println(mentoria);
  }
}
