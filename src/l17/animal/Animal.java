package l17.animal;

public class Animals {
    String name;
    String color;
    public int age;

    public Animals(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return this.name + ", " + color + ", " + age;
    }

}

