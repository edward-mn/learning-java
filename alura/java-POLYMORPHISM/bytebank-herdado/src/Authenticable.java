public abstract interface Authenticable { // Interface = Contract

  public abstract boolean autentication(int password);

  public abstract int getPassword();

  public abstract void setPassword(int password);
}
