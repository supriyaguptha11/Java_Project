package AmazonAssociationProject.main;

// Injecting dependent object/dependency into target class is called as dependency injection
// if this is done through setter we call as setter injection
// if this is done trough constructor its called as constructor injection
// target class/object ==> a class where services of other classes are being used
// ex: in this project is ==> Amazon class
// dependent object/class ==> a class whose services will be used in target class
// ex: in this project is  ==> FirstFlight, FedEx, BlueDart



import AmazonAssociationProject.services.BlueDart;
import AmazonAssociationProject.services.FedEx;
import AmazonAssociationProject.services.FirstFlight;

public class LaunchAmazon {
    public static void main(String[] args)
    {
        // firstflight, bluedart,fedex are dependent objects
        // dependent object to the target class Amazon through constructor called as constructor injection
        Amazon amz = new Amazon(new FirstFlight());   // Im injecting FirstFlight(); to the target class Amazon this is called dependency injection
        FedEx fedEx = new FedEx();     //creating the object and passing the reference/object address
        amz.setService(fedEx);

        amz.setService(new FedEx());  // directly passing the reference/address
        amz.setService(new BlueDart());  // setter injection , through setter im injecting the dependency




        Boolean status = amz.deliverTheProduct(4545.4);
        if(status)
            System.out.println("Product Delivery Sucessfull");
        else
            System.out.println("Failed to Deliver Product");

    }
}
