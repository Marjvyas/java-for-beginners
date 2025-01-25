package java_for_beginners.mini_projects;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println("Book added successfully...");
    }

    public void issueBook(String bookName) {
        if (books.remove(bookName)) {
            System.out.println("Book issued...");
        } else {
            System.out.println("Book not found...");
        }
    }

    public void returnBook(String bookName) {
        books.add(bookName);
        System.out.println("Book returned...");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available...");
        } else {
            System.out.println("Available books: " + books);
        }
    }
}

public class library_project{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        String name;

        while (true) {
            System.out.println("Choose one:");
            System.out.println("1) Add    2) Issue    3) Return    4) Show (0 to quit)");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    name = sc.nextLine();
                    library.addBook(name);
                    break;
                case 2:
                    System.out.print("Enter book name: ");
                    name = sc.nextLine();
                    library.issueBook(name);
                    break;
                case 3:
                    System.out.print("Enter book name: ");
                    name = sc.nextLine();
                    library.returnBook(name);
                    break;
                case 4:
                    library.showBooks();
                    break;
                default:
                    System.out.println("Enter a valid choice...");
            }
        }

        sc.close();
    }
}

