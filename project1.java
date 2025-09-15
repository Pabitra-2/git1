
import java.util.Scanner;
import javax.sql.rowset.spi.SyncFactory;

interface utility{
    public void get_details();
    public void set_details();
}
public class showroom implements  utility{
    public String showroom_name;

    public String showroom_address;

    public int  total_employe;

    public int total_car_in_stock=0;

    public String manager_name;

    public void get_details(){
        System.out.println("showroom_name"+ showroom_name);

        System.out.println("showroom_address"+ showroom_address);

        System.out.println("total_employe"+ total_employe);

        System.out.println("total_car_in_stock"+ total_car_in_stock);

        System.out.println("manager_name"+ manager_name);
    }

    public void set_details(){
        Scanner sc =new Scanner(System.in);
        System.out.println("=============*****ENTER SHOWROOM DETAILS*****=============");
        System.out.println("");

        System.out.println("showrooom name :");
        showroom_name=sc.nextLine();
        System.out.println("");

        System.out.println("showrooom address");
        showroom_address=sc.nextLine();
        System.out.println("");

        System.out.println("total employee");
        total_employe=sc.nextInt();
        System.out.println("");

        System.out.println("total car in stock");
        total_car_in_stock=sc.nextInt();
        System.out.println("");

        System.out.println("manager name");
        manager_name=sc.nextLine(  );
        System.out.println(  ); 

    }
}

public class employe extends showroom implements utility{

    String emp_id;

    String emp_name;

    int emp_age;

    String emp_department;


    public void get_details(){
        System.out.println("ID"+emp_id);
        System.out.println("Nmae:"+emp_name);
        System.out.println("Age:"+emp_age);
        System.out.println("Department"+emp_department);
        System.out.println("showroom Name"+ showroom_name);

    }

    public  void set_details(){

        Scanner sc =new Scanner(System.in);
        System.out.println("=============*****ENTER SHOWROOM DETAILS*****=============");
        System.out.println("");

        System.out.println("showrooom name :");
        showroom_name=sc.nextLine();
        System.out.println("");

        System.out.println("showrooom address");
        showroom_address=sc.nextLine();
        System.out.println("");

        System.out.println("total employee");
        total_employe=sc.nextInt();
        System.out.println("");

        System.out.println("total car in stock");
        total_car_in_stock=sc.nextInt();
        System.out.println("");
    }

}
public class car extends employe implements utility {
    String car_name;

    String car_colour;

    String car_fule_type;

    int car_price;

    String car_type;

    String car_transmission;


    public void get_details(){
            System.out.println("car_name:" + car_name);
            System.out.println("car_colour:" + car_colour);
            System.out.println("car_fule_type:"+car_fule_type);
            System.out.println("car_price:"+car_price);
            System.out.println("car_type:"+car_type);
            System.out.println("car_transmission:"+car_transmission);
    }
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("=============*****enter car details*****=============");
        System.out.println("");
        System.out.println("car name");
        car_name=sc.nextLine();
        System.out.println("");
        System.out.println("car colour");
        car_colour=sc.nextLine();
        System.out.println("");
        System.out.println("car fule type");
        car_fule_type=sc.nextLine();
        System.out.println("");
        System.out.println("car price");
        car_price=sc.nextInt();
        System.out.println("");
        System.out.println("car type");
        car_type=sc.nextLine();
        System.out.println("");
        System.out.println("car transmission");
        car_transmission=sc.nextLine();
        total_car_in_stock++;
        System.out.println("");
        System.out.println("=============*****car details added sucessfully*****=============");
        System.out.println("");

    }
    public class main{
        static  void main_menu(){
            System.out.println("=============*****WELCOME TO SHOWROOM MANAGEMENT SYSTEM*****===================");
            System.out.println("1.Add show room details");
            System.out.println("2.Add employe details");
            System.out.println("3.Add car details");
            System.out.println("4.show showroom details");
            System.out.println("5.show employe details");
            System.out.println("6.show car details");
            System.out.println("7.exit");
            
        }
    }
public class project1{
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // here we can create objecte of showrooom in array because by the help of array we can not create multipule object of  showeoom it store in array foramt
        showroom s[]=new showroom[10];
        employe e[]=new employe[10];
        car c[]=new car[10];
        
        // here we use intial all value 0 because we can pass array value in limit to show how much we object create we count it
        int showroom_counter=0;
        int employe_counter=0;
        int car_counter=0;

        int choice=100;
        
        while(choice!=0){
            main_menu();
            choice=sc.nextInt();

            while(choice!=8 && choice!=0){
                switch(choice){
                    case 1:
                    s[showroom_counter]=new showroom();
                    s[showroom_counter].set_details();
                    showroom_counter++;
                    break;
                    case 2:
                    e[employe_counter]=new employe();
                    e[employe_counter].set_details();
                    employe_counter++;
                    break;
                    case 3:
                    c[car_counter]=new car();
                    c[car_counter].set_details();
                    car_counter++;
                    break;
                    case 4:
                    System.out.println("=============*****showroom details*****===============");
                    for (int i=0;i<showroom_counter;i++){
                        s[i].get_details();
                    }
                    break;
                    case 5:
                    System.out.println("=============*****employe details*****===============");
                    for (int i=0;i<employe_counter;i++){
                        s[i].get_details();
                    }
                    break;
                    case 6:
                    System.out.println("=============*****car details*****===============");
                    for (int i=0;i<car_counter;i++){
                        s[i].get_details();
                    }
                    break; 

            }
        }

        
    }

}