package objectoriented;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // Interface programming
        Animal eagle = new Bird();
        Animal falcon = new Bird();
        Animal robin = new Bird();

        Animal gecko = new Lizard();
        Animal chameleon = new Lizard();
        Animal iguana = new Lizard();

        List<Animal> zoo = new ArrayList<>();
        zoo.add(eagle);
        zoo.add(falcon);
        zoo.add(robin);
        zoo.add(gecko);
        zoo.add(chameleon);
        zoo.add(iguana);

        new Main().feedAll(zoo);
    }

    public void feedAll(List<Animal> zoo) {
        for(Animal a : zoo) {
            a.eat();
        }
    }
}
