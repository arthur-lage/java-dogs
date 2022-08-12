public class Dog {
    private String breed;
    private String name;
    private int age;
    private String color;

    public Dog (String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String newName) {
        this.name = newName;
        return newName;
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int newAge) {
        this.age = newAge;
        return newAge;
    }

    public String getColor() {
        return this.color;
    }

    public String setColor(String newColor) {
        this.color = newColor;
        return newColor;
    }

    public String getBreed() {
        return this.breed;
    }

    public String setBreed(String newBreed) {
        this.breed = newBreed;
        return newBreed;
    }

    public String getDogInformation() {
        return "This dog is called " + this.name + ", it is " + this.age + " years old.\nColor: " + this.color + "\nBreed: " + this.breed;
    }
}
