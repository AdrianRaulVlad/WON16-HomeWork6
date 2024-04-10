public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    /*
    2) Create an application that creates 3 persons using the objects from exercise 1.
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

    /*
    4) Create an application that creates 3 Products.
       Use each method of the object
    */
        // Create three Product instances
        Product firstProduct = new Product("Laptop", 1200.0, 5, "Electronics");
        Product secondProduct = new Product("Shoes", 19.99, 15, "Clothing");
        Product thirdProduct = new Product("Mouse", 99.99, 0, "Electronics");

        // Using methods of Product class
        System.out.println("\nProduct 1");
        printProductDetails(firstProduct);

        System.out.println("\nProduct 2");
        printProductDetails(secondProduct);

        System.out.println("\nProduct 3");
        printProductDetails(thirdProduct);
    }

    // Helper method to print person details
    private static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Married: " + (person.isMarried() ? "Yes" : "No"));
    }

    // Helper method to print product details
    private static void printProductDetails(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice() + "$");
        System.out.println("Quantity: " + product.getQuantity() + " pcs");
        System.out.println("Category: " + product.getCategory());
        System.out.println("Has Stock? " + product.hasStock());
        System.out.println("Is Electronics? " + product.isCategory("Electronics"));
    }

}