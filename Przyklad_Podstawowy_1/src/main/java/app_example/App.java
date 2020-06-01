package app_example;

/**
 * Przykladowa aplikacja byczq
 */

public class App {
    public static void main(String[] args) {
        App library = new App();
        System.out.println(library.someMethod(true));

    }

    public boolean someMethod(boolean valToReturn) {
        System.out.println("Method");
        return valToReturn;
    }

}
