package Soal;

public class Main {
    public static void main(String[] args) {
        
        Pengarang pengarang1 = new Pengarang("Sepila");
        Pengarang pengarang2 = new Pengarang("Tere Liye");
        
        System.out.println();
        
        Buku buku1 = new Buku("Lika Liku Luka", pengarang1);
        Buku buku2 = new Buku("Hujan", pengarang2);
        
        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
       
        perpustakaan.infoPerpustakaan();
    }
}
