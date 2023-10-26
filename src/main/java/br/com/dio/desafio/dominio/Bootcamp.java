package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Bootcamp {
  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Aluno> alunosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public Bootcamp(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
  }

  public String getNome() { return nome; }

  public String getDescricao() { return descricao; }
  
  public LocalDate getDataInicial() { return dataInicial; }
  
  public LocalDate getDataFinal() { return dataFinal; }
  
  public Set<Aluno> getAlunosInscritos() { return alunosInscritos; }
  
  public Set<Conteudo> getConteudos() { return conteudos; }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bootcamp bootcamp = (Bootcamp) o;

    return Objects.equals(nome, bootcamp.nome)
        && Objects.equals(descricao, bootcamp.descricao)
        && Objects.equals(dataInicial, bootcamp.dataInicial)
        && Objects.equals(dataFinal, bootcamp.dataFinal)
        && Objects.equals(alunosInscritos, bootcamp.alunosInscritos)
        && Objects.equals(conteudos, bootcamp.conteudos);
  }
}
