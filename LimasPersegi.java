package utp.shapes;

public class LimasPersegi {
    private double sisi, tinggi;
    private final String nama = "Limas Persegi";

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    private double luasSisi() {
        double ts = Math.sqrt((tinggi * tinggi) + ((sisi * sisi) / 4));
        return (ts * sisi) / 2;
    }

    private double luasAlas() {
        return sisi * sisi;
    }

    public double hitungLuasPermukaan() {
        return 4 * luasSisi() + luasAlas();
    }

    public double hitungVolume() {
        return luasAlas() * tinggi / 3;
    }

    public void printInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("Luas permukaan  : " + hitungLuasPermukaan());
        System.out.println("Volume          : " + hitungVolume());
    }
}
