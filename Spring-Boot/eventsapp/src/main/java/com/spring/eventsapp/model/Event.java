package com.spring.eventsapp.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "TB_Events")
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long codigo;

  @NotNull
  private String nome;

  @NotNull
  private String local;

  @NotNull
  private String data;

  @NotNull
  private String horario;

  public long getCodigo() {
    return codigo;
  }

  public void setCodigo(long codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }
}
