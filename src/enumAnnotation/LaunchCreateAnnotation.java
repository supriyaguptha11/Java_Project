package enumAnnotation;
// annotations which are used to create annotations are called meta annotations
// to create our own annotation we need to use @interface
//@ - this specifies compiler that annotation type is being created
// when ever you create an annotation 2 things need to specify
// 1. Target of the annotation (where it needs to be created - class/Instance variable/Local variable/ constructor/ setters etc).
//These 2 annotations — @Retention(RetentionPolicy.RUNTIME) and @Target(ElementType.TYPE)
// are meta-annotations in Java. That means they are annotations that are used to define the behavior of another annotation.


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Keep annotation info at runtime. // Specifies how long the annotation information is retained.
//@Target(ElementType.TYPE) // Specifies where this annotation can be applied(type,method,field, parameter etc)
    // we can specify multiple targets
    @Target({ElementType.TYPE, ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,ElementType.FIELD,ElementType.METHOD})
// we can apply Cricket annotation to type, constructor, local variable, field, method

@interface CricketPlayer
{
   // String country();
     String country() default "India"; // if you set to default here then even if you can't specify in annotation also is not a problem
   // int age();
    int age() default 35;

}
//@CricketPlayer
//@CricketPlayer(country = "India", age = 35)  // created variables in interface
@CricketPlayer
class ViratKohli
{
    @CricketPlayer
    private int innings;
    @CricketPlayer
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

        System.out.println("******************");

        Class<? extends ViratKohli> c = vk.getClass();
        Annotation an = c.getAnnotation(CricketPlayer.class); //  information about this annotation
        CricketPlayer cp = (CricketPlayer) an;
        int age = cp.age();
        String country = cp.country();
        System.out.println("Information of attributes of annotations are " +age+ " " + country);

    }
}
