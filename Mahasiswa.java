public class Mahasiswa {

    String nama;
    int npm;
    int umur;

    public Mahasiswa(String nama, int npm, int umur) {
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
