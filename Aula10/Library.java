package Aula10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, ArrayList<Book>> booksByGenre;

    public Library() {
        this.booksByGenre = new HashMap<>();
    }

    public void addBook(String genre, Book book) {
        if (!booksByGenre.containsKey(genre)) {
            booksByGenre.put(genre, new ArrayList<Book>());
        }
        booksByGenre.get(genre).add(book);
    }

    public void removeBook(String genre, Book book) {
        if (booksByGenre.containsKey(genre)) {
            booksByGenre.get(genre).remove(book);
        }
    }

    public void updateBook(String genre, Book oldBook, Book newBook) {
        if (booksByGenre.containsKey(genre)) {
            ArrayList<Book> books = booksByGenre.get(genre);
            int index = books.indexOf(oldBook);
            if (index != -1) {
                books.set(index, newBook);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String genre : booksByGenre.keySet()) {
            sb.append(genre).append(": ");
            for (Book book : booksByGenre.get(genre)) {
                sb.append(book.getTitle()).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Library library = new Library();

        // adicionar livros
        library.addBook("Drama", new Book("Hamlet", "William Shakespeare", 1603));
        library.addBook("Drama", new Book("Macbeth", "William Shakespeare", 1623));
        library.addBook("Romance", new Book("Pride and Prejudice", "Jane Austen", 1813));
        library.addBook("Science Fiction", new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979));
        library.addBook("Mystery", new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 1892));

        // listar livros por género
        System.out.println("Livros por género:\n" + library);

        // atualizar livro
        Book newHamlet = new Book("Hamlet", "W. Shakespeare", 1603);
        library.updateBook("Drama", new Book("Hamlet", "William Shakespeare", 1603), newHamlet);
        System.out.println("Livro atualizado: " + newHamlet);

        // remover livro
        library.removeBook("Drama", new Book("Macbeth", "William Shakespeare", 1623));
        System.out.println("Livro removido");

        // listar géneros
        System.out.println("Géneros: " + library.booksByGenre.keySet());

        // listar livros
        ArrayList<Book> allBooks = new ArrayList<Book>();
        for (ArrayList<Book> books : library.booksByGenre.values()) {
            allBooks.addAll(books);
        }
        System.out.println("Livros: " + allBooks);
    }
}
