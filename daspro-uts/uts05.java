import java.util.Scanner;
public class uts05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan waktu kedatangan (jam (spasi) menit (spasi) detik) : ");
        int jamDtg = sc.nextInt();
        int mntDtg = sc.nextInt();
        int dtkDtg = sc.nextInt();

        System.out.print("Masukkan waktu keberangkatan (jam (spasi) menit (spasi) detik) : ");
        int jamBrgkt = sc.nextInt();
        int mntBrgkt = sc.nextInt();
        int dtkBrgkt = sc.nextInt();

        int totalKedatangan = (jamDtg * 3600) + (mntDtg * 60) + dtkDtg;
        int totalKeberangkatan = (jamBrgkt * 3600) + (mntBrgkt * 60) + dtkBrgkt;

        int selisih = totalKeberangkatan - totalKedatangan;

        if (selisih < -1) {
            selisih += 24 * 3600;
        }

        int jamSelisih = selisih / 3600;
        int menitSelisih = (selisih % 3600) / 60;
        int detikSelisih = selisih % 60;

        System.out.println("Selisih waktu : " + jamSelisih + " jam " + menitSelisih + " menit " + detikSelisih + " detik.");
    }
}