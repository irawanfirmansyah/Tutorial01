public class Dosen {

    String nama;
    int nomorIndukDosen;
    int umur;

    public Dosen(String nama, int nomorIndukDosen, int umur) {
        this.nama = nama;
        this.nomorIndukDosen = nomorIndukDosen;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNpm() {
        return nomorIndukDosen;
    }

    public void setNpm(int nomorIndukDosen) {
        this.nomorIndukDosen = nomorIndukDosen;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
