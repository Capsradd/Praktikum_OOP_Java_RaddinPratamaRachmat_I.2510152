package e1_MotorVehicle.Motor2;

public class Motor2 {
    private String warna;
    private String merek;

    public Motor2(String warna, String merek) {
        this.warna = warna;
        this.merek = merek;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merek: " + merek);
    }
}
