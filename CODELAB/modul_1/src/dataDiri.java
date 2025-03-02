import java.time.LocalDate;
import java.util.Scanner;

public class dataDiri {
    public static void main (String[] args){

        //membuat object scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        //meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        //meminta input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        //meminta input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        //meenghitung umur berdasarkan tahun lahir
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        //menentukan jenis kelamin
        String jenisKelaminStr = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" :
                (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Tidak valid";

        //menampilkan hasil
        System.out.println("\nData Diri: ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: "+jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");

        //menutup scanner setelah selesai
        scanner.close();

    }
}