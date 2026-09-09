package scr;

import java.util.ArrayList;
import java.util.Scanner;

import scr.models.Tutor;
import scr.services.TutorService;

public class app {
    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1 - criar Tutor");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Tutor tutor = new Tutor();
        do {
            ArrayList<Tutor> nList = new ArrayList<>(10);
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    int id = nList.size() +1;
                    System.out.println("Qual o nome do tutor?");
                    String nome = sc.nextLine();
                    System.out.println("Qual o cpf do Tutor?");
                    String cpf = sc.nextLine();
                    System.out.println("Qual o email do Tutor?");
                    String email = sc.nextLine();
                    System.out.println("Qual o telefone do Tutor?");
                    String telefone = sc.nextLine();
                    try {
                        nList.add(TutorService.criarTutor(id,nome,cpf,email,telefone));
                    } catch (Exception e) {
                        System.out.println("Algum erro aconteceu!");
                        e.printStackTrace();
                    }
                    System.out.println("Tutor criado!");
                    
                    break;
            
                default:
                    break;
            }

            for (Tutor tutor2 : nList) {
                System.out.println("===========================");
                System.out.println(tutor2.getCpf());
                System.out.println(tutor2.getNome());
                System.out.println(tutor2.getId());
                System.out.println(tutor2.getEmail());
                System.out.println(tutor2.getTelefone());
            }
        } while (true);
    }
}
