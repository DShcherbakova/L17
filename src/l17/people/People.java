package l17.people;

public class Human {
    String name;
    String gender;
    public int age;

    public Human(String name, String gender, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + ", " + gender + ", " + age;
    }
}
