public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.name = "John";
        male.age = 30;
        var female = new Person();
        female.name = "Mary";
        female.age = 25;
        System.out.println("Name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Name: " + female.getName() + " age: " + female.getAge());     
    }   
}
