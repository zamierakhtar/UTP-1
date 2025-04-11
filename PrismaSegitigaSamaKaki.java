package utp.shapes;

public class PrismaSegitigaSamaKaki {
    private double alas, kaki, tinggi;
    private final String nama = "Prisma Segitiga Sama Kaki";
    private final double PI = 22.0 / 7;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
    }

    private double luasAlas() {
        double ta = Math.sqrt((kaki * kaki) - ((alas * alas) / 4));
        return (ta * alas) / 2;
    }

    private double keliling() {
        return (2 * kaki) + alas;
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
