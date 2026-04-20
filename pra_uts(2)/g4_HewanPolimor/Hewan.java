package g4_HewanPolimor;

class Hewan {
    void suara() {
        System.out.println("Suara hewan");
    }
}

class Herbivora extends Hewan {
    void suara() {
        System.out.println("Suara herbivora");
    }
}

class Carnivora extends Hewan {
    void suara() {
        System.out.println("Suara carnivora");
    }
}

class Kelinci extends Herbivora {
    void suara() {
        System.out.println("Suara kelinci");
    }
}
