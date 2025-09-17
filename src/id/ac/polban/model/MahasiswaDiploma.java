package id.ac.polban.model;

public class MahasiswaDiploma extends Mahasiswa {

    public MahasiswaDiploma(String nama, String nim, Jurusan jurusan) {
        super(nama, nim, jurusan);
    }

    @Override
    public String getJenjang() {
        return "Diploma (D3)";
    }

    @Override
    public String toString() {
        return super.toString() + " | Jenjang: " + getJenjang();
    }
}
