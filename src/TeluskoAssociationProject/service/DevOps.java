package TeluskoAssociationProject.service;

public class DevOps implements ICourse{
    public Boolean getTheCourse(Double amount)
    {
        System.out.println("DevOps course purchased and the price paid is " + amount);
        return true;
    }
}
