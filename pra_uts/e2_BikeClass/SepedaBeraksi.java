package e2_BikeClass;

public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda("Polygon", "20");
        sepeda.tampilkanInfo();

        sepeda.ubahKecepatan("30");
        sepeda.tampilkanInfo();
    }
}
