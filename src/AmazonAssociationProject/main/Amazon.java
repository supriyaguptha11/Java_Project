package AmazonAssociationProject.main;

import AmazonAssociationProject.services.DeliveryService;

public class Amazon
{
    private DeliveryService service;

    public Amazon(DeliveryService service)
    {
        this.service = service;
    }

    public void setService(DeliveryService service) // DeliveryService service = new FedEx();
    {
        this.service = service;
    }

    public Amazon()
    {

    }

    public Boolean deliverTheProduct(Double amount)
    {
        return service.deliverProduct(amount);

//        Boolean status = fed.deliverproduct(amount);
//        return status;



}
}
