package moreira.company;

public abstract class Animal {
  protected float peso;
  protected int idade, membros;

  abstract protected void locomover();
  abstract protected void alimentar();
  abstract protected void emitirSom();
}
