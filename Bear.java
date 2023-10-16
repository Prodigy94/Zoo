// Elephant class (extends Animal)
class Bear extends Animal {

    private static int numberOfBears = 0;
    public Bear(){
        numberOfBears++;
    }

    public static int getNumberOfBears(){
        return numberOfBears;
    }
    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Growl!");
    }

}