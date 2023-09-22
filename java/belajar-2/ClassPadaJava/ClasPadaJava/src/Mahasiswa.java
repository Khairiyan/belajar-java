public class Mahasiswa {
    private String nama;
    private String nim;
    private MyDate tglLahir;

    public Mahasiswa (){
        this.nama = "";
        this.nim = "";
        this.tglLahir = null;
    }

    public Mahasiswa(String nama, String nim, MyDate tglLahir){
        this.nama =nama;
        this.nim = nim;
        this.tglLahir = tglLahir;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setTanggalLahir(MyDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public void setNama(String nama) throws Exception {
        if(nama.matches(".*[1234567890].*")){
            throw new Exception("Input nama tidak boleh memuat angka didalamnya");
        }
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public MyDate getTanggalLahir() {
        return this.tglLahir;
    }

    public String toString() {
        return "Nama : " + this.nama + "\n" + "NIM : " + this.nim + "\n" + "Tanggal Lahir : " + this.tglLahir;
    }
}