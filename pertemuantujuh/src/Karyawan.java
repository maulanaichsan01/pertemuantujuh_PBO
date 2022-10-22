package src;

import java.text.DecimalFormat;

import javax.lang.model.element.Element;

public class Karyawan {
    String nik, nama, bagian;
    double gaji_pokok;

    public Karyawan(String nik, String nama, String bagian, double gaji_pokok) {
        this.nik = nik;
        this.nama = nama;
        this.bagian = bagian;
        this.gaji_pokok = gaji_pokok;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    double getGajiPokok() {
        if (bagian.equalsIgnoreCase("IT")) {
            gaji_pokok = 5000000;
        } else if (bagian.equalsIgnoreCase("Akunting")) {
            gaji_pokok = 7000000;
        } else if (bagian.equalsIgnoreCase("Finance")) {
            gaji_pokok = 10000000;
        } else {
            gaji_pokok = 0;
        }

        return gaji_pokok;
    }

    void cetak() {
        DecimalFormat df = new DecimalFormat("##0,000");
        if (bagian.equalsIgnoreCase("IT")){
            System.out.println("------ Detail Karyawan ------");
            System.out.println("No: " + this.nik);
            System.out.println("Nama: " + this.nama);
            System.out.println("Bagian: " + this.bagian);
            System.out.println("Gaji Pokok: " + df.format(getGajiPokok()));
        }
        else if (bagian.equalsIgnoreCase("Akunting")){
            System.out.println("------ Detail Karyawan ------");
            System.out.println("No: " + this.nik);
            System.out.println("Nama: " + this.nama);
            System.out.println("Bagian: " + this.bagian);
            System.out.println("Gaji Pokok: " + df.format(getGajiPokok()));
        }
        else if (bagian.equalsIgnoreCase("Finance")){
            System.out.println("------ Detail Karyawan ------");
            System.out.println("No: " + this.nik);
            System.out.println("Nama: " + this.nama);
            System.out.println("Bagian: " + this.bagian);
            System.out.println("Gaji Pokok: " + df.format(getGajiPokok()));
        }
        else{
            System.out.println("Ga ada bagian yang anda masuskkan !");
        }

    }

}
