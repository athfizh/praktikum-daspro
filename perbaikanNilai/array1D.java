public class array1D {
    public static void main(String[] args) {

        char[] isi = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'};

        int index = 0;
        
        for (int baris = 0; baris < 5; baris++) {
            for (int kolom = 0; kolom <= 5; kolom++) {
                if (kolom < (5 - baris)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(isi[index]);
                    index++;
                }
            }
            System.out.println();
        }
    }
}