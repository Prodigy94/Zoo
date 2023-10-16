// Zoo class
class Zoo {
    private Animal[] animals;

    public Zoo(int capacity) {
        animals = new Animal[capacity];
    }

    public void addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println(animal.getName() + " has been added to the zoo.");
                return;
            }
        }
        System.out.println("The zoo is full. Cannot add " + animal.getName() + ".");
    }

    public void makeAllSounds() {
        System.out.println("All animals in the zoo make sounds:");
        for (Animal animal : animals) {
            if (animal != null) {
                animal.makeSound();
            }
        }
    }
}