package praktikum11;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        if (bukuList.isEmpty()) {
            System.out.println("Tidak ada buku dalam perpustakaan.");
        } else {
            System.out.println("Daftar Buku dalam Perpustakaan:");
            for (Buku buku : bukuList) {
                buku.infoBuku();
            }
        }
    }
}
