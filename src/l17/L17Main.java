import l17.ArrayList;
import l17.transport.Car;

public class L17Main {
    public static void main(String[] args) {
        Car bmw = new Car("Bmw", 2);
        Car porsche = new Car("Porsche", 2);
        Car lamborghini = new Car("Lamborghini", 3);
        Car ford = new Car("Ford", 3);

        ArrayList cars = new ArrayList();
        cars.add(bmw);
        cars.add(porsche);
        cars.add(lamborghini);
        cars.add(ford);
        System.out.println(cars);
    }
}
