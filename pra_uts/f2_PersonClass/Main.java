package f2_PersonClass;

public class Main {
    public static void main(String[] args) {
        orang.mahasiswa mahasiswa = new orang().new mahasiswa();
        mahasiswa.nama = "Budi";
        mahasiswa.umur = 20;
        mahasiswa.nim = "123456789";
        mahasiswa.tampilkanInfo();
        mahasiswa.tampilkanNim();

        orang.dosen dosen = new orang().new dosen();
        dosen.nama = "Dr. Ahmad";
        dosen.umur = 40;
        dosen.nidn = "654321";
        dosen.tampilkanInfo();
        dosen.tampilkanNidn();
    }
}
