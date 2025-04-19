import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();


    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("====Escolha uma das opções====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com água");
            System.out.println("3 - Verificar a água da máquina");
            System.out.println("4 - Abastecer a maquina com shampoo");
            System.out.println("5 - Verificar o shampoo da máquina");
            System.out.println("6 - Verificar se a máquina tem pet");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Remover pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
            }

        } while (option != 0);
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println("A máquina " + (hasPet ? "tem" : "não tem") + " pet.");
    }

    public static void setPetInPetMachine() {
        var nome = "";
        while (nome == null || nome.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            nome = scanner.next();
        }
        var pet = new Pet(nome);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getNome() + " foi adicionado à máquina.");
    }
}
