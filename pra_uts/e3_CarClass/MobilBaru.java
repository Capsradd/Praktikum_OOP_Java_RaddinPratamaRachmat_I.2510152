package e3_CarClass;

public class MobilBaru {
    private String warna;
    private String merek;

    public MobilBaru(String warna, String merek) {
        this.warna = warna;
        this.merek = merek;
    }
    
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merek: " + merek);
    }
}
