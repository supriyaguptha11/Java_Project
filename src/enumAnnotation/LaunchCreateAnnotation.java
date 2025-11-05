package enumAnnotation;
// annotations which are used to create annotations are called meta annotations
// to create our own annotation we need to use @interface
//@ - this specifies compiler that annotation type is being created
// when ever you create an annotation 2 things need to specify
// 1. Target of the annotation (where it needs to be created - class/Instance variable/Local variable/ constructor/ setters etc).
//These 2 annotations — @Retention(RetentionPolicy.RUNTIME) and @Target(ElementType.TYPE)
// are meta-annotations in Java. That means they are annotations that are used to define the behavior of another annotation.


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME) // Keep annotation info at runtime. // Specifies how long the annotation information is retained.
@Target(ElementType.TYPE) // Specifies where this annotation can be applied(type,method,field, parameter etc)
@interface CricketPlayer
{
    String country();
    int age();

}
//@CricketPlayer
@CricketPlayer(country = "India", age = 35)  // created variables in interface 
class ViratKohli
{
    private int innings;

    public ViratKohli() {

    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}



public class LaunchCreateAnnotation {
    public static void main(String[] args) {
        ViratKohli vk = new ViratKohli();
        vk.setInnings(344);
        System.out.println(vk.getInnings());

    }
}
