package scr;

import java.util.Scanner;
import scr.controler.PetStoreControler;

public class app {
    public static void menuPrincipal(){
        System.out.println("Menu:");
        System.out.println("1 - Sobre Tutores\n2 - Sobre Pets\n0 - sair");
    }

    public static void menuTutores(){
        System.out.println("Menu Tutores:");
        System.out.println("1 - Cadastrar novo Tutor");
    }

    public static void menuPets(){
        System.out.println("Menus Pets:");
        System.out.println("1 - Cadastrar novo Pet");
    }

    public static void main(String[] args){
        PetStoreControler PetShopee = new PetStoreControler("PetShopee");
        Scanner sc = new Scanner(System.in);

        do {
            
            menuPrincipal();

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    menuTutores();
                    choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1 -> PetShopee.cadastroTutor();
                        default -> System.out.println("Um numero entre as opções!");
                    }

                }
                case 2:  {
                    menuPets();
                    choice = sc.nextInt();
                    sc.nextLine();
                    switch(choice){
                        case 1 -> PetShopee.cadastroPet();
                        default -> System.out.println("Um numero entre as opções!");
                    }
                }
                case 0: {
                    System.out.println("Saindo");
                }
                default: {
                    System.out.println("Algum numero entre as opções!");
                }
            }
        } while (true);
    }
}
