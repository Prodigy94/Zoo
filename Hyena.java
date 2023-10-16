class Hyena extends Animal {

    public Hyena() {
        System.out.println("\n A new Hyena was created!");
        numOfHyenas++;

    }
    public static int getNumOfHyenas(){
        return numOfHyenas;
    }
    private static int numOfHyenas = 0;
    public Hyena(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Giggle!");
    }
}
