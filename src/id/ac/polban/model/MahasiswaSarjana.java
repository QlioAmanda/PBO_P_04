package id.ac.polban.model;

public class MahasiswaSarjana extends Mahasiswa {

    public MahasiswaSarjana(String nama, String nim, Jurusan jurusan) {
        super(nama, nim, jurusan); // panggil constructor parent
    }

    @Override
    public String getJenjang() {
        return "Sarjana (S1)";
    }

    @Override
    public String toString() {
        return super.toString() + " | Jenjang: " + getJenjang();
    }
}
