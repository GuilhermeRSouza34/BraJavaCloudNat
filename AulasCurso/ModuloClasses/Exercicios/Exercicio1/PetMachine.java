public class PetMachine {
    private boolean limpo = true;
    private int agua = 30;
    private int shampoo = 10;
    private Pet pet;

    // Construtor da classe PetMachine
    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Nenhum pet na máquina.");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setLimpo(true);
        System.out.println("O pet " + pet.getNome() + " tomou banho.");
    }

    // Método para adicionar água à máquina
    public void addWater(int agua) {
        if (agua == 30) {
            System.out.println("A capacidade de água da máquina esta no limite.");
            return;
        }
        this.agua += 2;
    }

    // Método para adicionar shampoo à máquina
    public void addShampoo(int shampoo) {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina esta no limite.");
            return;
        }
        this.shampoo += 1;
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    } 

    // Método para adicionar um pet à máquina
    public boolean hasPet() {
        return pet != null;
    }

    // Método para verificar se o pet está limpo
    public void setPet(Pet pet) {
        if (!this.limpo) {
            System.out.println("A máquina não está limpa.");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getNome() + " esta na maquina nesse momento.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.limpo = this.pet.isLimpo();
        System.out.println("O pet " + this.pet.getNome() + "foi removido da máquina.");
        this.pet = null;
    }

    // Método para verificar se a máquina está limpa
    public void wash() {
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A máquina foi lavada.");
    }

}
