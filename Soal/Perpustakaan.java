package Soal;


public class Perpustakaan {
    private Buku[] bukuList;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        bukuList = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < bukuList.length) {
            bukuList[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan sudah penuh, tidak dapat menambahkan buku.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku dalam Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            bukuList[i].infoBuku(); // Menampilkan info buku dan pengarang
        }
    }
}
