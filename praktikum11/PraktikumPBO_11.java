package praktikum11;

public class PraktikumPBO_11 {
    public static void main(String[] args) {
        // Komposisi: Sistem Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku("Pemrograman Berorientasi Objek", "234127");
        Buku buku2 = new Buku("Big Data", "987654321");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
        
        System.out.println();
        
        // Agregasi: Sistem Klub
        Klub klub = new Klub("Klub Suka Baca Buku");
        Anggota anggota1 = new Anggota("Manda");
        Anggota anggota2 = new Anggota("Dinda");
        
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        
        klub.infoKlub();
    }
}