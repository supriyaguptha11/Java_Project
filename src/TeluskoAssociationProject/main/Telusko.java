package TeluskoAssociationProject.main;

import TeluskoAssociationProject.service.ICourse;

public class Telusko
{
    private ICourse course;

    public Telusko(ICourse course)
    {
        this.course = course;
    }

    public Telusko()
    {

    }

    public void setCourse(ICourse course)
    {
        this.course = course;
    }

    public Boolean buyTheCourse(Double amount)
    {
        return course.getTheCourse(amount);
    }




}
