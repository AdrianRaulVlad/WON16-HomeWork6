public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    /*
    2) create an application that creates 3 persons using the objects from exercise 1.
       Print them to the console
    */
        // Creating a new Person object
        Person firstPerson = new Person("Marcel", 36, true);
        Person secondPerson = new Person("Viorel", 28, false);
        Person thirdPerson = new Person("Florica", 50, true);

        // Getting and printing the person's details
        System.out.println("\nPerson 1");
        printPersonDetails(firstPerson);
        System.out.println("\nPerson 2");
        printPersonDetails(secondPerson);
        System.out.println("\nPerson 3");
        printPersonDetails(thirdPerson);
    }

    // Helper method to print person details
    private static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Married: " + (person.isMarried() ? "Yes" : "No"));
    }
}