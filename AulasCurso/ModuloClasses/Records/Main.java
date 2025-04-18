public class Main {
    public static void main(String[] args) {
        var person = new Person("Guilherme", 22);
        System.out.println(person);
        System.out.println(person.name());
        var person2 = new Person("Souza", 30);
        System.out.println(person2);
        System.out.println(person2.name());
    }
}
