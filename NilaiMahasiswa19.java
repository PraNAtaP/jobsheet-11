public class NilaiMahasiswa19 {
    public static void main(String[] args) {
        // Inisialisasi array 2 dimensi
        int[][] nilai = {
            {20, 19, 25, 20, 10, 0, 10},  // Sari
            {30, 30, 40, 10, 15, 20, 25}, // Rina
            {5, 0, 20, 25, 10, 5, 45},    // Yani
            {50, 0, 7, 8, 0, 30, 60},     // Dwi
            {15, 10, 16, 15, 10, 10, 5}   // Lusi
        };
        String[] nama = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        tampilkanNilai(nilai, nama);
        cariNilaiTertinggi(nilai);
        mahasiswaNilaiTertinggi(nilai, nama);
    }
    static void tampilkanNilai(int[][] nilai, String[] nama) {
        System.out.println("\n----------- Data Nilai Mahasiswa -----------");
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
        int jmlMhs = 0;
        int minggu = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > tertinggi) {
                    tertinggi = nilai[i][j];
                    jmlMhs = i;
                    minggu = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[jmlMhs]);
        System.out.println("Nilai: " + tertinggi + " (Minggu ke-" + minggu + ")");
    }
}
