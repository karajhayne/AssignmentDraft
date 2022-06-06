public class animalKind {

    String name;
    int size;
    String food;
    String environment;
    String type;


    void description(){
        System.out.println("The " + name + " is a " + type +
                ", found in " + environment + ", sized at " + size +
                " that snacks on " + food);
    }
}