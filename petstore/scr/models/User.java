package scr.models;

public abstract  class User {
    protected String nome;
    protected int id;

    public User(){}

    public User(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public abstract void  showData();
}
