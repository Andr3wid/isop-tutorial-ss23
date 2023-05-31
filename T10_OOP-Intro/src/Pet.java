public class Pet {
    // properties / fields / instance variables (properties an object has)
    private int age;
    private String name;
    private String species;

    // constructor - defines values when an object is created
    public Pet(int age, String name, String species) {
        this.age = age;
        this.name = name;
        this.species = species;
    }

    // Method (things an object can do)
    void makeSound() {
        if(this.species.equals("Dog")) {
            System.out.println("Dog is barking");
        } else if(this.species.equals("Cat")) {
            System.out.println("Cat is meowing");
        } else {
            System.out.println("<pet is making pet sounds>");
        }
    }

    void haveBirthday() {
        System.out.println("Happy birthday " + this.name);
        age++;
    }

    // GETTER & SETTER
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Illegal value " + age + " provided");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }
}
