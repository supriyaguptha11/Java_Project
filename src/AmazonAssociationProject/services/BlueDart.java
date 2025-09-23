package AmazonAssociationProject.services;

public class BlueDart implements DeliveryService
{
    @Override
    public Boolean deliverProduct(Double amount)
    {
        System.out.println("Product delivered through Blue Dart and amount paid is " + amount);
        return true;
    }
}
