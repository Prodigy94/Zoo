class Lion extends Animal {

    private static int numberOfLions = 0;

    public Lion(){
        numberOfLions++;
    }

    public static int getNumberOfLions(){
        return numberOfLions;
    }
    public Lion(String name) {

        super(name);
    }

    @Override
    public void makeSound() {

        System.out.println("Roar!");
    }

}
