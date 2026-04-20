package i2_Kendaraan;

abstract class Kendaraan {
    abstract void bergerak();
}

class Mobil extends Kendaraan {
    void bergerak() {
        System.out.println("Mobil bergerak dengan roda");
    }
}

class Sepeda extends Kendaraan {
    void bergerak() {
        System.out.println("Sepeda bergerak dengan pedal");
    }
}
