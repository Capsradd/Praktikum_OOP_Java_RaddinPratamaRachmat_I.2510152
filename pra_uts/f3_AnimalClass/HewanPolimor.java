package f3_AnimalClass;

public class HewanPolimor {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan().new Herbivora();
        Hewan hewan3 = new Hewan().new Karnivora();
        Hewan hewan4 = new Hewan().new Kelinci();

        hewan1.suara();
        hewan2.suara();
        hewan3.suara();
        hewan4.suara();
    }
}
