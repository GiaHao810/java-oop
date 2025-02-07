import Entity.Book;
import Entity.Library;
import Entity.Member;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Thêm sách vào thư viện
        Book book1 = new Book("Java Programming", "John Doe", "123456");
        Book book2 = new Book("Python Basics", "Jane Smith", "654321");
        library.addBook(book1);
        library.addBook(book2);

        // Thêm thành viên vào thư viện
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.addMember(member1);
        library.addMember(member2);

        // Hiển thị danh sách sách và thành viên
        library.displayBooks();
        library.displayMembers();

        // Mượn sách
        member1.borrowBook(book1);
        member2.borrowBook(book2);

        // Hiển thị lại danh sách sách sau khi mượn
        library.displayBooks();

        // Trả sách
        member1.returnBook(book1);

        // Hiển thị lại danh sách sách sau khi trả
        library.displayBooks();
    }
}