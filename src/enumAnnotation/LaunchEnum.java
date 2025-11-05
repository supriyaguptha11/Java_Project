package enumAnnotation;
// MON - ITSELF IS A VARIABLE AND ITSELF IS A VALUE same for all
// ordinal method is used to print indexes
// values(); - this method gives how much enums are have, and it will return the array
enum Week
{
    // mon,tue,wed,thu,fri,sat,sun // this is not recommended use uppercase
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
public class LaunchEnum {
    public static void main(String[] args) {
       Week week = Week.MON;
        System.out.println(week);

        int index = Week.THU.ordinal(); // ordinal method is used to print indexes
        System.out.println(index);  // 3 --> index

        Week[] weekAr = Week.values(); // this method gives how much enums are have, and it will return the array

        for(Week w:weekAr)
        {
            System.out.println(w.ordinal()+ "  ->  " + w);
        }

    }
}
