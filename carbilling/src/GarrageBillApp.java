import java.util.Scanner;

public class GarrageBillApp {
    public static void main(String[] args) {
        Garrageservices garrageservices=new Garrageservices();

        Scanner sc=new Scanner(System.in);
        System.out.println("------------------Bharti Car------------------");


        while (true)
        {
            System.out.println("1 to add customer");
            System.out.println("2 create invoice");
            System.out.println("3 end ");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter name");
                    String name=sc.next();
                    System.out.println("enter  phn");
                    String phone=sc.next();
                    System.out.println("carnmberr");
                    String carnumber=sc.next();
                    System.out.println("carmodel");
                    String carmodel=sc.next();
                    garrageservices.addCustomer(name,phone,carnumber,carmodel);
                    break;
                case 2:
                    System.out.println("enter car no");
                    String carno=sc.next();
                    garrageservices.createInvoice(carno);
                    break;
                case 3:
                    System.out.println("bye");
                    sc.close();
                    return;
                default:
                    System.out.println("Try Again");
            }
        }
    }
}
