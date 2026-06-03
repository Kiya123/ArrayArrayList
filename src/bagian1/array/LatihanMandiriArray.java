
package bagian1.array;

public class LatihanMandiriArray {
    //Soal 1: Buat array berisi 6 suhu harian (bertipe double). Tampilkan suhu tertinggi dan terendah.
    public static void main(String[] args) {
    double[] suhu = {25.9, 31.2, 28.7, 33.1, 39.2, 27.9};
    double tertinggi = suhu[0];
    double terendah = suhu[0];

    for (int i = 1; i < suhu.length; i++) {
        if (suhu[i] > tertinggi) {
            tertinggi = suhu[i];
            }
        if (suhu[i] < terendah) {
            terendah = suhu[i];
            }
        }
    System.out.println("===== Soal 1 =====");
    System.out.println("Suhu tertinggi : " + tertinggi);
    System.out.println("Suhu terendah  : " + terendah);  
    
    //Soal 2: Buat array String berisi 5 nama hari. Cetak hanya nama hari yang memiliki lebih dari 5 huruf (gunakan .length() pada String).
    String[] hari = {"Senin","Selasa","Rabu","Kamis","Jumat"};

    System.out.println("\n===== Soal 2 =====");
    System.out.println("Nama hari yang memiliki lebih dari 5 huruf adalah ");

    for (String h : hari) {
        if (h.length() > 5) {
            System.out.println(h);
            }
        }
    
    //Soal 3: Diberikan int[] angka = {4, 8, 15, 16, 23, 42}; hitung dan tampilkan berapa banyak angka genap di dalamnya.
    int[] angka = {4, 8, 15, 16, 23, 42};
    int jumlahGenap = 0;

    for (int a : angka) {
        if (a % 2 == 0) {
            jumlahGenap++;
            }
        }
    System.out.println("\n===== Soal 3 =====");
    System.out.println("Jumlah angka genap adalah " + jumlahGenap);
    }
}
