package enumAnnotation;
// inside enum we can define another enum
// when ever you create an enum behind the scene it creates as
// public static final Result PASS = new Result();
// public static final Result FAIL = new Result();
// behind the scene it called 2 times for this program

enum Result
{
    PASS, FAIL;

//    enum Week
//    {
//        MON, TUE;
//    }

    int marks;

    Result()
    {
        System.out.println("Constructor of enum");
    }

    public int  getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}


public class LaunchEnum2 {
    public static void main(String[] args) {
//        Result result = Result.PASS;
//        result.setMarks(44);
//        System.out.println(result.getMarks());

// we can write in other way also

        Result.PASS.setMarks(44);
        int marks =  Result.PASS.getMarks();
        System.out.println(marks);


        int marks2 = Result.FAIL.getMarks();
        System.out.println(marks2);

    }
}
