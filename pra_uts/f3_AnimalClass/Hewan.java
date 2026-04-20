package f3_AnimalClass;

public class Hewan {
    void suara() {
        System.out.println("Suara Hewan");
    }
    class Herbivora extends Hewan {
        void suara() {
            System.out.println("Suara Herbivora");
        }
    }
    class Karnivora extends Hewan {
        void suara() {
            System.out.println("Suara Karnivora");
        }
    }
    class Kelinci extends Herbivora {
        void suara() {
            System.out.println("Suara Kelinci");
        }
}
}