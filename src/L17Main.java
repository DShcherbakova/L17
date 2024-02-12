import l17.animal.*;
import l17.people.*;
import l17.transport.*;

public class L17Main {
    public static void main(String[] args) {
        Cat macho = new Cat("Macho", 5);
        Cow korivka = new Cow("Korivka", 8);
        Dog diego = new Dog("Diego", 6);
        Man viktor = new Man("Viktor", 30);
        Woman daria = new Woman("Daria", 24);
        Bike bmw = new Bike("BMW", 7);
        Bus lotos = new Bus("Lotos", 10);
        Car audi = new Car("Audi", 4);

        System.out.println(macho);
        System.out.println(korivka);
        System.out.println(diego);
        System.out.println(viktor);
        System.out.println(daria);
        System.out.println(bmw);
        System.out.println(lotos);
        System.out.println(audi);
    }
}