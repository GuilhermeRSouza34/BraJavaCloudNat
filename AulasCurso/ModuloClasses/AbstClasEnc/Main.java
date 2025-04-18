public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.setName("João");
        male.setAge(30);
        var female = new Person();
        female.setName("Maria");
        female.setAge(25);;
        System.out.println("Name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Name: " + female.getName() + " age: " + female.getAge());     
    }   
}
