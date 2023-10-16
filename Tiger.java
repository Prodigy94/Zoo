class Tiger extends Animal {

    private static int numbOfTigers = 0;

    public Tiger(){
        numbOfTigers++;
    }
    public static int getNumOfTiger() {
        return numbOfTigers;
    }
    public Tiger(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Chuff!");
    }
}
