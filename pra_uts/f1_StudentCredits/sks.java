package f1_StudentCredits;

public class sks {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Budi", 24);
        mahasiswa.tampilkanInfo();
        mahasiswa.setSks(30);
        mahasiswa.tampilkanInfo();
    }
}