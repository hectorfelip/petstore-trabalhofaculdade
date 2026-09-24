package scr.models;

import java.util.*;

public class Tutor extends User {
    private String cpf;
    private String email;
    private String telefone;
    private List<Pet> pets = new ArrayList<>();

    public Tutor(){

    }
    public Tutor(int id, String nome, String cpf, String email, String telefone){
        super(nome, id);
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.pets = new ArrayList<>();
    }

    @Override 
    public void showData(){
        System.out.println(id);
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(email);
        System.out.println(telefone);

        for (Pet petu : pets) {
            petu.showData();
        }

    }    

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEmail(){
        return email;
    }

    public String getTelefone(){
        return  telefone;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setPets(Pet pet) {
        pets.add(pet);
    }
    

}
