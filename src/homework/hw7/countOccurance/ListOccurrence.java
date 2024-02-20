package homework.hw7.countOccurance;

public class ListOccurrence {

    private String name;
    private int occurrence;

    public ListOccurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}
