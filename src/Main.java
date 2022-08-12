import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int option;
    public static ArrayList<Dog> dogs = new ArrayList<Dog>();
    public static Scanner scanner = new Scanner(System.in);

    public static void askUserForOption() {
        System.out.println("""
                \nChoose one of the options below:
                
                0- See all dogs
                1- Add new dog
                2- Delete a dog
                3- Update dog's information
                4- Exit""");

        option = scanner.nextInt();
    }
    public static void addDog(ArrayList<Dog> dogsArray) {
        System.out.print("Dog's name: ");
        String dogName = scanner.nextLine();
        System.out.print("Dog's age: ");
        int dogAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Dog's color: ");
        String dogColor = scanner.nextLine();
        System.out.print("Dog's breed: ");
        String dogBreed = scanner.nextLine();

        Dog createdDog = new Dog(dogName, dogAge, dogColor, dogBreed);

        dogsArray.add(createdDog);
    }
    public static void showDogs(ArrayList<Dog> dogsArray) {
        for (Dog dog : dogsArray) {
            System.out.println(dog.getDogInformation());
        }
    }
    public static void main (String[] args) {
        System.out.println("""
                =================================
                        WELCOME TO DOGS
                =================================""");

        addDog(dogs);

        askUserForOption();

        if(option == 0) {
            showDogs(dogs);
        }

        if(option == 1) {
            addDog(dogs);
            askUserForOption();
        }

        if(option == 2) {
            System.out.println("This option is not available yet!");
        }

        if(option == 3) {
            System.out.println("This option is not available yet!");
        }

        if(option == 4) {
            System.out.println("Goodbye!");
            return;
        }
    }
}
