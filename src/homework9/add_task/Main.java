package homework9.add_task;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Vaska", 45, false);
        Animal animal1 = new Animal("Vaska", 45, false);
        Animal animal2 = new Animal("Petia", 44, true);
        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(animal2 + "\n");
        System.out.println(animal.hashCode());
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode() + "\n");
        System.out.println(animal.equals(animal1));
        System.out.println(animal.equals(animal2));

    }

}
