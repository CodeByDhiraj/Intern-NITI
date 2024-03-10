//Intern NITI Internship
//Domain Name -> Java Programming
//Task 2 -> (LibraryManagementSystem)
//Intern Name -> Dhiraj Kumar


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static Map<Integer, String> libraryRecords = new HashMap<>();
    private static int currentId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("---------------Welcome To The Library Management System Menu:!---------------\n");
            //System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Update Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Show All Records");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateRecord();
                    break;
                case 3:
                    deleteRecord();
                    break;
                case 4:
                    showAllRecords();
                    break;
                case 0:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        libraryRecords.put(currentId, title);
        currentId++;
        System.out.println("Book added successfully!");
    }

    private static void updateRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the record ID to update: ");
        int id = scanner.nextInt();
        if (libraryRecords.containsKey(id)) {
            System.out.print("Enter the updated book title: ");
            String updatedTitle = scanner.next();
            libraryRecords.put(id, updatedTitle);
            System.out.println("Record updated successfully!");
        } else {
            System.out.println("Record ID not found.");
        }
    }

    private static void deleteRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the record ID to delete: ");
        int id = scanner.nextInt();
        if (libraryRecords.containsKey(id)) {
            libraryRecords.remove(id);
            System.out.println("Record deleted successfully!");
        } else {
            System.out.println("Record ID not found.");
        }
    }

    private static void showAllRecords() {
        System.out.println("\nLibrary Records:");
        for (Map.Entry<Integer, String> entry : libraryRecords.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Title: " + entry.getValue());
        }
    }
}
