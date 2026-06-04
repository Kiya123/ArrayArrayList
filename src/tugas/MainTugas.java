
//Nama : Muhammad Azkiya
//NPM  : 2410010490
//Kelas: 4B Non Reguler Bjm

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        //Array mata kuliah
        String[] mataKuliah = { "PBO1", "Pemrograman Web", "Kalkulus"}; 
        
    System.out.println("===== DAFTAR MATA KULIAH =====");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }    
     
    System.out.println();
     
    //Membuat objek KelasKuliah
    KelasKuliah kelas = new KelasKuliah();
     
    //Menambahkan objek Mahasiswa
    kelas.tambahMahasiswa(new Mahasiswa("Andi", "24101", 85));
    kelas.tambahMahasiswa(new Mahasiswa("Ferdy", "24102", 65));
    kelas.tambahMahasiswa(new Mahasiswa("Mona", "24103", 90));
    kelas.tambahMahasiswa(new Mahasiswa("Helen", "24104", 47));
    kelas.tambahMahasiswa(new Mahasiswa("Eko", "24105", 50));
    
    kelas.tampilkanSemua();
    
    //Menampilkan nilai rata rata, jumlah mahasiswa yang lulus, dan jumlah mahasiswa sekarang
    System.out.println("\nRata-rata Nilai : " + kelas.hitungRataRata());
    System.out.println("Jumlah Lulus : " + kelas.jumlahLulus());
    System.out.println("Jumlah Mahasiswa : " + kelas.jumlahMahasiswa());
    
    //Menambahkan objek mahasiswa baru dan menampilkan jumlah data terbaru
    kelas.tambahMahasiswa(new Mahasiswa("Gani", "24106", 89));
    System.out.println();
    kelas.tampilkanSemua();
    System.out.println("\n===== Setelah Menambah Mahasiswa Baru =====");
    System.out.println("Jumlah Mahasiswa Sekarang : " + kelas.jumlahMahasiswa());
    }   
}
