import java.util.Scanner;

public class p16 {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\n=======================");
            System.out.println("=== Operasi Matriks ===");
            System.out.println("=======================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Invers");
            System.out.println("5. Transpose");
            System.out.println("6. Keluar");
            System.out.println("=======================");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine(); 
            System.out.println("=======================");
            System.out.println();
            switch (menu) {
                case 1:
                    penjumlahan(); 
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
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (menu != 6);
    }

    public static void penjumlahan() {
        int baris, kolom, i, j;

        System.out.println("=======================");
        System.out.println("====  PENJUMLAHAN  ====");
        System.out.println("=======================");
        System.out.print("Masukkan Baris ordo Matrix yang diinginkan : ");
        baris = sc.nextInt();
        System.out.print("Masukkan Kolom ordo Matrix yang diinginkan : ");
        kolom = sc.nextInt();
        System.out.println();
        
        int[][] matrixA = new int[baris][kolom];
        int[][] matrixB = new int[baris][kolom];
        int[][] matrixTotal = new int[baris][kolom];
        
        System.out.println("=== Matrix Pertama ====");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print("Masukkan Matrix Baris Ke -" + (i + 1) + ", Kolom Ke -" + (j + 1) + " = ");
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n === Matrix Kedua ====");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print("Masukkan Matrix Baris Ke -" + (i + 1) + ", Kolom Ke -" + (j + 1) + " = ");
                matrixB[i][j] = sc.nextInt();
                
            }
        }

        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                matrixTotal[i][j] = (matrixA[i][j] + matrixB[i][j]) ;
            }
        }

        System.out.println("\n Hasil Penjumlahan Matrix : ");

        for(i = 0; i < baris; i++){
            System.out.print("| ");
            for(j = 0; j < kolom; j++){
                System.out.print(" ("+ matrixTotal[i][j] +") \t");
            }
            System.out.print("  |");
            System.out.println("");
        }
    }

    public static void pengurangan() {
        int baris, kolom, i, j;

        System.out.println("=======================");
        System.out.println("====  PENGURANGAN  ====");
        System.out.println("=======================");
        System.out.print("Masukkan Baris ordo Matrix yang diinginkan : ");
        baris = sc.nextInt();
        
        System.out.print("Masukkan Kolom ordo Matrix yang diinginkan : ");
        kolom = sc.nextInt();
        System.out.println();
        
        int[][] matrixA = new int[baris][kolom];
        int[][] matrixB = new int[baris][kolom];
        int[][] matrixTotal = new int[baris][kolom];
        
        System.out.println("=== Matrix Pertama ====");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print("Masukkan Matrix Baris Ke -" + (i + 1) + ", Kolom Ke -" + (j + 1) + " = ");
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n === Matrix Kedua ====");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print("Masukkan Matrix Baris Ke -" + (i + 1) + ", Kolom Ke -" + (j + 1) + " = ");
                matrixB[i][j] = sc.nextInt();
                
            }
        }

        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                matrixTotal[i][j] = (matrixA[i][j] - matrixB[i][j]) ;
            }
        }

        System.out.println("\n Hasil Pengurangan Matrix : ");

        for(i = 0; i < baris; i++){
            System.out.print("| ");
            for(j = 0; j < kolom; j++){
                System.out.print(" ("+ matrixTotal[i][j] +") ");
            }
            System.out.print("  |");
            System.out.println("");
        }
    }

    public static void perkalian() {
        int barisA, kolomA, barisB, kolomB, matrixJumlah, i, j, k;

        System.out.println("=======================");
        System.out.println("====   PERKALIAN   ====");
        System.out.println("=======================");

        System.out.println("==== Matrix Pertama ====");
        System.out.print("Masukkan Baris ordo Matrix yang diinginkan: ");
        barisA = sc.nextInt();
        System.out.print("Masukkan Kolom ordo Matrix yang diinginkan: ");
        kolomA = sc.nextInt();
        System.out.println();

        System.out.println("==== Matrix Kedua ====");
        System.out.print("Masukkan Baris ordo Matrix yang diinginkan: ");
        barisB = sc.nextInt();
        System.out.print("Masukkan Kolom ordo Matrix yang diinginkan: ");
        kolomB = sc.nextInt();
        System.out.println();

        if (kolomA == barisB) {
            int[][] matrixA = new int[barisA][kolomA];
            int[][] matrixB = new int[barisB][kolomB];
            int[][] matrixTotal = new int[barisA][kolomB];

            System.out.println("=== Matrix Pertama ====");
            for (i = 0; i < barisA; i++) {
                for (j = 0; j < kolomA; j++) {
                    System.out.print("Masukkan Matrix Baris Ke-" + (i + 1) + ", Kolom Ke-" + (j + 1) + " = ");
                    matrixA[i][j] = sc.nextInt();
                }
            }

            System.out.println("\n=== Matrix Kedua ====");
            for (i = 0; i < barisB; i++) {
                for (j = 0; j < kolomB; j++) {
                    System.out.print("Masukkan Matrix Baris Ke-" + (i + 1) + ", Kolom Ke-" + (j + 1) + " = ");
                    matrixB[i][j] = sc.nextInt();
                }
            }

            for (i = 0; i < barisA; i++) {
                for (j = 0; j < kolomB; j++) {
                    matrixJumlah = 0;
                    for (k = 0; k < kolomA; k++) { 
                        matrixJumlah += (matrixA[i][k] * matrixB[k][j]);
                    }
                    matrixTotal[i][j] = matrixJumlah;
                }
            }

            System.out.println("\nHasil Perkalian Matrix:");
            for (i = 0; i < barisA; i++) {
                System.out.print("| ");
                for (j = 0; j < kolomB; j++) {
                    System.out.print(matrixTotal[i][j] + " ");
                }
                System.out.println("|");
            }
        } else {
            System.out.println("Tidak dapat melakukan perkalian, jumlah kolom matrix pertama harus sama dengan jumlah baris matrix kedua!");
        }
    }

    public static void invers() {

        int i, j;
        System.out.println("=======================");
        System.out.println("====    INVERS    ====");
        System.out.println("=======================");

        System.out.println("1. Invers 2x2");
        System.out.println("2. Invers 3x3");
        System.out.println("3. Keluar Invers");
        System.out.print("Pilih Menu : ");
        int select = sc.nextInt();

        if (select == 1) {
            int[][] matrix = new int[2][2];
            
            System.out.println("=== Matrix 2x2 ====");
            for(i = 0; i < matrix.length; i++){
                for(j = 0; j < matrix[0].length; j++){
                    System.out.print("Masukkan Matrix Baris Ke -" + (i + 1) + ", Kolom Ke -" + (j + 1) + " = ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            double determinant = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
            if (determinant == 0) {
                System.out.println("Matriks tidak memiliki invers (determinan = 0).");
                return;
            }

            double[][] invers = new double[2][2];
            invers[0][0] = matrix[1][1] / determinant;
            invers[0][1] = -matrix[0][1] / determinant;
            invers[1][0] = -matrix[1][0] / determinant;
            invers[1][1] = matrix[0][0] / determinant;

            System.out.println("Invers matriks:");
            for(i = 0; i < matrix.length; i++){
                for(j = 0; j < matrix[0].length; j++){
                    System.out.printf("%.2f ", invers[i][j]);
                }
                System.out.println();
            }
            

        }else if (select == 2) {
            int[][] matrix = new int[3][3];
            for(i = 0; i < matrix.length; i++){
                for(j = 0; j < matrix[0].length; j++){
                    System.out.print("Masukkan Matrix Baris Ke -" + (i + 1) + ", Kolom Ke -" + (j + 1) + " = ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            double[][] minor = new double[3][3];
            minor[0][0] = ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]));
            minor[0][1] = ((matrix[1][2] * matrix[2][0]) - (matrix[1][0] * matrix[2][2]));
            minor[0][2] = ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
            minor[1][0] = ((matrix[0][2] * matrix[2][1]) - (matrix[0][1] * matrix[2][2]));
            minor[1][1] = ((matrix[0][0] * matrix[2][2]) - (matrix[0][2] * matrix[2][0]));
            minor[1][2] = ((matrix[0][1] * matrix[2][0]) - (matrix[0][0] * matrix[2][1]));
            minor[2][0] = ((matrix[0][1] * matrix[1][2]) - (matrix[0][2] * matrix[1][1]));
            minor[2][1] = ((matrix[0][2] * matrix[1][0]) - (matrix[0][0] * matrix[1][2]));
            minor[2][2] = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));

            double adj[][] = new double[3][3];
            for(i = 0; i < adj.length; i++){
                for(j = 0; j < adj[0].length; j++){
                    adj[i][j] = minor[j][i];
                }
            }

            double determinan = (matrix[0][0] * matrix[1][1] * matrix[2][2]) + (matrix[0][1] * matrix[1][2] * matrix[2][0]) + (matrix[0][2] * matrix[1][0] * matrix[2][1]) - (matrix[0][2] * matrix[1][1] * matrix[2][0]) - (matrix[0][0] * matrix[1][2] * matrix[2][1]) - (matrix[0][1] * matrix[1][0] * matrix[2][2]);

            for(i = 0; i < adj.length; i++){
                for(j = 0; j < adj[0].length; j++){
                    adj[i][j] = adj[i][j] / determinan;
                }
            }
            
            System.out.println("\nHasil Invers matriks: ");
            for(i = 0; i < matrix.length; i++){
                for(j = 0; j < matrix[0].length; j++){
                    System.out.printf("%.2f ", adj[i][j]);
                }
                System.out.println();
            }

        }else if (select == 3) {
            return;
        }else{
            System.out.println("Inputan salah");
        }
    }

    public static void transpose() {
        int baris, kolom, i, j;

        System.out.println("=======================");
        System.out.println("====   TRANSPOSE   ====");
        System.out.println("=======================");
        System.out.print("Masukkan Baris ordo Matrix yang diinginkan : ");
        baris = sc.nextInt();
        System.out.print("Masukkan Kolom ordo Matrix yang diinginkan : ");
        kolom = sc.nextInt();
        System.out.println();
        
        int[][] matrix = new int[baris][kolom];
        int[][] transpose = new int[kolom][baris];
        
        System.out.println("==============================================");
        for(i = 0; i < baris; i++){
            for(j = 0; j < kolom; j++){
                System.out.print("Masukkan Matrix Baris Ke -" + (i + 1) + ", Kolom Ke -" + (j + 1) + " = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("==============================================");

        for ( i = 0; i < baris; i++) {
            for ( j = 0; j < kolom; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\n Hasil Transpose Matrix : ");
        for (i = 0; i < kolom; i++) {
            System.out.print("| ");
            for (j = 0; j < baris; j++) {
                System.out.print(" " + transpose[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}