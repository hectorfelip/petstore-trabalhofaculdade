package scr.controler;

import java.util.*;
import scr.models.*;
import scr.services.PetService;
import scr.services.TutorService;

public class PetStoreControler {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private List<Pet> PetLista = new ArrayList<>();
    private List<Tutor> TutorLista = new ArrayList<>();

    public PetStoreControler(String nome) {
        this.nome = nome;
        this.PetLista = new ArrayList<>();
        this.TutorLista = new ArrayList<>();
    }

    public void cadastroTutor(){
        String nomeTutor;
        int idTutor = TutorLista.size() +1;
        String cpfTutor;
        String emailTutor;
        String telefoneTutor;

        System.out.println("Nome do tutor: ");
        nomeTutor = sc.nextLine();
        System.out.println("CPF do Tutor: ");
        cpfTutor = sc.nextLine();
        System.out.println("Email do tutor: ");
        emailTutor = sc.nextLine();
        System.out.println("Telefone do tutor: ");
        telefoneTutor = sc.nextLine();

        TutorService nTutor = new TutorService();
        Tutor novoTutor = nTutor.criarTutor(idTutor, nomeTutor, cpfTutor, emailTutor, telefoneTutor);
        TutorLista.add(novoTutor);
    }

    public void cadastroPet(){
        String nomePet;
        int idPet = TutorLista.size() +1;
        int idadePet;
        String tutorPet;
        String racaPet;

        System.out.println("Nome do Pet: ");
        nomePet = sc.nextLine();
        System.out.println("Idade do Pet: ");
        idadePet = sc.nextInt();
        sc.nextLine();
        System.out.println("Tutor do Pet: ");
        tutorPet = sc.nextLine();
        System.out.println("Raça do Pet: ");
        racaPet = sc.nextLine();

        PetService nPetService = new PetService();
        Pet nPet = nPetService.CriarPet(nomePet, idPet, idadePet, tutorPet, racaPet);
        PetLista.add(nPet);

        for (Tutor tutores : TutorLista) {
            int idx = TutorLista.indexOf(tutores);
            if(tutores.getNome().equals(tutorPet)){
                tutores.setPets(nPet);
                TutorLista.set(idx, tutores);
            }
        }

    }

    
}
