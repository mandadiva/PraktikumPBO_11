package praktikum11;

public class Buku {
    private String judul;
    private String isbn;

    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }

    public void infoBuku() {
        System.out.println("Judul: " + judul + ", ISBN: " + isbn);
    }
}
