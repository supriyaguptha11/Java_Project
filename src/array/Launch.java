package array;

import java.sql.SQLOutput;

class Telusko1 {
    private String courseName;
    private int courseCost;
    private String city;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(int courseCost) {
        this.courseCost = courseCost;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Telusko1(String courseName, int courseCost, String city) {
        this.courseName = courseName;
        this.courseCost = courseCost;
        this.city = city;
    }

    public Telusko1() {
        super();
    }

    @Override
    public String toString() {
        return "Telusko1{courseName=" + courseName + ", courseCost=" + courseCost + ", city=" + city + "}";
    }
// or

//    @Override
//    public String toString() {
//        return "Telusko1{" +
//                "courseName=" + courseName +
//                ", courseCost=" + courseCost +
//                ", city=" + city  +
//                '}';
// }
    }


    public class Launch {
        public static void main(String[] args) {
            Telusko1 t = new Telusko1("SB", 3000, "Bengaluru");
            System.out.println(t); // it gives address of the object(Telusko1 class), it prints output only when you write tostring() and override parent as child class
//        System.out.println(t.getCourseName());
//        System.out.println(t.getCourseCost());
//        System.out.println(t.getCity());

        }


    }

