package scr.services;

import scr.models.*;

public class PetService {
    public Pet CriarPet(String nome, int id, int idade,String tutor, String raca){
        Pet nPet = new Pet();
        nPet.setId(id);
        nPet.setIdade(idade);
        nPet.setNome(nome);
        nPet.setTutor(tutor);
        nPet.setRaca(raca);
        return nPet;
    }
}
