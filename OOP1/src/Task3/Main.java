package Task3;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args) {
        Customer c1 = new Customer("Kasper","Nielsen", "knielsen");
        Customer c2 = new Customer("Bo","Hansen","bhansen");
        Customer c3 = new Customer ("Ulla","Hansen","uhansen");
        Customer c4 = new Customer ("Ella","Nielsen","enielsen");
        Customer c5 = new Customer ("Lis", "Kirkegaard", "lkirkegaard");
        Customer c6 = new Customer("Ole", "Kirkegaard","okirkegaard");

        Collections.addAll(customers,c1,c2,c3,c4,c5,c6);
        printCustomers();

    }
    public static void printCustomers(){
        for (Customer c: customers){
            System.out.println(c);
        }
    }
}