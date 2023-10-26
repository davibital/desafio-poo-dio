package br.com.dio.desafio.dominio;

public class Curso {
  private String titulo;
  private String descricao;
  private int cargaHoraria;

  public Curso(String titulo, String descricao, int cargaHoraria) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.cargaHoraria = cargaHoraria;
  }

  public String getTitulo() { return titulo; }

  public String getDescricao() { return descricao; }

  public int getCargaHoraria() { return cargaHoraria; }
}
