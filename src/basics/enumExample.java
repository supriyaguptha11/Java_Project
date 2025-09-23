package basics;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class enumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Rest day!");
                break;
            default:
                System.out.println("Weekday");
        }
    }
}
