package basics;

enum Day2 {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;

        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;

            default:
                System.out.println("Unknown day");
        }
    }
}
//multiple cases are grouped in a single switch block using the same enum variable
