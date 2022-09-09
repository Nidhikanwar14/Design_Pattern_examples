package Questions;

public class Library {
    String[] books;
    int no_of_books;

    public Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book +"has been added..");
    }
}


class Exercise61{
    public static void main(String[] args){
        Library book1 = new Library();
        book1.addbook("Pragamatic Programmer");
    }
}
