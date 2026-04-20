package e2_BikeClass;

public class Sepeda {
    private String merek;
    private String kecepatan;

    public Sepeda(String merek, String kecepatan) {
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    public void ubahKecepatan(String KecepatanBaru) {
        this.kecepatan = KecepatanBaru;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }
}
