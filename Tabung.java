package utp.shapes;

public class Tabung {
    private double radius, tinggi;
    private final String nama = "Tabung";
    private final double PI = 22.0 / 7;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    private double luasAlas() {
        return radius * radius * PI;
    }

    private double keliling() {
        return 2 * radius * PI;
    }

    public double hitungLuasPermukaan() {
        return 2 * luasAlas() + keliling() * tinggi;
    }

    public double hitungVolume() {
        return luasAlas() * tinggi;
    }

    public void printInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("Luas permukaan  : " + hitungLuasPermukaan());
        System.out.println("Volume          : " + hitungVolume());
    }
}
