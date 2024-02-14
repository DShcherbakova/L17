package l17.transport;

public class Transport {
    public String model;
    String color;
    public int age;

    public Transport(String model, String color, int age){
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return model + ", " + this.color + ", " + age;
    }
}

