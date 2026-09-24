package scr.services;

import scr.models.Tutor;

public class TutorService {


    public Tutor criarTutor(int id,String nome, String cpf, String email, String telefone){

        Tutor nTutor = new Tutor();
        nTutor.setId(id);
        nTutor.setCpf(cpf);
        nTutor.setEmail(email);
        nTutor.setNome(nome);
        nTutor.setTelefone(telefone);

        return nTutor;
    }
}
