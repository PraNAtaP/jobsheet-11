import java.util.Scanner;

public class Ucapan_19 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }
    public static String PenerimaUcapan() {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Tulis NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = input19.nextLine();
        input19.close();
        return namaOrang;
    }
}
