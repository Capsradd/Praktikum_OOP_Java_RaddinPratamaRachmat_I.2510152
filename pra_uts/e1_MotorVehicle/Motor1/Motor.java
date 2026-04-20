package e1_MotorVehicle.Motor1;

public class Motor {
    private String warna;
    private String merek;

    public Motor(String warna, String merek) {
        this.warna = warna;
        this.merek = merek;
    }

    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merek: " + merek);
    }
}