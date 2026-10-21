package librarey;

class DVDItem extends LibraryItem {

    public DVDItem(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public long calculateFine() {
        if (daysLate == 0) {
            return 0;
        } else {
            return 10L + 5L * daysLate;
        }
    }
}