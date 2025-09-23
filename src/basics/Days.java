package basics;

enum Day1 {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

 class Days {
    public static void main(String[] args) {
        for (Day today : Day.values()) {
            switch (today) {
                case MONDAY:
                    System.out.println(today + ": Start of the week!");
                    break;
                case FRIDAY:
                    System.out.println(today + ": Almost weekend!");
                    break;
                case SUNDAY:
                    System.out.println(today + ": Rest day!");
                    break;
                default:
                    System.out.println(today + ": Weekdays");
            }
        }
    }
}
// print all days using for loop