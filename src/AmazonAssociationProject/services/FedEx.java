package AmazonAssociationProject.services;

public class FedEx implements DeliveryService
{
    public Boolean deliverProduct(Double amount)
    {
        System.out.println("Product delivered through FedEx and amount paid is " + amount);
        return true;
    }
}
