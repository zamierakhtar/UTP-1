package utp.mains;
/*
 * Nama: TENGKU ZAMIER AKHTAR HIDAYAT
 * NIM: 245150707111044
 *
   ###    ##    ## ##     ## ########    ###    ########  
  ## ##   ##   ##  ##     ##    ##      ## ##   ##     ## 
 ##   ##  ##  ##   ##     ##    ##     ##   ##  ##     ## 
##     ## #####    #########    ##    ##     ## ########  
######### ##  ##   ##     ##    ##    ######### ##   ##   
##     ## ##   ##  ##     ##    ##    ##     ## ##    ##  
##     ## ##    ## ##     ##    ##    ##     ## ##     ##
*/
import java.util.Scanner;
import utp.shapes.*;
public class Main {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(ANSI_GREEN + "=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("TENGKU ZAMIER AKHTAR HIDAYAT");
        System.out.println("245150707111044");
        System.out.println("============================================="+ ANSI_RESET);

        // Prisma Segitiga Sama Kaki
        System.out.println(ANSI_CYAN + "Prisma Segitiga Sama Kaki");
        System.out.println("=============================================");
        System.out.print("Isikan alas     : ");
        double alas = input.nextDouble();
        System.out.print("Isikan kaki     : ");
        double kaki = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiPrisma = input.nextDouble();
        System.out.println("=============================================");
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        prisma.printInfo();
        System.out.println("=============================================" + ANSI_RESET);

        // Limas Persegi
        System.out.println(ANSI_YELLOW + "Limas Persegi");
        System.out.println("=============================================");
        System.out.print("Isikan sisi     : ");
        double sisi = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiLimas = input.nextDouble();
        System.out.println("=============================================");
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        limas.printInfo();
        System.out.println("=============================================" + ANSI_RESET);

        // Tabung
        System.out.println("Tabung");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiTabung = input.nextDouble();
        System.out.println("=============================================");
        Tabung tabung = new Tabung(radius, tinggiTabung);
        tabung.printInfo();
        System.out.println("=============================================");
    }
}
