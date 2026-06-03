
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
       //Soal 1: Buat ArrayList<String> daftar belanja. Tambah 4 item, lalu hapus item ke-2, lalu tampilkan isi list beserta jumlah akhirnya.
       ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        daftarBelanja.remove(1);

        System.out.println("===== SOAL 1 =====");
        for (String item : daftarBelanja) {
            System.out.println(item);
        }
        System.out.println("Jumlah item akhir: " + daftarBelanja.size());
        
        //Soal 2: Buat ArrayList<Integer> berisi 5 angka. Tampilkan nilai terbesar dengan menelusuri seluruh elemen.
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(15);
        angka.add(27);
        angka.add(9);
        angka.add(45);
        angka.add(31);

        int terbesar = angka.get(0);

        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }

        System.out.println("\n===== SOAL 2 =====");
        System.out.println("Nilai terbesar: " + terbesar);
        
        //Soal 3: Buat program yang menambah 6 nama ke dalam ArrayList, lalu cetak hanya nama yang diawali huruf A (gunakan method startsWith pada String).
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Anisa");
        nama.add("Doni");

        System.out.println("\n===== SOAL 3 =====");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
    
}
