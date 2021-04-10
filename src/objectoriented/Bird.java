package objectoriented;

public class Bird extends Animal implements  Flyable {

    @Override
    public void fly() {
        System.out.println("Fly method from Bird class");
    }

    @Override
    public void eat() {
        System.out.println("Eat method from Bird class");
    }
}
