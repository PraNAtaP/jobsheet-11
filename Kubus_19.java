import java.util.Scanner;

public class Kubus_19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input19.nextDouble();
        
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Volume Kubus = " + hitungVolume(sisi));
        System.out.println("Luas Permukaan Kubus = " + hitungLuasPermukaan(sisi));
        
        input19.close();
    }
    static double hitungVolume(double sisi) {
        return sisi * sisi * sisi; 
    }
    static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi; 
    }
}