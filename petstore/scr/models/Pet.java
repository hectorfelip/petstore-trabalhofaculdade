package scr.models;

public class Pet extends User {

    private String tutor;
    private int idade;
    private String raca;

    public Pet(){}

    public Pet(String nome, int id,int idade, String tutor,String raca){
        super(nome, id);
        this.idade = idade;
        this.tutor = tutor;
        this.raca = raca;
    }

    @Override 
    public void showData(){
        System.out.println("Nome: " + nome);
        System.out.println("Id: "+id);
    }

    // setters e getters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTutor() {
        return tutor;
    }
    
    
}
