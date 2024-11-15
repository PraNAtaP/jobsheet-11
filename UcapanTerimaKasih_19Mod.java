import java.util.Scanner;

public class UcapanTerimaKasih_19Mod {
    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan();
    }

    public static String PenerimaUcapan() {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = input19.nextLine();
        
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world. \n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan() {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukkan Ucapan Tambahan : ");
        String tambahan = input19.nextLine(); 
        System.out.println(tambahan);
        
    }
}
