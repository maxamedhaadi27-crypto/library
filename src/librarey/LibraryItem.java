package librarey;
abstract class LibraryItem {

    protected String title;
    protected int daysLate;

    // No-argument constructor
    public LibraryItem() {
        title = "Unknown";
        daysLate = 0;
    }

    // Parameterized constructor
    public LibraryItem(String title, int daysLate) {
        this();
        this.title = title;
        this.daysLate = daysLate;
    }

    // Getter method
    public String getTitle() {
        return title;
    }

    // Abstract method
    public abstract long calculateFine();
}