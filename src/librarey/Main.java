package librarey;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<LibraryItem> items = new ArrayList<>();

        System.out.print("How many returned items? ");
        int numberOfItems = input.nextInt();

        // Enter all items
        for (int i = 1; i <= numberOfItems; i++) {

            System.out.print("Item " + i + " - type (B/D): ");
            String type = input.next().toUpperCase();

            System.out.print("Item " + i + " - title: ");
            String title = input.next();

            System.out.print("Item " + i + " - days late: ");
            int daysLate = input.nextInt();

            if (type.equals("B")) {

                BookItem book = new BookItem(title, daysLate);
                items.add(book);

            } else if (type.equals("D")) {

                DVDItem dvd = new DVDItem(title, daysLate);
                items.add(dvd);

            } else {
                System.out.println("Invalid item type.");
                i--;
            }
        }

        // Display summary
        System.out.println();
        System.out.println("--- LIBRARY FINE SUMMARY ---");
        System.out.println();

        long totalFine = 0;

        for (LibraryItem item : items) {

            long fine = item.calculateFine();

            System.out.println(
                    item.getTitle() + ": " + fine + " units"
            );

            totalFine = totalFine + fine;
        }

        System.out.println();
        System.out.println("Total fines: " + totalFine + " units");

        input.close();
    }
}