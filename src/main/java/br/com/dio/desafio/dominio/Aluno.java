package br.com.dio.desafio.dominio;

import java.io.ObjectStreamClass;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Aluno {
  private String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public Aluno(String nome) {
    this.nome = nome;
  }

  public String getNome() { return nome; }

  public Set<Conteudo> getConteudosInscritos() { return conteudosInscritos; }
  
  public Set<Conteudo> getConteudosConcluidos() { return conteudosConcluidos; }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Aluno aluno = (Aluno) o;

    return Objects.equals(nome, aluno.nome)
        && Objects.equals(conteudosInscritos, aluno.conteudosInscritos)
        && Objects.equals(conteudosConcluidos, aluno.conteudosConcluidos);
  }
}
