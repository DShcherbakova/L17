package l17.people;

public class People {
    String name;
    String gender;
    public int age;

    public People(String name, String gender, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + ", " + gender + ", " + age;
    }
}
