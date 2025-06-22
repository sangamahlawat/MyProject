import java.util.*;

public class Garrageservices {
    private Map<String,Customer> customerMap;
    private List<Service> availableservices;

    public Garrageservices() {
        this.customerMap = new HashMap<>();
        this.availableservices = new ArrayList<>();
        loadService();
    }
    public void loadService()
    {
        availableservices.add(new Service("carwassh",350));
        availableservices.add(new Service("oil",1500));
        availableservices.add(new Service("gair",3350));
        availableservices.add(new Service("servicefan",650));
        availableservices.add(new Service("modassh",3550));

    }
    public void addCustomer(String name,String phone,String carnumber,String carmodel)
    {
        Car car=new Car(carnumber,carmodel);
        Customer customer=new Customer(name,phone,car);
        customerMap.put(carnumber,customer);
    }
    public void createInvoice(String carnumer)
    {
        if (!customerMap.containsKey(carnumer) )
        {
            System.out.println("no customer "+carnumer);
            return;
        }

        Scanner sc=new Scanner(System.in);
        Customer customer=customerMap.get(carnumer);
        Invoice invoice=new Invoice(customer);

        System.out.println("Available Services");
        for (int i=0;i<availableservices.size();i++)
        {
            System.out.println((i+1)+" ."+availableservices.get(i).getName()+"$"+
                    availableservices.get(i).getPrice()
            );
        }
        while (true)
        {
            System.out.println("Enter choice to add as given and  end service Press 0");
            int choice=sc.nextInt();
            if (choice==0)
            {
                break;
            }
            if (choice>0&&choice<=availableservices.size())
            {
                invoice.addServices(availableservices.get(choice-1));
                System.out.println("service done");
            }
            else {
                System.out.println("Invalid");
            }
        }
        invoice.printInvoice();

    }
}
