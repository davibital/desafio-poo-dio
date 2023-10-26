package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
  private String titulo;
  private String descricao;
  private LocalDate data;

  public Mentoria(String titulo, String descricao, LocalDate data) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.data = data;
  }

  public String getTitulo() { return titulo; }

  public String getDescricao() { return descricao; }

  public LocalDate getData() { return data; }
}
