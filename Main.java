// Do ArrayLists go in a new folder or stored in Main?
//
//
//
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {




            }
        }
public class arrayListAnimals { // FOR ANDY: compile error "java: class arrayListAnimals is public,
                                // should be declared in a file named arrayListAnimals.java" even tho file name is
                                // consistent with input, not sure how to fix

    public static void main(String[] args) {

        String[] animals = new String[8];
        animals[0] = "Koi";
        animals[1] = "Tuna";
        animals[2] = "Zebra";
        animals[3] = "Hyena";
        animals[4] = "Dove";
        animals[5] = "Parrot";
        animals[6] = "Python";
        animals[7] = "Komodo Dragon";
        System.out.println(animals);

        ArrayList animalList = new ArrayList();
        animalList.add("Koi");
        animalList.add("Tuna");
        animalList.add("Zebra");
        animalList.add("Hyena");

        System.out.println(animalList);
    }
}
