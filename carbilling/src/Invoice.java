import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> servicelist;
    private double totalamount;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.servicelist = new ArrayList<>();
        this.totalamount = 0;
    }

    public void addServices(Service service)
    {
        servicelist.add(service);
        totalamount+=service.getPrice();
    }
    public void printInvoice()
    {
        System.out.println("---------Invoice---------");
        System.out.println(" *Customer\n "+customer.getName()+" \n *Phone Number \n "+customer.getPhone());
        System.out.println(" *car model\n "+customer.getCar().getCarmodel()+" \n *car number\n "+customer.getCar().getCarnumber());
        System.out.println(" \n*Services*\n ");
        for(Service service:servicelist)
        {
            System.out.println("#"+service.getName()+" $ "+service.getPrice());
        }
        System.out.println("total amount\n"+totalamount);
        System.out.println("---------Thank you---------");
    }
}
