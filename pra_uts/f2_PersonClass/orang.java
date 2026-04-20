package f2_PersonClass;

public class orang {
    String nama;
    int umur;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
    class mahasiswa extends orang {
        String nim;
        void tampilkanNim() {
            System.out.println("NIM: " + nim);
        }
    }
    class dosen extends orang {
        String nidn;
        void tampilkanNidn() {
            System.out.println("NIDN: " + nidn);
        }
    }
}
