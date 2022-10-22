package src;

import java.util.Scanner;

class GajiKaryawan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Karyawan k = new Karyawan(null, null, null, 0);
    System.out.print("Nomer Karyawan: ");
    k.nik = sc.next();

    System.out.print("Nama: ");
    k.nama = sc.next();

    System.out.print("Bagian: ");
    k.bagian = sc.next();
    k.cetak();
  }
}