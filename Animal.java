package oops;

public class Animal {
    int age;
    String name;
    String Species;

    void sound() {
        System.out.println("every animal have different sound");
    }

    class DomesticAnimal extends Animal {
        void status() {
            System.out.println("they are living with human beings");
        }
    }

    class WildAnimal extends Animal {
        void status1() {
            System.out.println("they are living in forest and dangerous..");
        }
    }

    class Tiger extends WildAnimal {
        int no_of_strips;
        String status;
    }

    public static void main(String[] args) {

        Animal a = new Animal();

        DomesticAnimal d = a.new DomesticAnimal();
        d.sound();
        d.status();

        Tiger t = a.new Tiger();
        t.sound();
        t.status1();

        t.no_of_strips = 1000;
        t.status = "National Animal";
    }
}
