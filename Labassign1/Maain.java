public class Maain {
    public static void main(String[] args) {
        // Creating a library
        Library lib = new Library();
        // Adding some books by Pakistani authors to the library
        Book book1 = new Book("Moth Smoke", "Mohsin Hamid", 2000, 247);
        Book book2 = new Book("The Reluctant Fundamentalist", "Mohsin Hamid", 2007, 184);
        Magazine magazine1 = new Magazine("Dastaan-e-Pakistan", "History Dept", 2022, 5);
        lib.addItem();
        //lib.addItem();
        //lib.addItem();
        // Borrowing a book
        lib.borrowItem();
    
        // Displaying available and borrowed items
        System.out.println("Available Items:");
        lib.displayAvailableItems();
        System.out.println("\nBorrowed Items:");
        lib.displayBorrowedItems();
        // Returning a book
        lib.returnItem();
        System.out.println("\nAfter returning 'Moth Smoke':");
        System.out.println("Available Items:");
        lib.displayAvailableItems();
        System.out.println("\nBorrowed Items:");
        lib.displayBorrowedItems();
        }
    }
    
    
    
