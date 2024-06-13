import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Menu Perpustakaan =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;
                case 4:
                    System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
