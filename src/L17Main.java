import l17.animal.*;
import l17.people.*;
import l17.transport.*;

public class L17Main {
    public static void main(String[] args) {
        Cat macho = new Cat("Macho", 5);
        String a = macho.toString();
        System.out.println(a);

        Cow korivka = new Cow("Korivka", 8);
        String b = korivka.toString();
        System.out.println(b);

        Dog diego = new Dog("Diego", 6);
        String d = diego.toString();
        System.out.println(d);

        Man viktor = new Man("Viktor", 30);
        String e = viktor.toString();
        System.out.println(e);

        Woman daria = new Woman("Daria", 24);
        String f = daria.toString();
        System.out.println(f);

        Bike bmw = new Bike("BMW", 7);
        String g = bmw.toString();
        System.out.println(g);

        Bus lotos = new Bus("Lotos", 10);
        String h = lotos.toString();
        System.out.println(h);

        Car audi = new Car("Audi", 4);
        String i = audi.toString();
        System.out.println(i);
    }
}