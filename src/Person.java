/*
1) Create an object that represents a Person
   state: name, age, married
   behavior: getName, getAge, isMarried
*/
public class Person {
    // State variables
    private String name;
    private int age;
    private boolean married;

    // Constructor to initialize the Person object
    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Getter method for marital status
    public boolean isMarried() {
        return married;
    }
}
