import package.Animal;

public class ObjectArray {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal a4 = new Animal();
        Animal a5 = new Animal();
        Animal a6 = new Animal();
        Animal a7 = new Animal();
        Animal a8 = new Animal();

        Animal[] animals  = {a1, a2, a3, a4, a5, a6, a7, a8};

        for(Animal a : animals) {
            a.return();
        }
    }
}
