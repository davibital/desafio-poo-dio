package br.com.dio.desafio.dominio;

public abstract class Conteudo {
  private String titulo;
  private String descricao;

  public String getTitulo() { return titulo; }
  
  protected void setTitulo(String titulo) { this.titulo = titulo; }
  
  public String getDescricao() { return descricao; }

  protected void setDescricao(String descricao) {
    this.descricao = descricao; }
}
