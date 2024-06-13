public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("Buku sudah dipinjam.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("Buku belum dipinjam.");
        }
    }

    @Override
    public String toString() {
        return "Judul: " + title + ", Penulis: " + author + ", Status: " + (isBorrowed ? "Dipinjam" : "Tersedia");
    }
}
