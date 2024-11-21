package Soal;

public class Buku {
    private String judul;
    private Pengarang pengarang;
    
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public void infoBuku() {
        System.out.println("Judul: " + judul);
        pengarang.infoPengarang();
    }
}
