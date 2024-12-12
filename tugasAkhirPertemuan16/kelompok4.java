import java.util.Scanner;

public class kelompok4 {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("=======================");
            System.out.println("=== Operasi Matriks ===");
            System.out.println("=======================");
            System.out.println("1. Penambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Invers");
            System.out.println("5. Transpose");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine(); 
            switch (menu) {
                case 1:
                    penambahan(); 
                    break;
                case 2:
                    pengurangan(); 
                    break;
                case 3:
                    perkalian(); 
                    break;
                case 4:
                    invers();
                    break;
                case 5 :
                    transpose();
                    break;
                case 6 :
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (menu != 6);
    }
    
    static void penambahan() {
        while (true) {
            System.out.println("--- PENAMBAHAN ---");
            System.out.println("1. Ordo 2*2");
            System.out.println("2. Ordo 3*3");
            System.out.print("Pilih jenis ordo yang diinginkan (1/2) : ");
            int ordo = sc.nextInt();

            if (ordo == 1) {
                double[][] matriks1 = inputMatriks(2, 2, "pertama");
                double[][] matriks2 = inputMatriks(2, 2, "kedua");
                double[][] hasil = tambahMatriks(matriks1, matriks2);
                tampilkanMatriks("Matriks Pertama", matriks1);
                tampilkanMatriks("Matriks Kedua", matriks2);
                tampilkanMatriks("Hasil Penambahan", hasil);
                break;
            } else if (ordo == 2) {
                double[][] matriks1 = inputMatriks(3, 3, "pertama");
                double[][] matriks2 = inputMatriks(3, 3, "kedua");
                double[][] hasil = tambahMatriks(matriks1, matriks2);
                tampilkanMatriks("Matriks Pertama", matriks1);
                tampilkanMatriks("Matriks Kedua", matriks2);
                tampilkanMatriks("Hasil Penambahan", hasil);;
                break;
            } else {
                System.out.println("Jenis ordo tidak ada! Silahkan masukkan data yang valid");
            }
        }
    }
    static void pengurangan() {
        while (true) {
            System.out.println("--- PENGURANGAN ---");
            System.out.println("1. Ordo 2*2");
            System.out.println("2. Ordo 3*3");
            System.out.print("Pilih jenis ordo yang diinginkan (1/2) : ");
            int ordo = sc.nextInt();

            if (ordo == 1) {
                double[][] matriks1 = inputMatriks(2, 2, "pertama");
                double[][] matriks2 = inputMatriks(2, 2, "kedua");
                double[][] hasil = kurangMatriks(matriks1, matriks2);
                tampilkanMatriks("Matriks Pertama", matriks1);
                tampilkanMatriks("Matriks Kedua", matriks2);
                tampilkanMatriks("Hasil Penguranan", hasil);
                break;
            } else if (ordo == 2) {
                double[][] matriks1 = inputMatriks(3, 3, "pertama");
                double[][] matriks2 = inputMatriks(3, 3, "kedua");
                double[][] hasil = kurangMatriks(matriks1, matriks2);
                tampilkanMatriks("Matriks Pertama", matriks1);
                tampilkanMatriks("Matriks Kedua", matriks2);
                tampilkanMatriks("Hasil Pengurangan", hasil);
                break;
            } else {
                System.out.println("Jenis ordo tidak ada! Silahkan masukkan data yang valid");
            }
        }
    }
    static void perkalian() {
        System.out.println("--- PERKALIAN ---");
        System.out.print("Masukkan jumlah baris matriks 1 : ");
        int baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 1 : ");
        int kolom1 = sc.nextInt();
        System.out.print("Masukkan jumlah baris matriks 2 : ");
        int baris2 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 2 : ");
        int kolom2 = sc.nextInt();
        if (kolom1 != baris2) {
            System.out.println("Tidak dapat melakukan perkalian, jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua!");
            return;
        }
        double[][] matriks1 = inputMatriks(baris1, kolom1, "pertama");
        double[][] matriks2 = inputMatriks(baris2, kolom2, "kedua");

        double[][] hasil = new double[baris1][kolom2];
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        tampilkanMatriks("Matriks Pertama", matriks1);
        tampilkanMatriks("Matriks Kedua", matriks2);
        tampilkanMatriks("Hasil Perkalian", hasil);
    }
    static void invers() {
        System.out.println("--- INVERS ---");
        System.out.println("1. Ordo 2*2");
        System.out.println("2. Ordo 3*3");
        System.out.print("Pilih jenis ordo yang diinginkan (1/2) : ");
        int ordo = sc.nextInt();
        while (true) {
            if (ordo == 1) {
                double[][] matriks1 = inputMatriks(2, 2, "ordo 2*2");
                double det = (matriks1[0][0] * matriks1[1][1]) - (matriks1[0][1] * matriks1[1][0]);
                if (det == 0) {
                    System.out.println("Matriks tidak memiliki invers (determinannya = 0)");
                    break;
                }
                double k = 1 / det;
                double invers [][] = new double[2][2];
                invers[0][0] = k * (-matriks1[1][1]);
                invers[0][1] = k * matriks1[0][1];
                invers[1][0] = k * matriks1[1][0];
                invers[1][1] = k * (-matriks1[0][0]);
                tampilkanMatriks("Matriks Asli", matriks1);
                tampilkanMatriks("Invers Matriks", invers);
                break;
            } else if (ordo == 2) {
                double[][] matriks1 = inputMatriks(3, 3, "ordo 3*3");
                double det = matriks1[0][0] * (matriks1[1][1] * matriks1[2][2] - matriks1[1][2] * matriks1[2][1]) - matriks1[0][1] * (matriks1[1][0] * matriks1[2][2] - matriks1[1][2] * matriks1[2][0]) + matriks1[0][2] * (matriks1[1][0] * matriks1[2][1] - matriks1[1][1] * matriks1[2][0]);
                if (det == 0) {
                    System.out.println("Matriks tidak memiliki invers (determinannya = 0)");
                    break;
                }
                double k = 1 / det;
                double[][] kofaktor = new double[3][3];
                kofaktor[0][0] = (matriks1[1][1] * matriks1[2][2] - matriks1[1][2] * matriks1[2][1]);
                kofaktor[0][1] = -1 * (matriks1[1][0] * matriks1[2][2] - matriks1[1][2] * matriks1[2][0]);
                kofaktor[0][2] = (matriks1[1][0] * matriks1[2][1] - matriks1[1][1] * matriks1[2][0]);
                kofaktor[1][0] = -1 * (matriks1[0][1] * matriks1[2][2] - matriks1[0][2] * matriks1[2][1]);
                kofaktor[1][1] = (matriks1[0][0] * matriks1[2][2] - matriks1[0][2] * matriks1[2][0]);
                kofaktor[1][2] = -1 * (matriks1[0][0] * matriks1[2][1] - matriks1[0][1] * matriks1[2][0]);
                kofaktor[2][0] = (matriks1[0][1] * matriks1[1][2] - matriks1[0][2] * matriks1[1][1]);
                kofaktor[2][1] = -1 * (matriks1[0][0] * matriks1[1][2] - matriks1[0][2] * matriks1[1][0]);
                kofaktor[2][2] = (matriks1[0][0] * matriks1[1][1] - matriks1[0][1] * matriks1[1][0]);
                double[][] adjoint = new double[3][3];
                for (int i = 0; i < matriks1.length; i++) {
                    for (int j = 0; j < matriks1[0].length; j++) {
                        adjoint[j][i] = kofaktor[i][j];
                    }
                }
                double[][] invers = new double[3][3];
                for (int i = 0; i < invers.length; i++) {
                    for (int j = 0; j < invers[0].length; j++) {
                        invers[i][j] = k * adjoint[i][j];
                    }
                }
                tampilkanMatriks("Matriks Asli", matriks1);
                tampilkanMatriks("Invers Matriks", invers);
                break;
            } else {
                System.out.println("Jenis ordo tidak ada! Silahkan masukkan data yang valid");
            }
        }
    }
    static void transpose() {
        System.out.println("--- TRANSPOSE ---");
        System.out.print("Masukkan baris matriks : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan baris matriks : ");
        int kolom = sc.nextInt();
        double[][] matriks = inputMatriks(baris, kolom, "Awal");
        double[][] transpose = new double[kolom][baris];
        for (int i = 0; i < transpose[0].length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        tampilkanMatriks("Matriks Awal", matriks);
        tampilkanMatriks("Tranpose Matriks", transpose);
    }
    static double[][] inputMatriks(int baris, int kolom, String matriksKe) {
        double[][] matriks = new double[baris][kolom];
        System.out.println("--------- Masukkan nilai ---------");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print("Masukkan elemen matriks " + matriksKe + " [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = sc.nextDouble();
            }
        }
        return matriks;
    }
    static double[][] tambahMatriks(double[][] matriks1, double[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        double[][] hasil = new double[baris][kolom];
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        return hasil;
    }
    static double[][] kurangMatriks(double[][] matriks1, double[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        double[][] hasil = new double[baris][kolom];
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        return hasil;
    }
    static void tampilkanMatriks(String namaMatriks, double[][] matriks) {
        System.out.println(namaMatriks + ":");
        for (int i = 0; i < matriks.length; i++) {
            System.out.print("|\t");
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("\t|");
        }
    }
}