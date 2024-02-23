import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName;
        char jenisKelamin;
        int umur;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        firstName = objInput.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        jenisKelamin = objInput.next().charAt(0);

        if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            System.out.println("Jenis kelamin: Perempuan");
        } else if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            System.out.println("Jenis kelamin: Laki-laki");
        } else {
            System.out.println("Jenis kelamin tidak valid");
            return;
        }

        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String tanggalLahirStr = objInput.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);

        LocalDate tanggalSekarang = LocalDate.now();
        umur = tanggalSekarang.getYear() - tanggalLahir.getYear();

        System.out.println("Umur: " + umur + " tahun");
    }
}