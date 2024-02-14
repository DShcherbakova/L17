package l17.animal;

public class Animal {
    String name;
    String color;
    public int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return this.name + ", " + color + ", " + age;
    }

}

