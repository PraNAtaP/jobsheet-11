import java.util.Scanner;

public class NilaiMahasiswa19Mod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        System.out.print("Masukkan jumlah tugas/minggu: ");
        int jumlahTugas = input.nextInt();

        int[][] nilai = new int[jumlahMhs][jumlahTugas];
        String[] nama = new String[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            input.nextLine();
            System.out.print("\nMasukkan nama mahasiswa ke-" + (i+1) + ": ");
            nama[i] = input.nextLine();
            
            System.out.println("Masukkan nilai untuk " + nama[i] + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Minggu ke-" + (j+1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
        
        tampilkanNilai(nilai, nama);
        cariNilaiTertinggi(nilai);
        mahasiswaNilaiTertinggi(nilai, nama);
        
        input.close();
    }
    
    static void tampilkanNilai(int[][] nilai, String[] nama) {
        System.out.println("\n=== Data Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nama[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void cariNilaiTertinggi(int[][] nilai) {
        int tertinggi = 0;
        int minggu = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > tertinggi) {
                    tertinggi = nilai[i][j];
                    minggu = j + 1;
                }
            }
        }
        System.out.println("\nNilai tertinggi " + tertinggi + " terdapat pada minggu ke-" + minggu);
    }
    
    static void mahasiswaNilaiTertinggi(int[][] nilai, String[] nama) {
        int tertinggi = 0;
        int indexMhs = 0;
        int minggu = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > tertinggi) {
                    tertinggi = nilai[i][j];
                    indexMhs = i;
                    minggu = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[indexMhs]);
        System.out.println("Nilai: " + tertinggi + " (Minggu ke-" + minggu + ")");
    }
}
