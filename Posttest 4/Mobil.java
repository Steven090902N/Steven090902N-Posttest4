class Mobil {
    protected String nama;
    protected int tahun;
    protected int harga;

    public Mobil(String nama, int tahun, int harga) {
        this.nama = nama;
        this.tahun = tahun;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int gettahun() {
        return tahun;
    }

    public void settahun(int tahun) {
        this.tahun = tahun;
    }

    public int getharga() {
        return harga;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }

    public void notif() {
        System.out.println("Mobil " + nama + " dengan tahun " + tahun + " berhasil di tambah. ");
    }

    public void tampil() {
        System.out.println("Nama Mobil \t\t: " + nama);
        System.out.println("Tahun Kelluar \t\t: " + tahun);
        System.out.println("Harga Mobil \t\t: " + harga);
    }
}
