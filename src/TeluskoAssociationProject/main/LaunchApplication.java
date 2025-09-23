package TeluskoAssociationProject.main;

import TeluskoAssociationProject.service.Java;
import TeluskoAssociationProject.service.SpringBoot;

public class LaunchApplication {
    public static void main(String[] args)
    {
       // Telusko.telusko = new Telusko(new SpringBoot()); both constructor injection and setter injection performed then setter executes
        Telusko telusko = new Telusko();
        telusko.setCourse(new Java());


        Boolean status = telusko.buyTheCourse(2500.0);
        if(status)
            System.out.println("Course purchased sucessfully");
        else
            System.out.println("Failed to buy the course");



    }
}
