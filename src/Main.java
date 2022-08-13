import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int option;
    public static ArrayList<Dog> dogs = new ArrayList<Dog>();
    public static Scanner scanner = new Scanner(System.in);
    public static Dog askUserForDogInformation() {
        System.out.print("Dog's name: ");
        String dogName = scanner.nextLine();
        System.out.print("Dog's age: ");
        int dogAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Dog's color: ");
        String dogColor = scanner.nextLine();
        System.out.print("Dog's breed: ");
        String dogBreed = scanner.nextLine();

        return new Dog(dogName, dogAge, dogColor, dogBreed);
    }

    public static void askUserForOption() {
        System.out.println("""
                \nChoose one of the options below:
                
                0- See all dogs
                1- Add new dog
                2- Delete a dog
                3- Update dog's information
                4- Exit""");

        option = scanner.nextInt();
        scanner.nextLine();
    }
    public static void updateDog(ArrayList<Dog> dogsArray) {
        for(int i = 0; i < dogsArray.size(); i++) {
            System.out.println(i + "- " + dogsArray.get(i).getName());
        }

        int index;

        do {
            System.out.println("Select the dog you want to update (using the number on the left)");
            index = scanner.nextInt();
        } while (index < 0 || index > dogsArray.size() - 1);

        scanner.nextLine();

        Dog newDog = askUserForDogInformation();

        dogsArray.set(index, newDog);

        scanner.nextLine();
    }

    public static void deleteDog(ArrayList<Dog> dogsArray) {
        for(int i = 0; i < dogsArray.size(); i++) {
            System.out.println(i + "- " + dogsArray.get(i).getName());
        }

        System.out.println("Select the dog you want to delete (using the number on the left)");
        int index = scanner.nextInt();

        dogsArray.remove(index);

        scanner.nextLine();
    }
    public static void addDog(ArrayList<Dog> dogsArray) {
        Dog createdDog = askUserForDogInformation();

        dogsArray.add(createdDog);
    }
    public static void showDogs(ArrayList<Dog> dogsArray) {
        if(dogsArray.size() > 0) {
            for (Dog dog : dogsArray) {
                System.out.println(dog.getDogInformation());
            }
        } else {
            System.out.println("You haven't created any dogs yet!");
        }
    }
    public static void main (String[] args) {
        System.out.println("""
                =================================
                        WELCOME TO DOGS
                =================================""");

        addDog(dogs);

        do {
            askUserForOption();

            if(option == 0) {
                showDogs(dogs);
            }

            if(option == 1) {
                addDog(dogs);
                askUserForOption();
            }

            if(option == 2) {
                deleteDog(dogs);
            }

            if(option == 3) {
                updateDog(dogs);
            }

            if(option == 4) {
                System.out.println("Goodbye!");
                return;
            }
        } while (true);
    }
}
